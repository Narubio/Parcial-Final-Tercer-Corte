package main;

public class ComidasRapidas extends Restaurante {
    
    public ComidasRapidas(String TipoDeBebida, int NumeroDePlatillos, String TiempoDeComida, String PrincipalesOrdenes) {
        super(TipoDeBebida, NumeroDePlatillos, TiempoDeComida, PrincipalesOrdenes);
    }
    public void MostrarDatos(){
        System.out.println("Tipo de Bebida: "+getTipoDeBebida());
        System.out.println("Numero de platillos: "+getNumeroDePlatillos());
        System.out.println("Hora de comida: "+getTiempoDeComida());
        System.out.println("Ordenes principalkes: "+getPrincipalesOrdenes());
    }
}
  