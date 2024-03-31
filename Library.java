/* This is a stub for the Library class */
import java.util.ArrayList;

public class Library extends Building {
  private ArrayList<Boolean> bookAvailable;
  private ArrayList<String> bookTitles;
}

/* Constructs am object called Library  */
public Library(String name, String address, int nFloors) {
  super(name, address, nFloors);
  this.bookTitles = new ArrayList<>();
  this.bookAvailable = new ArrayList<>();
  System.out.println("You have built a library: 📖");
}
  

/* Method adds a book to the library object
 */
public void addTitle (String title) {
  bookTitles.add(title);
  bookAvailable.add(true);
}

/* Method removes a book from the library */
public String removeTitle(String title) {
  int index = bookTitles.indexOf(title);
  if !(index = -1) {
    bookAvailable.remove(index);
    return bookTitles.remove(index);
  }
  else {
    return null;
  }
}

/* Method checks out a book from the library */
public void checkOut (String title) {
  int index = bookTitles.indexOf(title);
  if !(index = -1){
    bookAvailable.set(index, false);
  }
  else {
    System.out.println("Sorry, this title is not in the library");

  }
}


/* This method returns a book to the library */
public void checkOut (String title) {
  int index = bookTitles.indexOf(title);
  if !(index = -1){
    bookAvailable.set(index, true);
  }
  else {
    System.out.println("Sorry, this title is not in the library");

  }

  /* Method checks for titles in the library */
  public boolean containsTitle(String title) {
    return bookTitles.contains(title);
  }

  /* Mthod checks if a book is available  */
  public boolean isAvailable(String title) {
    int index = bookTitles.indexOf(title);
    if !(index = -1){
      return bookAvailable.get(index);
    } 
    else {
      return false;
    }
  }

  /* Method prints out the library collections */
  public void printCollection() {
    for (int i = 0; i < bookTitles.size(); i++) {
      System.out.println(bookTitles.get(i) + " Available: " + bookAvailable.get(i));
    }
  }