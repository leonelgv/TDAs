public class TDARectangulo {
    private double base;
    private double altura;

    public TDARectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }
}
