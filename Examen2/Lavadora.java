/*
Lavadora.java
Israel David Salinas Lopez
*/
public class Lavadora extends Electrodomestico{
    private final static int CARGA_FOR_DFCT=5;
    private int carga;

    public int getcarga() {
        return carga;
    }

    public double priceFinal(){
        double more=super.priceFinal();
        if (carga>30){
            more+=50;
        }

        return more;
    }

    public Lavadora(){
        this(PRICEB_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_FOR_DFCT, COLOR_FOR_DFCT, CARGA_FOR_DFCT);
    }

    public Lavadora(double priceb, double weight){
        this(priceb, weight, ENERGY_FOR_DFCT, COLOR_FOR_DFCT, CARGA_FOR_DFCT);
    }

    public Lavadora(double price, double weight, char energy, String color, int carga){
        super(priceb, weight, energy, color);
        this.carga=carga;
    }
}//end class Lavadora
