package dungeon;

public class Sword extends Weapon{

     public Sword(String name, String desc, int damage, int maxDurability){
          super(name, desc, damage, weaponTypes.MELEE, maxDurability);  
     }

     public Sword(String name, String desc, int damage){
          this(name, desc, damage, 100);
     }

     public int swing(int amount){
          if (this.isBreak()) {
               System.out.println("Sword is Broke");
               return 0;
          }
          this.decreaseDurability(amount);
          return this.damage;
     }
}