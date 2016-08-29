/**
 * Created by Bradley on 29/08/2016.
 */
public class Diagonal0s {
    public static void main(String [] args)
    {
        char Os = 'O';
        char spaces = ' ';
        int rows = 10;
        int columns = 0;
        int i, j;
        for (i=0; i < rows ; ++i)
        {
            for (j = 0; j < columns; ++j)
                System.out.print(spaces);
            System.out.println(Os);
            columns++;
        }
    }
}
