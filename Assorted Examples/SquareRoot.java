import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = input.nextInt();
        System.out.println("Approx root:" + ((double)root(num))/1000);
    }
    
    //Max int val: 2147483647
    //             1234567890
    public static int root(int input) {
        /* p1 and p2 are placeholder variables used throughout
           g1 through g5 are pairs of digits
           root is the square root (Creative title)
        */
        //Numbers that need to be declared: 100000000, 1000000, 10000, 100, 10, 2, 1
        int p1, p2, p3, g1, g2, g3, g4, g5, root, x, r;
        p2 = input;
        
        g1 = input / 100000000;
        p1 = 100000000;
        p1 *= g1; //p1 is now just the value of the 10^9 and 10^8 place
        p2 -= p1;  //p2 is now the value of input without the 10^9 and 10^8 place
        
        g2 = p2 / 1000000;
        p1 = 1000000;
        p1 *= g2; //p1 is now just the value of the 10^7 and 10^6 place
        p2 -= p1; //p2 is now the value of input without the 10^7 and 10^6 place
        
        g3 = p2 / 10000;
        p1 = 10000;
        p1 *= g3; //p1 is now just the value of the 10^5 and 10^4 place
        p2 -= p1; //p2 is now the value of input without the 10^5 and 10^4 place
        
        g4 = p2 / 100;
        p1 = 100;
        p1 *= g4; //p1 is now just the value of the 10^3 and 10^2 place
        p2 -= p1; //p2 is now the value of input without the 10^3 and 10^2 place
        
        g5 = p2;
        
        root = 0;
        if (g1 >= 81)
            root = 9;
        if (g1 >= 64 && g1 <= 80)
            root = 8;
        if (g1 >= 49 && g1 <= 63)
            root = 7;
        if (g1 >= 36 && g1 <= 48)
            root = 6;
        if (g1 >= 25 && g1 <= 35)
            root = 5;
        if (g1 >= 16 && g1 <= 24)
            root = 4;
        if (g1 >= 9  && g1 <= 15)
            root = 3;
        if (g1 >= 4  && g1 <= 8 )
            root = 2;
        if (g1 >= 1  && g1 <= 3 )
            root = 1;
        p1 = root;
        p1 *= root;
        r = g1;
        r -= p1;
        
        x = 0; //x is a counter variable
        r *= 100;
        r+= g2;
        
        p1 = root; //For when x = 1
        p1 *= 20;
        p1 += 1;
        p1 *= 1;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 2
        p2 *= root;
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 3
        p2 *= root;
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 4
        p2 *= root;
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 5
        p2 *= root;
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 6
        p2 *= root;
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 7
        p2 *= root;
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 8
        p2 *= root;
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = 20; //For when x = 9
        p2 *= root;
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = root; //Updates the remainder
        p1 *= 20;
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        r+=g3;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the third digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        System.out.println("p1=" + p1);
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = root; //Updates the remainder
        p1 *= 20;
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        r+=g4;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the fourth digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        System.out.println("p1=" + p1);
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = p3; //Updates the remainder
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        r+=g5;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the fifth digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = p3; //Updates the remainder
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the sixth digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = p3; //Updates the remainder
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the seventh digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p1 = p3; //Updates the remainder
        p1 += x;
        p1 *= x;
        r -= p1;
        r*=100;
        
        root *= 10; //Adds the new digit to the root
        root += x;
        x = 0;
        
        //Beginning of finding the eight digit of the root
        //p3 will hold the value of 20p
        p3 = root;
        p1 = p3;
        p3 *= 20;
        p1 *= 20;
        p1 += 1; //Technically, you multiply by 1 too but that is unneeded
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 2
        p2 += 3; //2 * 1 + 1 (2*1 becuase x was 1)
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 3
        p2 += 5; // 2 * 2 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 4
        p2 += 7; // 2 * 3 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 5
        p2 += 9; // 2 * 4 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 6
        p2 += 11; // 2 * 5 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 7
        p2 += 13; // 2 * 6 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 8
        p2 += 17; // 2 * 8 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        p2 = p3; //For when x = 9
        p2 += 18; // 2 * 9 + 1
        p1 += p2;
        p1 -= r;
        if (p1 <= 0)
            x += 1;
        p1 += r;
        
        root *= 10;
        root += x;
        
        return root;
    }
}