package FigurasGeometricas;

public class Triangulo {
    public static double calculoPerimetro(double base, double altura){
        return (base + altura + calculoHipotenusa(base,altura));
    }
    public static double calculoArea(double base, double altura){
        return (base * altura) / 2;
    }
    public static double calculoHipotenusa(double base, double altura){
        return Math.pow(Math.pow(base,2) + Math.pow(altura,2) , 0.5);
    }
    public static String tipoTriangulo(double base, double altura){
        if((base == altura) && (base == calculoHipotenusa(base,altura)) && (altura == calculoHipotenusa(base,altura))){
            return "El triangulo es un equilatero: ";
        }else if((base != calculoHipotenusa(base,altura) && (base != altura)) && (altura != calculoHipotenusa(base,altura))){
            return"El triangulo es un escaleno: ";
        }else{
            return "El triangulo es un isóceles: ";
        }
    }
}