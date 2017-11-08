import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver
{
  public static void main(String[] args)
  {
    System.out.println("Hello World");
    writeObject(new Cat("Garfield", 12, 40, "orange"));
    System.out.println(readObject("gameState.file"));

  }
  
  public static void writeObject(Cat a)
  {
    try
    {
      FileOutputStream fos = new FileOutputStream("gameState.file");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      //DataOutputStream oos = new DataOutputStream(fos);
      oos.writeObject(a);
      oos.close();
    }
    catch(Exception e)
    {
      System.out.println("Something went wrong");
    }
 
  }
  public static Cat readObject(String filename)
  {
    Cat c = null;
    try
    {
      FileInputStream fis = new FileInputStream(filename);
      ObjectInputStream ois = new ObjectInputStream(fis);
      c = (Cat)ois.readObject();
      //oos.writeObject();
      ois.close();
    }
    catch(Exception e)
    {	
      System.out.println("Didn't sacrifice Lamb");
    }
    return c;
    }
}
