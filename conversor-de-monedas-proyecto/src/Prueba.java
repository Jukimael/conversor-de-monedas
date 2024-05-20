import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarTipoMoneda filtro = new ConsultarTipoMoneda();
        DivisaRecord dr = filtro.filtrarMoneda("USD", "PEN");
        Divisa divisa = new Divisa(dr);
        String opciones = """
                1) Dólar =>> Sol Peruano
                2) Sol Peruano =>> Dólar
                3) Dólar =>> Peso Chileno
                4) Peso Chileno =>> Dólar
                5) Dólar =>> Peso Mexicano
                6) Peso Mexicano =>> Dólar
                7) Otros
                8) Salir""";
        int opcion = 0;
        double cantidad = 0.0;
        double valorCambio;

        while (opcion != 8){
            System.out.println("**********************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]\n");
            System.out.println(opciones);
            System.out.println("Eliga una opción valida");
            System.out.println("**********************************************************\n");
            opcion = lectura.nextInt();
            if (opcion != 8){
                System.out.println("Ingresa el valor que desea convertir");
                cantidad = lectura.nextDouble();
            }
            switch (opcion){
                case 1:
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 2:
                    dr = filtro.filtrarMoneda("PEN", "USD");
                    divisa = new Divisa(dr);
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 3:
                    dr = filtro.filtrarMoneda("USD", "CLP");
                    divisa = new Divisa(dr);
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 4:
                    dr = filtro.filtrarMoneda("CLP", "USD");
                    divisa = new Divisa(dr);
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 5:
                    dr = filtro.filtrarMoneda("USD", "MXN");
                    divisa = new Divisa(dr);
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 6:
                    dr = filtro.filtrarMoneda("MXN", "USD");
                    divisa = new Divisa(dr);
                    valorCambio = divisa.convertirDivisa(cantidad);
                    System.out.println("El valor " + cantidad + " [" + divisa.getTipo() + "] " +
                            "corresponde al valor final de =>>> " + valorCambio + " [" + divisa.getMonedaConvertir() + "]");
                    break;
                case 7:
                    System.out.println("En construcción...");
                    break;
                case 8:
                    System.out.println("Gracias por utilizar nuestro conversor de monedas :)");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }

    }
}
