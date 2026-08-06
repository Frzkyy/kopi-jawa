import java.lang.Math;

class Helo {
     String x = "Holaaa";
}

public class test {

     static void myMethod(String name){
          System.out.println("Halo " + name);
     }


     public static void main(String[] args) {
     float f1 = 35e3f;
     double d1 = 12e4d;
     System.out.println(f1);
     System.out.println(d1);
     myMethod("fachrul");

     int a = (int) (Math.random()*101);
     System.out.println(a);


     Helo hola = new Helo();
     System.out.println(hola.x);
     }


}
