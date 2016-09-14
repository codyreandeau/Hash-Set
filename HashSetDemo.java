import java.util.*;

public class HashSetDemo {
  
  public static void main(String[] args) {
    
    Set<String> hashset = new HashSet<>();
    
    hashset.add("Hash");
    hashset.add("Sets");
    hashset.add("For");
    hashset.add("The");
    hashset.add("Win!");
    
    //Demonstrating that duplicates are not allowed
    hashset.add("Sets");
    
    System.out.println("This is what are Hash set looks like so far:");
    System.out.println(hashset);
    
  }
}