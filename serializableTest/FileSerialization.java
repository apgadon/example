import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerialization
{


public void writeObject(Cat a)
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

public Cat readObject(String filename)
{
  Cat c = null;
  try
  {
    FileInputStream fis = new FileInputStream("mybean.ser");
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
