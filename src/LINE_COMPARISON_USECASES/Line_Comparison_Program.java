package LINE_COMPARISON_USECASES;
//this is a scanner class and co_ordinates is the object
import java.util.Scanner;
//sqrt function can be used by passing parameter
import java.lang.Math;
public class Line_Comparison_Program {
    static void Lines_Identical(double a1, double b1, double c1, double a2, double b2, double c2){
        if ((a1 / a2 == b1 / b2) && (a1 / a2 == c1 / c2) && (b1 / b2 == c1 / c2)) {
            System.out.println("The given straight lines are identical");
        }
        else {
            System.out.println("The given straight lines are not identical");
        }
    }

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
        double a1 = -2, b1 = 4, c1 = 3, a2 = -6, b2 = 12, c2 = 9;
        Lines_Identical(a1, b1, c1, a2, b2, c2);
    }
}
