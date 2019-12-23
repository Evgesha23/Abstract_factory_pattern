package advanture.Season;

import advanture.Tour.*;

import java.util.*;

public class Winter implements Season {
    Scanner cin = new Scanner(System.in);

    @Override
    public void paint() {
        System.out.println("Вы выбрали сезон года: Зима");
    }
    @Override
    public void game() {
        System.out.println("Введите желаемое развлечение: ");
        System.out.println("1 - Лыжи");
        System.out.println("2 - Поднятие в гору");
        System.out.println("3 - Коньки");
        int number = cin.nextInt();
        switch (number) {
            case 1: System.out.println("Вы выбрали: Лыжи"); break;
            case 2: System.out.println("Вы выбрали: Поднятие в гору"); break;
            case 3: System.out.println("Вы выбрали: Коньки"); break;
            default: System.out.println("Вы ничего не выбрали"); break;
        }
    }
}
