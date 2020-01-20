package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Eggs {
    String utensil;
    private int numberEggs;
    static ArrayList<String> type = new ArrayList<String>(Arrays.asList("Cup","Jezve","Pot","Wok"));
    public Eggs(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    public void chooseUtensil(int numberEggs) throws InterruptedException {
        if(numberEggs==1) {System.out.println("The utensil chosen for "+ numberEggs + " eggs is a " + type.get(0) + "!");
        utensil=type.get(0); }
        if(numberEggs==2) {System.out.println("The utensil chosen for "+ numberEggs +" eggs is a " + type.get(1) + "!");
        utensil=type.get(1); }
        if(numberEggs>2 && numberEggs<=6){System.out.println("The utensil chosen for "+numberEggs+" eggs is a "+type.get(2)+"!");
        utensil=type.get(2);}
        if(numberEggs>6){System.out.println("The utensil chosen for"+numberEggs+"eggs is a "+type.get(3)+"!");
        utensil=type.get(3);}
        Thread.sleep(2000);
    }
    public void washing() throws InterruptedException {
        System.out.println("The eggs are being washed!");
        Thread.sleep(4000);
    }

    public void eggsInPot() throws InterruptedException {
        switch(utensil){
            case "Cup": System.out.println("The eggs are in the cup!"); break;
            case "Jezve": System.out.println("The eggs are in the jezve!"); break;
            case "Pot": System.out.println("The eggs are in the pot!"); break;
            case "Wok": System.out.println("The eggs are in the wok!");break; }
        Thread.sleep(2000);
    }

    public void sinking() throws InterruptedException{
        System.out.println("The eggs are sinking now!");
        Thread.sleep(2000);
    }

    public void getNumberEggs() throws InterruptedException {
            if (this.numberEggs <=0) {
                System.out.println("Put some eggs!");
            } else {
                switch(utensil){
                    case "Cup": System.out.println("You put the eggs in the cup!"); break;
                    case "Jezve": System.out.println("You put the eggs in the jezve!"); break;
                    case "Pot": System.out.println("You put the eggs in the pot!"); break;
                    case "Wok": System.out.println("You put the eggs in the wok!");break;}
            }
            Thread.sleep(1000);
            System.out.println("Number of eggs: " + this.numberEggs);
            Thread.sleep(1000);
    }

    public void setNumberEggs(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    public void softBoil() throws InterruptedException {
for(int i=1; i<=3; i++) {
    System.out.print(i +" minutes passed! \n");
Thread.sleep(1000);}
System.out.println("\n The eggs are Soft-Boiled!");
    }
    public void wellDone() throws InterruptedException {
        for(int i=1; i<=5; i++) {
            System.out.print(i +" minutes passed! \n");
            Thread.sleep(1000);}
        System.out.println("\n The eggs are Well-Done!");
    }
    public void hardBoil() throws InterruptedException {
        for(int i=1; i<=8; i++) {
            System.out.print(i +" minutes passed! \n");
            Thread.sleep(1000);}
        System.out.println("\n The eggs are Hard-Boiled!");
    }
}
