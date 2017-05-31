public class DinoDriver {
  public static void main(String args[]) {
    Apatosaurus d = new Apatosaurus("Apatosaurus", 40, 5000, 4, "Herbivorous", "Quadrupedal");
    System.out.println("Apatosaurus:");
    System.out.println(d.getSpeciesName());
    System.out.println(d.getHeight());
    System.out.println(d.getWeight());
    System.out.println(d.getMovementSpeed());
    System.out.println(d.getDiet());
    d.eat();
    Dinosaur dino =new Dinosaur();
    System.out.println("Generic Dinosaur:");
    System.out.println(dino.getSpeciesName());
    System.out.print(dino.getHeight());
    System.out.println(dino.getWeight());
    System.out.println(dino.getDiet());
    dino.eat();
    SubApatosaurus subA = new SubApatosaurus();
    System.out.println("Sub Species of Apatosaurus:");
    System.out.println(subA.getSpeciesName());
    System.out.println(subA.getStripedTail());
  }
}
