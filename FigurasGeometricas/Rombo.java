package FigurasGeometricas;

public class Rombo {
    public static double calculoArea(double diagonalMayor, double diagonalMenor){
        return (diagonalMayor * diagonalMenor) / 2;
    }
    public static double calculoPerimetro(double lado){
        return 4 * lado;
    }
}