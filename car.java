public class Car {
public String model;
public int speed;
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

  public void slert() {
    if (speed > maxspeed/2){
      System.out.println("Carefull you passed the .....");
    }
  }
}
