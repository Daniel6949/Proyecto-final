package controller;

import dao.ConectarDB;
import dao.TransportistaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.Transportista;
import models.TransportistaValidation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Daniel Santiago Niño Mendez
 */
@Controller
public class homeController {
    private JdbcTemplate jdbcTemplate;

TransportistaValidation
        cliValidar;

    /**
     *
     */
    public homeController() {
        this.cliValidar=new TransportistaValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    /**
     *
     * @return un formulario de ingreso
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        Transportista transportista = new Transportista();        
        mav.addObject("transportista",transportista);
        mav.setViewName("views/formCliente");
        return mav;
    }
    
    /**
     *
     * @return un listado de datos registrados en la base de datos
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.POST)
    public ModelAndView mostrarCliente(){
        ModelAndView mav = new ModelAndView();
        String sql = "select * from transportista";
        
        List datos = this.jdbcTemplate.queryForList(sql);

        mav.addObject("transportista",datos);
        mav.setViewName("views/mostrarCliente");
        return mav;
    }

    /**
     *
     * @return un formulario para consultar y enlistar un transportista por nombre
     */
    @RequestMapping(value="formConsultarCliente.htm", method=RequestMethod.GET)
    public ModelAndView listarClientesxNombre(){
        ModelAndView mav = new ModelAndView();
        Transportista transportista = new Transportista();   
        mav.addObject("transportista", new Transportista());
        mav.setViewName("views/formConsultarCliente");
        return mav;
    }

    /**
     *
     * @param cli usado para enlazar con la lista de datos registrados
     * @param result se usa para validar los resultados que se esperan
     * @param status usado para limpiar la sesion en caso de que no hayan errores 
     * @return una lista por el nombre de los datos registrados
     */
    @RequestMapping(value="formConsultarCliente.htm", method=RequestMethod.POST)
    public ModelAndView listarClientesxNombre(
            @ModelAttribute ("transportista")Transportista cli,
            BindingResult result,
            SessionStatus status){
        ModelAndView mav = new ModelAndView();
        TransportistaDao traDao = new TransportistaDao();
        String nom = cli.getNombre();
        System.out.println("nombre:"+nom);
        mav.addObject("transportista",traDao.consultarClienteByNombre(nom));
        mav.setViewName("views/listarClientes");
        return mav;
    }

    
    
//------------------ metodo para agregar los datos del cliente ------------------    

    /**
     *
     * @return un formulario para ingresar un nuevo registro
     */
        @RequestMapping(value="agregarCliente.htm", method=RequestMethod.GET)
    public ModelAndView cargarCliente(){
        ModelAndView mav = new ModelAndView();
//        Cliente cliente = new Cliente();   
         mav.addObject("transportista", new Transportista());
        mav.setViewName("views/agregarCliente");
        return mav;
    }
    
    /**
     *
    * @param cli usado para enlazar con la lista de datos registrados
     * @param result se usa para validar los resultados que se esperan
     * @param status usado para limpiar la sesion en caso de que no hayan errores
     * @return al formulario de inicio
     */
    @RequestMapping(value="agregarCliente.htm", method=RequestMethod.POST)
    public ModelAndView agregarCliente(
            @ModelAttribute("cliente") Transportista cli, 
            BindingResult result,
            SessionStatus status){
        this.cliValidar.validate(cli, result);
        if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("cliente", new Transportista());
            mov.setViewName("views/agregarCliente");
            return mov;
        }else{
        ModelAndView mav = new ModelAndView();
        String sql = "insert into transportista (id,placa,nombre,apellido,telefono) values (?,?,?,?,?) ";
        this.jdbcTemplate.update(
                sql,cli.getId(), cli.getPlaca(), cli.getNombre(), cli.getApellido() , cli.getTelefono());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
    }
    
 //------------------- metodo para actualiar los datos del cliente --------------
    /*@RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from transportista where id = ? ";
        List datos = this.jdbcTemplate.queryForList(sql,id);
        mav.addObject("cli", datos);
        mav.setViewName("views/actCliente");
        return mav;
    }
    @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
    public ModelAndView actCliente( Transportista cli ){
     ModelAndView mav = new ModelAndView();
        String sql = "UPDATE transportista SET id = ?, placa = ?, nombre = ? , apellido = ? ,telefono = ?" + "WHERE id = ? ";
        this.jdbcTemplate.update(
                sql,cli.getId(), cli.getPlaca(), cli.getNombre(), 
                    cli.getApellido(), cli.getTelefono(), cli.getId());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }*/

    /**
     *
     * @param request usado para proporcionar informacion registrada
     * @return un formulario con los datos registrados para su actualizacion
     */
    
    
    @RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
       Transportista cli = this.cargarClientebyId(id); 
        mav.addObject("cliente", new Transportista (id,cli.getPlaca(),cli.getNombre(), cli.getApellido(),cli.getTelefono()));
        mav.setViewName("views/actCliente");
        return mav;
    }

    /**
     *
     * @param cli usado para enlazar con la lista de datos registrados
     * @param result se usa para validar los resultados que se esperan
     * @param status usado para limpiar la sesion en caso de que no hayan errores
     * @return al formulario inicial
     */
    @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
        public ModelAndView actCliente(
            @ModelAttribute ("cliente") Transportista cli,
            BindingResult result,
            SessionStatus status
    ){
        this.cliValidar.validate(cli,result);
        if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("cliente", new Transportista());
            mov.setViewName("views/actCliente");
            return mov;
        }else{
            ModelAndView mav = new ModelAndView();
          String sql = "UPDATE transportista SET id = ?, placa = ?, nombre = ? , apellido = ? ,telefono = ?" + "WHERE id = ? "; 
                     
        
            this.jdbcTemplate.update(
                    sql,cli.getId(), cli.getPlaca(), cli.getNombre(), 
                    cli.getApellido(), cli.getTelefono(), cli.getId());
            mav.setViewName("redirect:/formCliente.htm");
            return mav;
        }
    }
    
        
//------------ metodo para eliminar un campo de la tabla +---------------------

    /**
     *
     * @param request usado para proporcionar informacion registrada
     * @return al formulario inicial
     */
        @RequestMapping("borrarCliente.htm")
    public ModelAndView borrarCliente(HttpServletRequest request ){
     ModelAndView mav = new ModelAndView();
     int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from transportista where id = ? ";
        this.jdbcTemplate.update(sql,id);
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }

    /**
     *
     * @param id usado para obtener los datos que se van a actualizar
     * @return los datos a actualizar
     */
    public Transportista cargarClientebyId(int id){
final Transportista cli= new Transportista();
String sql="select*from transportista where Id= " + id;
return(Transportista) jdbcTemplate.query(sql,new ResultSetExtractor<Transportista>() 
{ public Transportista extractData(ResultSet rs)throws SQLException,DataAccessException{
if(rs.next()){
cli.setId(rs.getInt("Id"));
cli.setPlaca(rs.getString("Placa"));
cli.setNombre(rs.getString("Nombre"));
cli.setApellido(rs.getString("Apellido"));
cli.setTelefono(rs.getString("Telefono"));
}
return cli;
}});
} 

    /**
     *
     * @return una lista de los datos consultados
     */
    @RequestMapping(value="listar.htm", method=RequestMethod.GET)
    public ModelAndView listarClientesxId(){
    ModelAndView mav = new ModelAndView();
    Transportista cliente = new Transportista();
    mav.addObject("cliente",cliente);
    mav.setViewName("views/listarClientes");
    return mav;
    }


}