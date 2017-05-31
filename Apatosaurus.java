public class Apatosaurus extends Dinosaur {
  private String gate;

  public Apatosaurus() {
    super();
    gate = "Quadrupedal";
  }
  public Apatosaurus(String sn, int h, int w, int ms, String d, String g) {
    super(sn, h, w, ms, d);
    gate = "Quadrupedal";
  }

public void eat() {
  System.out.println(getSpeciesName() + " Is Eating Delicious Plants! " + getDiet());
}

public String getGate() {
  return gate;
}
public void setGate(String new_gate) {
  gate = new_gate;
}
}
