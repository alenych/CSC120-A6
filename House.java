/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  private boolean hasDiningRoom;
  private ArrayList<String> residents;

  /* This constructs a new object called House and its arributes */

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  /*Method checks if the house has a dining room */
  public boolean hasDiningRoom () {
    return hasDiningRoom;
  }

  /* Method checks how many residents are in the house */
  public int nResidents() {
    return residents.size();
  }

  /* Method removes a resident from the house */
  public String moveOut(String name) {
    if this.residents = name{
    residents.remove(name);
    return name;
  }
  }

  /* MEthod adds a resident to the house */
  public void moveIn(String name) {
    if this.residents != name{
    residents.add(name);
    }
  }

  /* Method checks if the resident is in the house */
  public boolean isResident(String person) {
    return residents.contains(person);
  }







  public static void main(String[] args) {
    new House();
  }

}