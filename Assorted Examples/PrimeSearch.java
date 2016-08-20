/*
A Java program that finds the total number of primes less than or
equal to the supplied number.  A number can either be supplied when
the program is running by running the command java PrimeSearch [number]
or you can run java PrimeSearch and then entire the number when prompted
*/
import java.util.ArrayList;
import java.util.Scanner;

class PrimeSearch {
    public static void main(String[] args) {
        int boundary; //The upper limit on what number to check up to
        try{ 
            if (Integer.valueOf(args[0])<=0) {
                System.out.println("Bad argument");
                return;
            } else {
                boundary = Integer.valueOf(args[0]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Bad argument");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Boundary: ");
            boundary = (new Scanner(System.in)).nextInt();
        }
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        System.out.println("2");
        int total = 1;
        factoring:for (int i = 3; i <=boundary; i+=2) {
            for (int g : factors) {
                if ((((float) i)/g) == (i/g)) continue factoring;
            }
            System.out.println(i);
            factors.add(i);
            total++;
        }
        System.out.println("Total primes: " + total);
    }
}