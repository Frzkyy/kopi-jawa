package kuliah;

public class Wlee {
     private int awal;
     private int akhir;

     public Wlee(int awal, int akhir){
          this.awal = awal;
          this.akhir = akhir;
     }

     public void tampilkanInfo(){
          System.out.println("Panjang: " + this.awal);
          System.out.println("lebar: " + this.akhir);
          System.out.println("luas: " + this.kali());
     }

     public int kali(){
          return this.awal * this.akhir;
     }
}