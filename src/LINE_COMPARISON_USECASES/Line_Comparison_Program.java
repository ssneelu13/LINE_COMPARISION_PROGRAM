package LINE_COMPARISON_USECASES;
//this is a scanner class and co_ordinates is the object
import java.util.Scanner;
import java.lang.Math;
public class Line_Comparison_Program {
    public static void main(String[] args){
        Scanner co_ordinates = new Scanner(System.in);
        System.out.println("Welcome to line comparison program");
        System.out.println("enter the value of x1 co-ordinate: ");
        int x1 = co_ordinates.nextInt();
        System.out.println("enter the value of x2 co-ordinate: ");
        int x2 = co_ordinates.nextInt();
        System.out.println("enter the value of y1 co-ordinate: ");
        int y1 = co_ordinates.nextInt();
        System.out.println("enter the value of y2 co-ordinate: ");
        int y2 = co_ordinates.nextInt();
        double length_of_a_line = (Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
        System.out.println("the length of a line is: "+length_of_a_line);
    }
}
