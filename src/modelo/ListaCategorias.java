package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaCategorias {

    private HashMap<String, Categoria> categorias = new HashMap<>();

    public HashMap<String, Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashMap<String, Categoria> categorias) {
        this.categorias = categorias;
    }

    public void agregarCategoria(Categoria p) throws OperacionInvalidaException {

        if (!categorias.containsKey(p.getNombre())) {
            categorias.put(p.getNombre(), p);
        }
        else{
          throw new OperacionInvalidaException("Ya existe la categoria", "error");
        }

    }

    public void borrarCategoria(Categoria p) {
        if (categorias.containsValue(p)) {
            categorias.remove(p.getNombre(), p);
        }

    }

    public Categoria buscarCategoria(String cate) {

        Categoria c = categorias.get(cate);
        return c;

    }

    public String categoriatoString() {

        String rta = "";

        Iterator<Map.Entry<String, Categoria>> it = categorias.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry<String, Categoria> new_Map = (HashMap.Entry<String, Categoria>) it.next();

            rta += (new_Map.getValue() + "\n");
        }
        return rta;
    }

}
