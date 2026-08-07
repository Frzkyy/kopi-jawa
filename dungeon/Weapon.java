package dungeon;

public class Weapon extends Tool{

     enum weaponTypes {
          MELEE,
          RANGE
     }

     protected int damage;
     protected weaponTypes weaponType;

     public Weapon(String name, String desc, int damage, weaponTypes weaponType){
          this(name, desc, damage, weaponType,100);
     }

     public Weapon(String name, String desc, int damage,weaponTypes weaponType, int maxDurability){
          super(name, types.WEAPON, desc, maxDurability);
          this.damage = damage;
          this.weaponType = weaponType;
     }

     public String getWeaponType(){
          if (weaponType.equals(weaponTypes.MELEE)) {
               return "Melee";
          }else if (weaponType.equals(weaponTypes.RANGE)) {
               return "Range";
          }
          return "Unknown";
     }
}
