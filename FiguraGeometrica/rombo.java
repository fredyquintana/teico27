// Clase Triángulo
public class rombo implements CalcularArea {
    private double base;
    private double altura;

    public rombo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
