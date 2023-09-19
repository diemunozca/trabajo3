package capitulo4;

public class CalcularEcuacionEjercicio23 {
    public static double calculoResultado1(double a, double b, double c){
        double result1;
        result1 = ((-b)+(Math.sqrt((Math.pow(b,2)-4 * a * c))))/ (2*a);
        return result1;
    }
    public static double calculoResultado2(double a, double b, double c){
        double result2;
        result2 = ((-b)-(Math.sqrt((Math.pow(b,2)-4 * a * c))))/ (2*a);
        return result2;
    }
}