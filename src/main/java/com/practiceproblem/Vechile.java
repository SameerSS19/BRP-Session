package com.practiceproblem;

class Vehicle {
    void run() {
        System.out.println("Bike");
    }
}

class Bike extends Vehicle {
    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
