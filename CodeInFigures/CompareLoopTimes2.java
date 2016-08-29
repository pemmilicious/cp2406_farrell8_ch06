import java.time.*;
public class CompareLoopTimes2
{
   public static void main(String[] args)
   {
      int startTime1, endTime1;
      final int REPEAT = 100000000;
      final int FACTOR = 1000000;
      LocalDateTime now;
      now = LocalDateTime.now();
      startTime1 = now.getNano();
      for(int x = 0; x <= REPEAT; ++x);
      now = LocalDateTime.now();
      endTime1 = now.getNano();
      System.out.println("Time with prefix increment: " +
         ((endTime1 - startTime1) / FACTOR + " milliseconds"));
      now = LocalDateTime.now();
      startTime1 = now.getNano();
      for(int x = REPEAT; x >= 0; --x);
      now = LocalDateTime.now();
      endTime1 = now.getNano();
      System.out.println("Time with postfix increment: " +
         ((endTime1 - startTime1) / FACTOR + " milliseconds"));
   }
}
