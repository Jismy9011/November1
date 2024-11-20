package oops;

import java.util.Scanner;

public class FibinocciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Fibinocci series: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;

        System.out.println("Fibinocci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); 
            int next = first + second;
            first = second; 
            second = next;  
        }
    }
}



