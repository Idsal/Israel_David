/*
Television.java
Israel David Salinas Lopez
*/
public class Television extends Electrodomestico{

    private final static int RESOLUTION_FOR_DFCT=20;
    private int resolucion;
    private boolean sintonizador;
    public double priceFinal(){

        double more=super.priceFinal();


        if (resolution>40){
            more+=priceb*0.3;
        }
        if (sintonizador){
            more+=50;
        }

        return more;
    }
    public Television(){
        this(PRICEB_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_FOR_DFCT, COLOR_FOR_DFCT, RESOLUTION_FOR_DFCT, false);
    }

    public Television(double basep, double weight){
        this(priceb, weight, ENERGY_FOR_DFCT, COLOR_FOR_DFCT, RESOLUTION_FOR_DFCT, false);
    }

    public Television(double priceb, double weight, char energy, String color, int resolution, boolean sintonizador){
        super(priceb, weight, energy, color);
        this.resolution=resolution;
        this.sintonizador=sintonizador;
    }
}
