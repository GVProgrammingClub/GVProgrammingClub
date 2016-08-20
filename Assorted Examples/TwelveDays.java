//Created by NateThePlate copyright 2K16
/* This is a festive program that will print out a rendition of
the twelve days of Christmas.
*/
import java.lang.InterruptedException;

public class TwelveDays {
    public static void main(String args[]) {
        String[] nums = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nine", "tenth", "eleventh", "twelfth"};
        String[] gifts = {
            "a Partridge in a Pear Tree",
            "Two Turtle Doves",
            "Three French Hens",
            "Four Calling Birds",
            "Five Golden Rings",
            "Six Geese a Laying",
            "Seven Swans a Swimming",
            "Eight Maids a Milking",
            "Nine Ladies Dancing",
            "Ten Lords a Leaping",
            "Eleven Pipers Piping",
            "12 Drummers Drumming"
        };
        
        for (int day = 0; day < 12; day ++) {
            System.out.printf("On the %s day of christmas my true love sent to me: \n", nums[day]);
            for (int gift = day; gift >= 0; gift--) {
                System.out.print("\t");
                if(day != 0 && gift == 0) 
                    System.out.print("and ");
                System.out.println(gifts[gift]);
                try{
                    Thread.sleep(2000);
                } catch(InterruptedException e) {
                    
                }
            }
        }
    }
}