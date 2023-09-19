package capitulo4;

public class InscripcionEjercicio10 {
    public static double calculoPagoMatricula(double patrimonio, int estrato){
        double pagoMatri;
        pagoMatri = 50000;
        if (patrimonio > 2000000 && estrato > 3){
            pagoMatri = pagoMatri + (patrimonio * 0.03);
        }
        return pagoMatri;
    }
}
