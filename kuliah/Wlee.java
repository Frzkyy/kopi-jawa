package kuliah;

public class Wlee {
     private int awal;
     private int akhir;

     public Wlee(int awal, int akhir){
          this.awal = awal;
          this.akhir = akhir;
     }

     public int kali(){
          return this.awal * this.akhir;
     }
}