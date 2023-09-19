package FigurasGeometricas;

public class Circulo {
    public static double calculoArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public static double calculoPerimetro(double radio){
        return 2 * Math.PI * radio;
    }
}
