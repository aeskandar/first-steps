public class Car {
public String model;
private int speed;
private int maxSpeed = 240;

  public Car(String model) {
    this.model = model;
    System.out.println("A " + model + "was Created ");
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
