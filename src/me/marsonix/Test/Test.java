package me.marsonix.Test;

import java.util.Random;
import java.util.Scanner;

public class Test {


    // Główna metoda main
    public static void main(String[] args) {

     //  char znak = 'A';


//       byte b = 127;
//       short s = 2000;
//       int i = 999_999_429;
//       long l = 242_353_535_335_35L;
//
//       boolean p = true;
//       float f = 100.455F;
//       double d = 124_424_200.4224D;
//
//
//       int zmienna1= 10;
//       int zmienna2 = 25;
//
//
//       String str = "Witaj świecie "+(b+zmienna1+zmienna2);
//
//       System.out.println(str.toLowerCase());



        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj a");
        double a = sc.nextDouble();
        System.out.println("Podaj b");
        double b = sc.nextDouble();
        System.out.println("Podaj c");
        double c = sc.nextDouble();  // https://tinyurl.com/wsbcode

        // b^2-4ac

        double delta = Math.pow(b, 2) - 4 * a * c;
        double pierwiastek = Math.sqrt(delta);

        if(delta>0){

            double x1 = ( -b-pierwiastek ) / ( 2 * a );
            double x2 = ( -b+pierwiastek ) / ( 2 * a );

            System.out.println("Wartość dla x1 "+x1);
            System.out.println("Wartość dla x2 "+x2);

        }
        else if(delta==0){
            double x = ( -b ) / ( 2 * a );
            System.out.println("Wartość dla x0 "+x);
        }else{
            System.out.println("Delta jest mniejsza niż 0");
        }







      //  double suma = Math.round(Math.random()*100);
      //  double pi = Math.PI;


//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        int wpisana = sc.nextInt();
//        int liczba = random.nextInt(4); // <0-3>
//
//        if(wpisana == liczba){ // wpisana liczba == wygenerowana
//            System.out.println("Brawo");
//        }





       // System.out.println(random.nextInt(999)+1);


     //   System.out.println(Math.sin(0));



       // System.out.println(suma);



    }

}
