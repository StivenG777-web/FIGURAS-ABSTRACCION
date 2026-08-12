public class Pentagono extends Figura {
    private int lado;

    public Pentagono(int lado, String tipo) {
        super(tipo);
        this.setLado(lado);
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public double area() {
        return (double) (5 * this.lado * this.lado) / (4 * Math.tan(Math.PI / 5));
    }
}
