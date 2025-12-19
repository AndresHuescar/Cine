public class Proyeccion3D extends Proyeccion {

    private static final double RECARGO = 2.50;

    public Proyeccion3D(String titulo, double precioBase) {
        super(titulo, precioBase);
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + RECARGO;
    }
}
