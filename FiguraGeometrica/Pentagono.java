public class Pentagono implements CalcularArea {
    private double perimetro;
    private double apotema1;

    public Pentagono(double perimetro, double apotema1) {
        this.perimetro = perimetro;
        this.apotema1 = apotema1;
    }

    @Override
    public double calcularArea() {
        return perimetro * apotema1;
    }
}
