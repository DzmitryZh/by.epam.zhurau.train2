package by.epam.zhurau.train2.main;

import java.util.Scanner;

/**
 * Created by Dzmitry_Zhurau on 2/15/2017.
 */
public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x < 1000 || x > 9999) {
            System.out.print("Enter value:");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x < 1000 || x > 9999) {
                    System.out.println("The value is incorrect...");
                }
            } else {
                scanner.next();
                System.out.println("The value is incorrect...");
            }

        }

        x = CalculateValue.calculateMultiplication(x);

        System.out.print(x);

    }





}
