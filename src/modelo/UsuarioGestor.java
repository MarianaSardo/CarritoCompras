package modelo;


public class UsuarioGestor extends Usuario {
    private String nombre;
    private String telefono;

    public UsuarioGestor(String nombre, String telefono, String user, String password, String tipoUser) {
        super(user, password, tipoUser);
        this.nombre = nombre;
        this.telefono = telefono;
    }

   

    
    public UsuarioGestor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  

  
    @Override
    public String toString() {
        return "•Gestor: " + "-Cuil: " + getUser() + " -Nombre: " + nombre + " -Telefono: " + telefono + '\n';
    }

 
    
}
