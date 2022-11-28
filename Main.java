import java.util.ArrayList;

public class Main {

  public static Location kala = new Location("Kalachuchi Lane", "kalachuchi");
  public static Trainer toffe = new Trainer("Toffe", kala);
  public static NPC anika = new NPC("Anika", kala);
  public static WaterType paz = new WaterType("Paz", 80, 20);
  
  public static void main (String[] args) {

    System.out.println("\n" + "A new trainer has been created named 'Toffe'.");

    System.out.println("\n\n" + ">> The trainer is now interacting with the monster.");
    toffe.inspect(paz);

    System.out.println("\n\n" + ">> The trainer is now interacting with the location.");
    toffe.inspect(kala);
    
    System.out.println("\n\n" + ">> The trainer is now interacting with the NPC.");
    toffe.inspect(anika);
    
  }

}