package ch3_ScannerClass;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the your speed");
        double speed=scn.nextDouble();
        System.out.println("Please enter the distance ");
        double distance=scn.nextDouble();
        double duration = distance/speed;
        System.out.println("duration: " + duration);
    }



    }