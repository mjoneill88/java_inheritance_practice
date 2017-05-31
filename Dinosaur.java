public class Dinosaur {
  private String species_name;
  private int height;
  private int weight;
  private int movement_speed;
  private String diet;

  Dinosaur() {
    species_name = "Generic Dinosaur";
    height = 0;
    weight = 0;
    movement_speed = 0;
    diet = "NA";
  }

  Dinosaur(String sn, int h, int w, int ms, String d) {
    this.species_name = sn;
    this.height = h;
    this.weight = w;
    this.movement_speed = ms;
    this.diet = d;
  }

  public void eat() {
    System.out.println(getSpeciesName() + " is eating " + getDiet());
  }

  public void sleep() {
    System.out.println(getSpeciesName() + " is  sleeping...zzz...");
  }

  public void move() {
    System.out.println(getSpeciesName() + " is moving now!! ");
  }

  public String getSpeciesName() {
    return species_name;
  }
  public void setSpeciesName(String sn) {
    species_name = sn;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int h) {
    height = h;
  }
  public int getWeight() {
    return weight;
  }
  public void setWeight(int w) {
    weight = w;
  }
  public int getMovementSpeed() {
    return movement_speed;
  }
  public void setMovementSpeed(int ms) {
    movement_speed = ms;
  }
  public String getDiet() {
    return diet;
  }
  public void setDiet(String d) {
    diet = d;
  }
}
