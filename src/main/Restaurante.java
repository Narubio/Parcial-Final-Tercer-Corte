package main;


public class Restaurante {

    final String TipoDeBebida;
    private final int NumeroDePlatillos;
    private final String TiempoDeComida;
    private final String PrincipalesOrdenes;
    
    public Restaurante (String TipoDeBebida, int NumeroDePlatillos, String TiempoDeComida, String PrincipalesOrdenes){
        this.TipoDeBebida=TipoDeBebida;
        this.NumeroDePlatillos=NumeroDePlatillos;
        this.PrincipalesOrdenes=PrincipalesOrdenes;
        this.TiempoDeComida=TiempoDeComida;
    }

    public String getTipoDeBebida() {
        return TipoDeBebida;
    }

    public int getNumeroDePlatillos() {
        return NumeroDePlatillos;
    }

    public String getTiempoDeComida() {
        return TiempoDeComida;
    }

    public String getPrincipalesOrdenes() {
        return PrincipalesOrdenes;
    }
}
