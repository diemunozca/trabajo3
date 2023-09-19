package capitulo_3;

public class EmpleadoEjercicio18 {
    int codigoEmpleado;
    String nombre;
    public static double calculoSalarioB(double horasTrabajadas, double valorHora){
        double salarioBruto;
        salarioBruto = horasTrabajadas * valorHora;
        return salarioBruto;
    }
    public static double retencionFuente(double horasTrabajadas, double valorHora, double porcentRetencion){
        double salarioRetenido;
        salarioRetenido = (horasTrabajadas * valorHora) * (porcentRetencion/100);
        return salarioRetenido;
    }
    public static double calculoSalarioN(double horasTrabajadas, double valorHora, double porcentRetencion){
        double salarioNeto;
        salarioNeto = (horasTrabajadas * valorHora) - (horasTrabajadas * valorHora) * (porcentRetencion/100);
        return salarioNeto;
    }
}
