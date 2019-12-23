package advanture;

import advanture.factories.*;

import java.util.Scanner;

public class Main {
    /*
    * абстрактная фабрика - порождающий паттерн проектирования,
    * который решает проблему создания целых семейств
    * связанных продуктов, без указания конкретных классов продуктов.*/

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("\nВыберите тур: ");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Example");
            System.out.println("2 - Choose");
            System.out.println("0 - exit");
            System.out.println("--------------------------------------------");
            number = cin.nextInt();

            switch (number) {
                case 1:
                    TourAgency tour1 = new TourAgency(new TourAgencyFactoryVitebsk());
                    tour1.paint();

                    TourAgency tour2 = new TourAgency(new TourAgencyFactoryMinsk());
                    tour2.paint();
                    break;
                case 2:
                    TourAgency tour = new TourAgency(new TourAgencyFactory());
                    tour.paint();
                    break;
                case 0:
                    return;
            }
        }
    }
}
