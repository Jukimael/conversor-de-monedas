public class Ejemplo {
    public static void main(String[] args) {
        ConsultarTipoMoneda ctt = new ConsultarTipoMoneda();
        DivisaRecord cr = ctt.filtrarMoneda("PEN", "USD");
        Divisa c = new Divisa(cr);
        System.out.println(c);
    }
}
