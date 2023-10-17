// Clase Triángulo
public class rombo implements CalcularArea {
    private double base;
    private double altura;
    private double nombre;

    public rombo(double base, double altura, double nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
