package dungeon;

import java.util.Random;

public class LootBox {
     private static final Random random = new Random();

     public static Sword NormalLootBox_Sword(){
          int chance = random.nextInt(100);
          if (chance < 40) {
               return ItemCreate.swords.grassSword();
          } else if (chance < 65) {
               return ItemCreate.swords.woodenSword();
          } else if (chance < 82) {
               return ItemCreate.swords.stoneSword();
          } else if (chance < 93) {
               return ItemCreate.swords.ironSword();
          } else if (chance < 98) {
               return ItemCreate.swords.goldSword();
          } else {
               return ItemCreate.swords.diamondSword();
          }
     }
}
