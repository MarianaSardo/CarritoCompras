
package modelo;

public class Pedido {
    
    private Carrito carrito;
    private PedidoEstado estado;
    private int idPedido;

    public Pedido() {
    }

    public Pedido(int id, Carrito carrito) {
        this.idPedido=id;
        this.carrito = carrito;
        this.estado=PedidoEstado.INGRESADO;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    
    @Override
    public String toString() {
        return "•Pedido nro.: " + idPedido +" - Estado: " + estado + '\n' + carrito;
    }
    
    
    
    
    
    
}
