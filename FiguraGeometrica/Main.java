public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(8, 6);
        Circulo circulo = new Circulo(4);
        System.out.println("----------------------------------------------------");
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        System.out.println("----------------------------------------------------");
    }
}