package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class ListaUsuarios {

    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUser(Usuario p) throws OperacionInvalidaException {

        if (!usuarios.containsKey(p.getUser())) {

            usuarios.put(p.getUser(), p);

        } else {
            throw new OperacionInvalidaException("Ya existe el usuario", "error");
        }

    }

    public String usertoString() {

        String rta = "";

        Iterator<Map.Entry<String, Usuario>> it = usuarios.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<String, Usuario> new_Map = (HashMap.Entry<String, Usuario>) it.next();

            rta += (new_Map.getValue() + "\n");
        }
        return rta;

    }

    public void borrarUsuario(Usuario p) {
        if (usuarios.containsValue(p)) {
            usuarios.remove(p.getUser(), p);
        }

    }

    public Usuario buscarUsuario(String usuario) {

        Usuario u = usuarios.get(usuario);
        return u;

    }
    
    

    public Usuario login(String user, String pass) {

        Usuario u = usuarios.get(user);
        
        if (u != null && u.isPassword(pass)) {
            return u;

        } else {
            return null;
        }

    }

    public boolean esCUIT(String cuit) {
        try {
            if (cuit.length() != 11) {
                return false;
            }
            String[] cuitArray = cuit.split("");
            Integer[] serie = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
            Integer aux = 0;
            for (int i = 0; i < 10; i++) {
                aux += Integer.valueOf(cuitArray[i]) * serie[i];
            }
            aux = 11 - (aux % 11);
            if (aux == 11) {
                aux = 0;
            } else if (aux == 10) {
                aux = 9;
            }
            return Objects.equals(Integer.valueOf(cuitArray[10]), aux);

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean esTelefono(String telefono) {
        try {
            if (Long.parseLong(telefono) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean nombreCorrecto(String nombre) {
        return nombre.matches("[a-zA-Z ]*");
    }

    public boolean localidadCorrecta(String localidad) {
        return localidad.matches("[a-zA-Z ]*");
    }

}
