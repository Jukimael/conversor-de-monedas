public class Divisa implements Convertible{
    private String tipo;
    private String monedaConvertir;
    private double valor;

    public Divisa(DivisaRecord cambio) {
        this.tipo = cambio.base_code();
        this.monedaConvertir = cambio.target_code();
        this.valor = cambio.conversion_rate();
    }

    public String getTipo() {
        return tipo;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public double convertirDivisa(double cantidad) {
        return cantidad * this.getValor();
    }
}
