/*
EXAM
DIEGO PEREZ CARRILLO
LUIS URIEL VICTORIANO JUAREZ
THIS IS THE SUPER CLASS
*/
public class Electrodomestico {
    protected final static String COLOR_FOR_DFCT="WHITE";
    protected final static double PRICEB_FOR_DFCT=100;
    protected final static double WEIGHT_FOR_DFCT=5;
    protected final static char ENERGY_FOR_DFCT='F';
    protected String color;
    protected double priceb;
    protected double weight;
    protected char energy;

    public Electrodomestico(){
        this(PRICEB_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_FOR_DFCT, COLOR_FOR_DFCT);
    }

    public Electrodomestico(double priceb, double weight){
        this(priceb, weight, ENERGY_FOR_DFCT, COLOR_FOR_DFCT);
    }

    public Electrodomestico(double basep, double weight, char energy, String color){
        this.priceb=priceb;
        this.weight=weight;
        Energy(energy);
        Color(color);
    }

    public void energy(char energy){

        if(energy>=65 && energy<=70){
            this.energy=energy;
        }else{
            this.energy=ENERGY_FOR_DFCT;
        }

    }

        if(wasted){
            this.color=color;
        }else{
            this.color=COLOR_FOR_DFCT;
        }

    }
    private void Color(String color){
        String colores[]={"White", "Black", "Red", "Blue", "Gray"};
        boolean wasted=false;
        for(int i=0;i<colores.length && !wasted;i++){

            if(colores[i].equals(color)){
                wasted=true;
            }

        }


    public String getColor() {
        return color;
    }
    public double getPriceb() {
        return priceb;
    }

    public double getweight() {
            return weight;
    }
    public char getEnergy() {
        return energy;
    }
    public double priceFinal(){
        double more=0;
        switch(energy){
            case 'A':
                more+=100;
                break;
            case 'B':
                more+=80;
                break;
            case 'C':
                more+=60;
                break;
            case 'D':
                more+=50;
                break;
            case 'E':
                more+=30;
                break;
            case 'F':
                more+=10;
                break;
        }

        if(weight>=0 && weight<19){
            more+=10;
        }else if(weight>=20 && weight<49){
            more+=50;
        }else if(weight>=50 && weight<=79){
            more+=80;
        }else if(weight>=80){
            more+=100;
        }

        return priceb+more;
    }

}// end class Electrodomestico
