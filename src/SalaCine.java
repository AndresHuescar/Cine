public class SalaCine {

    private boolean[] asientos;

    public SalaCine() {
        asientos = new boolean[50]; // false = libre
    }

    public boolean asientoLibre(int n) {
        return n >= 1 && n <= 50 && !asientos[n - 1];
    }

    public void reservarAsiento(int n) throws AsientoNoDisponibleException {
        if (n < 1 || n > 50) {
            throw new AsientoNoDisponibleException("Número de asiento inválido.");
        }

        if (asientos[n - 1]) {
            throw new AsientoNoDisponibleException("El asiento ya está ocupado.");
        }

        asientos[n - 1] = true;
    }
}
