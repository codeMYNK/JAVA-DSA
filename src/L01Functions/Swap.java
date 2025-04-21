package L01Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2 number: ");
        int num2 = input.nextInt();

        swap(num1, num2);
    }
    public static void swap(int val1, int val2){
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println("Number 1 : "+val1);
        System.out.println("Number 2 : "+val2);
    }
}
