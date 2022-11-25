package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaPedidos {

    private HashMap<Integer, Pedido> pedidos = new HashMap<>();

    public HashMap<Integer, Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashMap<Integer, Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido p) throws OperacionInvalidaException {
        if (!pedidos.containsKey(p.getIdPedido())) {
            pedidos.put(p.getIdPedido(), p);
        }
        else{
            throw new OperacionInvalidaException("Ya existe el pedido", "error");
        }
    }

    public void eliminarPedido(Pedido p) {
        if (pedidos.containsValue(p)) {
            pedidos.remove(p.getIdPedido(), p);
        }

    }

    public Pedido buscarPedido(int idPedido) {

        Pedido p = pedidos.get(idPedido);
        return p;

    }

    public String pedidotoString() {

        String rta = "";

        Iterator<Map.Entry<Integer, Pedido>> it = pedidos.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<Integer, Pedido> new_Map = (HashMap.Entry<Integer, Pedido>) it.next();

            rta += (new_Map.getValue() + "\n");
        }
        return rta;

    }

    public String pedidoPorClientetoString(UsuarioCliente u) {

        String rta = "";

        Iterator<Map.Entry<Integer, Pedido>> it = pedidos.entrySet().iterator();

        while (it.hasNext()) {

            HashMap.Entry<Integer, Pedido> new_Map = (HashMap.Entry<Integer, Pedido>) it.next();

            if (new_Map.getValue().getCarrito().getCliente().equals(u)) {
                rta = rta + (new_Map.getValue() + "\n");
            }

        }
        return rta;

    }

    public int ultimoId() {

        int max = 0;

        for (Map.Entry<Integer, Pedido> entry : pedidos.entrySet()) {
            if (entry.getKey() > max) {
                max = entry.getKey();
            }
        }
        return max;
    }

}
