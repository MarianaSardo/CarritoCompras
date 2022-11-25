package modelo;



public class LineaDePedido {

    private Producto prod;
    private int cantidad;

    public LineaDePedido(Producto prod, int cantidad) {
        this.prod = prod;
        this.cantidad = cantidad;
    }

    public LineaDePedido() {
    }

    
    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public String toString() {
   
        return "*Producto: " + prod.getNombre() + "- Cantidad:" + cantidad + '\n';
    }
    
    

    
    

    
}
