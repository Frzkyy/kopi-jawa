package dungeon;

public class Item {
     private String name;
     private types type;
     private String desc;

     enum types {
          ARMOR,
          TOOL,
          FOOD,
          POTION,
          WEAPON  
     }

     public Item(String name, types type, String desc){
          this.name = name;
          this.type = type;
          this.desc = desc;
     }

     public String getName(){
          return this.name;
     }

     public String getType(){
          switch (this.type) {
               case ARMOR: return "Armor";
               case TOOL: return "Tool";
               case FOOD: return "Food";
               case POTION: return "Potion";
               case WEAPON: return "Weapon";
               default: return "Unknown";
          }
     }

     public String getDesc(){
          return this.desc;
     }
}