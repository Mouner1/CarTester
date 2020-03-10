/*
 * Mouner Dabjan 
 * 3/9/2020
 * This program creates constructors and methods of cars
 */
package dogtester;

/**
 *
 * @author User
 */
public class Car {
    //variables for characteristics

    private String make, model, color;
    private int price, year;
    private boolean sunroof;
    
    
//Constructor without paremeters

    public Car() {
        make = "Cheve";
        model = "Camaro";
        color = "Yellow";
        price = 0;
        year = 2015;
        sunroof = true;
    }
// constructor with parameters

    public Car(String company, String type, String colour, int date) {

        make = company;
        model = type;
        color = colour;
        year = date;
        int cost = (int) (Math.random() * 5000 + 10000);
        price = cost;
        int choice = (int) (Math.random() * 2 + 1);
        if (choice == 1) {
            sunroof = true;
        } else {
            sunroof = false;
        }

    }

    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @return 
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @param pricee
     */
    public void setPrice(int pricee) {
        price = pricee;
    }

    /**
     * This method allows for a car to honk its horn
     */
    public static void honkHorn() {
        System.out.println("Beep! Beep!");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Make: " + make + "\n";
        output += "Model: " + model + "\n";
        output += "Color: " + color + "\n";
        output += "Cost: " + price + "\n";
        output += "Year: " + year + "\n";
        output += "Sunroof: " + sunroof + "\n";
        //output string is complete, return it
        return output;
    }

}
