/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author Ramadhaan
 */
import java.util.Scanner;

public class DuckScanner {
    private Scanner scanner;

    public DuckScanner() {
        scanner = new Scanner(System.in);
    }

    public int getUserChoice() {
        System.out.println("Pilih bebek (1 untuk Mallard Duck, 2 untuk Rubber Duckie, 3 untuk Decoy Duck, 4 untuk Model Duck): ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}

