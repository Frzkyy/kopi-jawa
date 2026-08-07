package dungeon;

public class Main {
     public static void main(String[] args) {
          Weapon woodenSword = ItemCreate.Swords.grassSword();
          System.out.println(woodenSword.getWeaponType());
          System.out.println(woodenSword.getDamage());
          System.out.println(woodenSword.getDesc());
          System.out.println(woodenSword.getDurability());
          woodenSword.reduceDurability(50f);
          System.out.println(woodenSword.isBroken());
          System.out.println(woodenSword.getDurability());

          System.out.println(woodenSword.getType());

     }
}
