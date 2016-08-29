/**
 * Created by Bradley on 29/08/2016.
 */
import java.util.Scanner;
public class CountbyAnything {
    public static void main(String [] args){
        int end = 1000;
        int lines;
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = keyboard.nextInt();
        lines = num * 20;
        for(int i = num; i <= end; i += num)
        {
            System.out.print(i + ",  ");
            if(i % lines == 0)
                System.out.println();
        }
    }
}