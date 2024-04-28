/* This is a stub for the Cafe class */

public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;



    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }


    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >=1){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Your coffee is ready! Enjoy!");
        }
        else {System.out.println("Sorry we are missing ingredients for that order");
        restock();
    }
    }
    
    private void restock() {
        this.nCoffeeOunces += 50;
        this.nSugarPackets += 50;
        this.nCreams += 50;
        this.nCup += 50;
        System.out.println("Restock complete");
        sellCoffee();
    }
}
