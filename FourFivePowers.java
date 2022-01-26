package donguler;

import java.util.Scanner;

public class FourFivePowers {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for(int i=1,j=1; i<number&&j<number; i*=4,j*=5){

            System.out.println(i +" " + j);
        }
    }
}
