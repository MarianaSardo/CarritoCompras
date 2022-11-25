package modelo;

import java.util.Objects;

public class Usuario  {

  
    private String user; 
    private String tipoUser;
    private int hashPassword;

    public Usuario() {
    }

    public Usuario(String user, String password, String tipoUser) {
        this.user = user;
        this.tipoUser = tipoUser;
        this.hashPassword = password.hashCode();
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    
    public void setHashPassword(int hashPassword) {
        this.hashPassword = hashPassword;
    }
    
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {

        this.hashPassword = password.hashCode();
    }

    public int getHashPassword() {
        return hashPassword;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }


    public boolean isPassword(String pass) {

        int p = pass.hashCode();

        if (this.hashPassword == p) {
            return true;
       }
        else
            return false;
    }
    
    
     public boolean isUser(String u) {


        if (this.user.equals(u)) {
            return true;
       }
        else
            return false;
    }
  

    @Override
    public String toString() {
        return "•" + user + '\n';
    }


   
}
