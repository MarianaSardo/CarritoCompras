package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaProductos {

    private HashMap<Integer, Producto> productos = new HashMap<>();

    public ListaProductos() {
    }

    public HashMap<Integer, Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) throws OperacionInvalidaException {
        if (!productos.containsKey(p.getCodigo())) {
            productos.put(p.getCodigo(), p);
        }
        else{
            throw new OperacionInvalidaException("Ya existe el producto", "error");
        }

    }

    public void borrarProducto(Producto p) {
        if (productos.containsValue(p)) {
            productos.remove(p.getCodigo(), p);
        }

    }

    public Producto buscarProducto(int codigo) {

        Producto c = productos.get(codigo);
        return c;

    }

    public String productostoString() {

        String rta = "";

        Iterator<Map.Entry<Integer, Producto>> it = productos.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<Integer, Producto> new_Map = (HashMap.Entry<Integer, Producto>) it.next();

            rta += (new_Map.getValue() + "\n");
        }
        return rta;
    }

    public String productosPorCatestoString(Categoria c) {

        String rta = "";

        Iterator<Map.Entry<Integer, Producto>> it = productos.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<Integer, Producto> new_Map = (HashMap.Entry<Integer, Producto>) it.next();

            if (new_Map.getValue().getCategoria().equals(c)) {
                rta += (new_Map.getValue() + "\n");
            }

        }
        return rta;
    }

    public boolean contieneCategoria(Categoria c) {

        boolean rta = false;

        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Integer key = entry.getKey();
            Producto value = entry.getValue();

            if (value.getCategoria().equals(c)) {

                rta = true;
            }

        }

        return rta;
    }

}
