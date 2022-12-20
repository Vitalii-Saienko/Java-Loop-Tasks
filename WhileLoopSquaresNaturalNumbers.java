/*
The input is a natural number N. Print in ascending space-separated order the squares of natural numbers
if these squares do not exceed N.
 */
import java.util.Scanner;

public class WhileLoopSquaresNaturalNumbers {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int i = 1;
            while (x>=(i*i)) {
                System.out.print(i*i+" ");
                i+=1;
            }
    }
}