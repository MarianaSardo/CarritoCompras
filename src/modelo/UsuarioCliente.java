package modelo;


public class UsuarioCliente extends Usuario {
    private String nombre;
    private String localidad;
    private String direccion;
    private String telefono;

    public UsuarioCliente(String nombre, String localidad, String direccion, String telefono, String user, String password, String tipoUser) {
        super(user, password, tipoUser);
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

   
    
    
    public UsuarioCliente() {
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }


    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "• Cliente: " +"-Cuit: " + getUser() + " -Nombre: " + nombre + " -Localidad: " + localidad + " -Dirección: " + direccion + " -Telefono: " + telefono + '\n';
    }
    
    

}
