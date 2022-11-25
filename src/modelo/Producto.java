package modelo;


public class Producto{
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String descripcion, Categoria categoria, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

   
    public boolean hayStock(int cant){
       
    return stock-cant>=0;
    
            }
    
    public double subtotal(int cant){
        
        return precio*cant;
    
    }
    

    @Override
    public String toString() {
        return "•Cod. " + codigo + " -" + nombre + " (" + descripcion + ") -Categoria: " + categoria.getNombre() + " -Stock: " + stock;
    }
   
    
    
    

}
