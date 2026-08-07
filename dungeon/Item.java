package dungeon;
public abstract class Item {
     protected String name;
     protected String type;
     protected String desc;

     public Item(String name, String type, String desc){
          this.name = name;
          this.type = type;
          this.desc = desc;
     }

     public String getName(){
          return this.name;
     }

     public String getType(){
          return this.type;
     }

     public String getDesc(){
          return this.desc;
     }

}
