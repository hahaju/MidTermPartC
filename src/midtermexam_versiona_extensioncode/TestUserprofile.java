package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Enter your favourite Genre from a displayed list : Comedy, Drama, Action, Mystery");
    String genre = sc.nextLine();

    if(name !=null && genre != null){
      System.out.println("You've made your profile");
    }
}
}