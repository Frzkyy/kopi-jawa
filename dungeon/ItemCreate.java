package dungeon;

public class ItemCreate {
     // Swoord
     public static class swords{
          public static Sword woodenSword(){
               return new Sword("Wooden Sword", "Just a simple wood sword", 5);
          }

          public static Sword stoneSword(){
               return new Sword("Stone Sword", "A sword from golem dih", 6);
          }

          public static Sword ironSword(){
               return new Sword("Iron Sword", "Normies Sword", 7, 200);
          }

          public static Sword diamondSword(){
               return new Sword("Diamond Sword", "A luxury hard sharp good looking sword", 10, 500);
          }

          public static Sword goldSword(){
               return new Sword("Gold Sword", "A gold sword", 8, 60);
          }

          public static Sword grassSword(){
               return new Sword("Grass Sword", "Woooogly", 3, 30);
          }
     }
}