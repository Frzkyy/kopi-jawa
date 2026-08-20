package Tugas;
public class test {

     public static void main(String[] args) {
          Barang kue = new Barang("25071207048", "Rudal Iran", 19000.500f, 5);
          kue.tampilkanDetailBarang();
          System.out.println("==========");
          kue.tampilkanTotalharga();
          kue.kurangiStok(4);
          kue.tampilkanDetailBarang();

     }
}
