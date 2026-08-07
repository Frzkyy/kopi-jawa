package demoooooo;

public abstract class Weapon extends Item{
     protected float damage;
     private float maxDurability;
     protected float durability;
     private boolean broken = false;
     protected String weaponType;

     public Weapon(String name, String weaponType ,float damage, String desc){
          this(name, weaponType,damage, desc, 100f);
     }

     public Weapon(String name, String weaponType,float damage, String desc, float maxDurability){
          super(name, "Weapon", desc);
          this.damage = damage;
          this.maxDurability = maxDurability;
          this.durability = maxDurability;
          this.weaponType = weaponType;
     }

     public void repair(float amount){
          this.durability += amount;
          if (this.durability >= this.maxDurability) {
               this.durability = this.maxDurability;
          }
     }

     public void reduceDurability(float amount){
          this.durability -= amount;
          if (this.durability <= 0) {
               this.durability = 0;
               this.broken = true;
          }

     }

     public boolean isBroken(){
          return this.broken;
     }

     public float getDurability(){
          return this.durability;
     }

     public float getDamage(){
          return this.damage;
     }

     public String getWeaponType(){
          return this.weaponType;
     }
}

