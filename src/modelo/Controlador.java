package modelo;

public class Controlador {

    private ListaUsuarios listaUsuarios = new ListaUsuarios();
    private ListaProductos listaProductos = new ListaProductos();
    private ListaCategorias listaCategorias = new ListaCategorias();
    private ListaPedidos listaPedidos = new ListaPedidos();
    private Moneda moneda;


    public Controlador() {
        try {
            listaUsuarios.agregarUser(new UsuarioAdmin("admin", "admin", "admin"));
        } catch (OperacionInvalidaException ex) {
            System.out.println("El admin ya existe");
        }
    }

    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public void setListaUsuarios(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ListaProductos getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaProductos listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ListaCategorias getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ListaCategorias listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ListaPedidos getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
   

}
