package models;

/**
 *
 * @author Santiago Mendez
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
     * @param Id
     * @param placa
     * @param nombre
     * @param apellido
     * @param telefono
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
