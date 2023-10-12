// Clase Triángulo
public class no implements CalcularArea {
    private double base;
    private double altura;
    private double nombre;

    public no(double base, double altura, double nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
