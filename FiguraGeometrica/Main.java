public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(8, 6);
        Circulo circulo = new Circulo(4);
        Pentagono pentagono = new Pentagono(20, 7);
        Rombo rombo = new Rombo(6, 8);
        Trapecio trapecio = new Trapecio(5, 10, 6);
        
        System.out.println("----------------------------------------------------");
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        System.out.println("Área del Pentágono: " + pentagono.calcularArea());
        System.out.println("Área del Rombo: " + rombo.calcularArea());
        System.out.println("Área del Trapecio: " + trapecio.calcularArea());
        System.out.println("----------------------------------------------------");
    }
}
