package models;

/**
 *
 * @author Daniel Santiago Niño Mendez
 */
public class Transportista {
    private int Id;
    private String Placa;
    private String Nombre;
    private String Apellido;
    private String Telefono;

    /**
     *
     */
    public Transportista() {
    }

    /**
     *
     * @param Id usado para registrar, borrar, actualizar y consultar datos en la BD
     * @param placa usado para registrar, borrar, actualizar y consultar datos en la BD
     * @param nombre usado para registrar, borrar, actualizar y consultar datos en la BD
     * @param apellido usado para registrar, borrar, actualizar y consultar datos en la BD
     * @param telefono usado para registrar, borrar, actualizar y consultar datos en la BD
     */
    public Transportista(int Id, String placa, String nombre, String apellido, String telefono) {
        this.Id=Id;
        this.Placa = placa;
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Telefono = telefono;
    }

    /**
     *
     * @return Id
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @return Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     *
     * @param Placa
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     *
     * @return Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @return Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     *
     * @param Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     *
     * @return Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     *
     * @param Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     *
     * @param aInt
     */
    public void SetId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  }
