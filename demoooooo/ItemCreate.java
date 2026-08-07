package demoooooo;

public class ItemCreate {
     // Sword
     public static class Swords {
          public static Sword woodenSword(){
               return new Sword("Wooden Sword", 5.2f, "A Sword from wood");
          }

          public static Sword stoneSword(){
               return new Sword("Stone Sword", 9.7f, "A Sword from stone");
          }

          public static Sword grassSword(){
               return new Sword("Grass Sword", 3.2f, "A Sword from grass", 40f);
          }
     }
}
