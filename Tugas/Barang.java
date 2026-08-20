package Tugas;

public class Barang {
     private String kode;
     private String nama;
     private float harga;
     private int stok;

     public Barang(String kode,String nama,float harga, int stok){
          this.kode = kode;
          this.nama = nama;
          this.harga = harga;
          this.stok = stok;
     }

     public void tampilkanDetailBarang(){
          System.out.println("Kode : " + this.kode);
          System.out.println("Nama : " + this.nama);
          System.out.println("Harga : " + this.harga);
          System.out.println("Stok : " + this.stok);
     }

     public void tampilkanTotalharga(){
          System.out.println("Total Harga: " + (this.harga * this.stok));
     }

     public float ambilTotalHarga(){
          return this.harga * this.stok;
     }

     public void ubahHarga(float harga){
          this.harga = harga;
     }

     public void kurangiStok(int stok){
          this.stok -= stok;
     }
}
