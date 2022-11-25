package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrito {

    private UsuarioCliente cliente;
    private double total;
    ArrayList<LineaDePedido> ldp = new ArrayList<>();

    public Carrito(UsuarioCliente cliente, ArrayList ldp, double total) {
        this.cliente = cliente;
        this.ldp = ldp;
        this.total = total;
    }

    public Carrito() {

    }

    public UsuarioCliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(ArrayList<LineaDePedido> linea) {

        double t = 0;

        for (LineaDePedido lineadepedido : linea) {

            t = t + (lineadepedido.getProd().subtotal(lineadepedido.getCantidad()));

        }

        this.total = t;

    }

    public void setCliente(UsuarioCliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaDePedido> getLdp() {
        return ldp;
    }

    public void setLdp(ArrayList<LineaDePedido> ldp) {
        this.ldp = ldp;
    }
    
     
    public void vaciarCarrito(){

        for (int i = 0; i < ldp.size(); i++) {
          ldp.remove(i);
        }
    
    }

    @Override
    public String toString() {
        return "\n-Cliente CUIL: " + cliente.getUser() + "\n-Linea de pedido: " + '\n' + ldp + '\n';
    }

}
