public class App {
    public static void main(String[] args) {
        Figura tria1 = new Triangulo(3, 4, "Triángulo");
        Figura cuad2 = new Cuadrado(4, "Cuadrado");
        Figura circ3 = new Circulo(5, "Círculo");
        Figura pent4 = new Pentagono(3, "Pentágono");

        System.out.println("Área del " + tria1.getTipo() + ": " + tria1.area());
        System.out.println("Área del " + cuad2.getTipo() + ": " + cuad2.area());
        System.out.println("Área del " + circ3.getTipo() + ": " + circ3.area());
        System.out.println("Área del " + pent4.getTipo() + ": " + pent4.area());   
    } 
}
