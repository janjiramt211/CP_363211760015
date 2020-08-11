package Exercise;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Exercise_Leb2_2 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input base :");
        double base = in.nextDouble();
        System.out.print("Input height :");
        double height = in.nextDouble();
        System.out.println("0.5*base*height");
        System.out.println("The triangular area :"+ 0.5*base*height);
    }
}
