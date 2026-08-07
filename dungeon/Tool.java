package dungeon;

public class Tool extends Item {

     protected int maxDurability;
     protected int durability;
     private boolean broked = false;
     

     public Tool(String name, types type, String desc){
          this(name, type, desc, 100);
     }

     public Tool(String name, types type, String desc, int maxDurability){
          super(name, type, desc);
          this.maxDurability = maxDurability;
          this.durability = maxDurability;
     }

     public void increaseDurability(int amount){
          this.durability += amount;
          if (this.durability > this.maxDurability) {
               this.durability = this.maxDurability;
          }
     }

     public void decreaseDurability(int amount){
          this.durability -= amount;
          if (this.durability <= 0) {
               this.broked = true;
          }
     }

     public int getDurability(){
          return this.durability;
     }

     public int getMaxDurability(){
          return this.maxDurability;
     }

     public boolean isBreak(){
          return this.broked;
     }
}
