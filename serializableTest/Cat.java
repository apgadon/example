import java.io.Serializable;
public class Cat implements Serializable
{
  private String name;
  private int age;
  private double weight;
  private String color;

  public Cat(String name, int age, double weight, String color)
  {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.color = color;
  }

  public String toString()
  {
    return ("My cat named " + name + " is " + age + " years old and " +
            "weighs " + weight + " pounds and has " + color + " fur.");
  }
  
}
