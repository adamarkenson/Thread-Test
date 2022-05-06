import java.lang.Thread;

public class MultiThreading implements Runnable
{


  public void run()
  {
    try{
      System.out.println("Thread " + Thread.currentThread().getId() + " is running");
      for(int a = 0; a < 5; a ++) System.out.print(a);
      System.out.println();
    } catch(Exception e) { System.err.println("Exception"); }
  }
  
}