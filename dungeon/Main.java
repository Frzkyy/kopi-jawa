package dungeon;
import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
          System.out.println("================================");


          for (int i = 0; i<10; i++){
               Sword sword = LootBox.NormalLootBox_Sword();
               System.out.println("You got: " + sword.getName());
          }
     }
}
