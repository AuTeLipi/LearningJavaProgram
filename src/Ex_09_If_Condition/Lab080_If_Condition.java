package Ex_09_If_Condition;

import java.util.Scanner;

public class Lab080_If_Condition {
    public static void main(String[] args) {
        System.out.println("Enter your Age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Allowed to Vote!");
        }

    }
}
