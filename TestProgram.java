package Homework;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) throws InterruptedException {
        Scanner a = new Scanner(System.in);
        int button;

        int number ;
        do {
            System.out.print("Please insert number of eggs: ");
            number= a.nextInt();
        }while(number<=0);


        Eggs eggs = new Eggs(number);
        eggs.chooseUtensil(number);
        eggs.getNumberEggs();
        eggs.washing();
        eggs.eggsInPot();
        eggs.sinking();
        do {
            System.out.print("Please enter hardness of boiling:" +
                    "\n 1: Soft-Boiled" +
                    "\n 2: Well-Done" +
                    "\n 3: Hard-Boiled \n");
            button = a.nextInt();
        } while (button != 1 && button != 2 && button != 3);
        switch (button){
            case 1: eggs.softBoil(); break;
            case 2: eggs.wellDone(); break;
            case 3: eggs.hardBoil();
        }
    }}
