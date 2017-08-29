public class TDACuadrado {
    private double lado;

    public TDACuadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return (lado * 4);
    }
}
