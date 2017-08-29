public class Programa {

    public static void main(String[] args){
        TDACuadrado cuadrado = new TDACuadrado(34.78);
        System.out.println("El área del cuadrado es: " + cuadrado.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro());

        TDARectangulo rectangulo = new TDARectangulo(34,10);
        System.out.println("El área del rectangulo es: " + rectangulo.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro());
    }
}
