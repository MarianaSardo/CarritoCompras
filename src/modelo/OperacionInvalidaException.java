package modelo;


public class OperacionInvalidaException extends Exception {
 String motivo;

    public OperacionInvalidaException(String motivo,String message) {
        super(message);
        this.motivo = motivo;
    }

    public OperacionInvalidaException() {
    }

  

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    
   
    
}
