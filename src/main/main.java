package main;

public class main {

    public static void main(String[] args) {
       
        ComidasRapidas CR=new ComidasRapidas("Heladas, Gaseosas y Refrescos", 3,"Cualquier Hora del dia", "Papa Fritas, Hamburguesa o Perro Caliente\n");
        
        PlatoFuerte PF=new PlatoFuerte("Jugos naturales y Gasesosas", 3, "Horas de la tarde", "Plato fuerte, Sopa y postre\n");
        
        System.out.println("COMIDA RAPIDA");
    CR.MostrarDatos();
        System.out.println("PLATO FUERTE");
    PF.MostrarDatos();
    }
    
}
