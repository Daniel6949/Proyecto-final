package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Santiago Mendez
 */
public class TransportistaDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id
     * @return
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
     * @param nombre
     * @return
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
     * @return
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
     * @param id
     * @return
     */
    public List agregarCliente(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "insert into transportista (id,placa,nombre,apellido,telefono) values (?,?,?,?,?) ";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    }

    /**
     *
     * @return
     */
    public List actCliente(){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
   String sql = "UPDATE transportista SET id = ?, placa = ?, nombre = ? , apellido = ? ,telefono = ?" + "WHERE id = ? "; 
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
    }
     
    /**
     *
     * @return
     */
    public List borrarCliente(){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "delete from transportista where id = ? ";
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
    }
     
    /**
     *
     * @param id
     * @return
     */
    public List cargarClientebyId(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
   String sql="select * from transportista where Id= " + id;
    cli = this.jdbcTemplate.queryForList(sql);
    return cli;
    }
}

