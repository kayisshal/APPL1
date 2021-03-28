/*
 * Nama : Kayis Shalahuddin
 * NIM : 191524047
 * Pertemuan : Week-2
 */
package Exceptions2;

/**
 *
 * @author Kayis
 */
// **************************************************************** 
// Factorials.java 
// 
// Reads integers from the user and prints the factorial of each. 
// 
// **************************************************************** 
import java.util.Scanner; 
public class Factorials
{ 
    public static void main(String[] args)
    { 
        String keepGoing = "y"; 
        Scanner scan = new Scanner(System.in); 
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.print("Enter an integer (0 - 16): ");
            int val = scan.nextInt();
            try
            {
		System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            }catch(IllegalArgumentException ex)
            {
		System.out.println(ex);
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    } 
}
