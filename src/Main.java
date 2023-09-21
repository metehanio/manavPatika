import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Meyveler ve KG Fiyatları

        Scanner kiloSor = new Scanner(System.in);

        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5.00;
        double ArmutSor, ElmaSor, DomatesSor, MuzSor, PatlıcanSor; // 5

        System.out.print("Armut Kaç Kilo ? : ");
        ArmutSor = kiloSor.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        ElmaSor = kiloSor.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        DomatesSor = kiloSor.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        MuzSor = kiloSor.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        PatlıcanSor = kiloSor.nextDouble();

        double toplamTutar = ((ArmutSor*Armut)+(ElmaSor*Elma)+(DomatesSor*Domates)+(MuzSor*Muz)+(PatlıcanSor*Patlıcan));

        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}