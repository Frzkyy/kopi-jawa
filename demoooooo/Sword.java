package demoooooo;

public class Sword extends Weapon{
     public Sword(String name, float damage, String desc){
          super(name, "Melee",damage, desc);
     }

     public Sword(String name, float damage, String desc, float maxDurability){
          super(name, "Melee",damage, desc, maxDurability);
     }
}
