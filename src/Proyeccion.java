public abstract class Proyeccion {

    private String titulo;
    private double precioBase;

    public Proyeccion(String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Proyección: " + titulo + " (Base: " + precioBase + "€)";
    }
}
