package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Daniel Santiago Niño Mendez
 */
public class TransportistaDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id se utilizara en este metodo
     * @return devuelve una lista llamada cli con la informacion de la base de datos
     */
    public List consultarClienteById(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from transportista where Id=?";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    }

    /**
     *
     * @param nombre lo utilizaremos en este metodo de consulta
     * @return devuelve la listaconsultada por el nombre
     */
    public List consultarClienteByNombre(String nombre){
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from transportista where nombre like '%" + nombre + "%'";
    cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }

    /**
     *
     * @return devuelve una lista completa de la base de datos
     */
    public List mostrarCliente( ){
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from transportista";
    cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }

   
     
    /**
     *
     * @param id se usara para agregar un registro con su respectiva identificacion
     * @return  una lista de registros con una identificacion predeterminada
     */
    public List cargarClientebyId(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
   String sql="select * from transportista where Id= " + id;
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
    }
}

