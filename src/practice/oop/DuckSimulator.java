/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;
/**
 *
 * @author Ramadhaan
 */import java.util.Scanner;

public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bebek (1 untuk Mallard Duck, 2 untuk Rubber Duckie, 3 untuk Decoy Duck, 4 untuk Model Duck): ");
        int choice = scanner.nextInt();
        Duck duck = null;

        switch (choice) {
            case 1:
                duck = new MallardDuck();
                break;
            case 2:
                FlyBehavior cantFly = () -> System.out.println("I can fly");
                QuackBehavior squeak = () -> System.out.println("Squeak");
                duck = new RubberDuck(cantFly, squeak);
                break;
            case 3:
                duck = new DecoyDuck();
                break;
            case 4:
                duck = new ModelDuck();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        if (duck != null) {
            duck.performQuack();
            duck.performFly();
        }

        scanner.close();
    }
}

