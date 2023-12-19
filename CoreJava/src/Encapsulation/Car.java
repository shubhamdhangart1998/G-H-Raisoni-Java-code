package Encapsulation;

import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Car car = new Car();
        
        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();
        car.setMake(make);
        
        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();
        car.setModel(model);
        
        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        car.setYear(year);
        
        System.out.println();
        car.displayInfo();
    }
}
