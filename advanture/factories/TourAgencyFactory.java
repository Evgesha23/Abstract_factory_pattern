package advanture.factories;

import advanture.Season.*;
import advanture.Tour.*;

import java.util.Scanner;

public class TourAgencyFactory implements WorkFactory {
    Scanner cin = new Scanner(System.in);

    @Override
    public Tour chooseTour() {
        System.out.println("Категория (отдых, горы, экскурсия): ");
        String typeTour = cin.next();
        if (typeTour.compareTo("отдых") == 0) return new Rest();
        else if(typeTour.compareTo("горы") == 0) return new SkiTour();
        else if (typeTour.compareTo("экскурсия") == 0) return new Excursion();
        else return new Rest();
    }

    @Override
    public Season chooseSeason() {
        System.out.println("Сезон (зима, весна, лето, осень): ");
        String season = cin.next();
        if (season.compareTo("лето") == 0) return new Summer();
        else if (season.compareTo("зима") == 0) return new Winter();
        else if (season.compareTo("осень") == 0) return new Autumn();
        else if (season.compareTo("весна") == 0) return new Spring();
        else return new Summer();
    }

}
