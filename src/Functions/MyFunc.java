package Functions;

import java.util.Scanner;

public class MyFunc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length:");
        int length = input.nextInt();

        System.out.print("Enter Width:");
        int width = input.nextInt();

        int area = calculateArea(length,width);

        System.out.println("The area of given input: "+area);
    }

    public static int calculateArea(int length, int width){
//        System.out.println("Area of given input: " + length * width);
         return length * width;

    }

}
