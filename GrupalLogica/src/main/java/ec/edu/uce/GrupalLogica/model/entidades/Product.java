package ec.edu.uce.GrupalLogica.model.entidades;



public class Product {

    private Long id;
    private String nombre;
    private double precio;
    private String estado; // Estado del producto en la línea de producción

    private ProductFinal productFinal;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProductFinal getProductFinal() {
        return productFinal;
    }

    public void setProductFinal(ProductFinal productFinal) {
        this.productFinal = productFinal;
    }
}
