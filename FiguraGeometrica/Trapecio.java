public class Trapecio implements CalcularArea {
    private double base1;
    private double base2;
    private double altura;

    public Trapecio(double base1, double base2, double altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base1 + base2) * altura;
    }
}
