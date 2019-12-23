package advanture.Season;

import java.util.Scanner;

public class Autumn implements Season {
    @Override
    public void paint() {
        System.out.println("Вы выбрали сезон года: Осень");
    }
    @Override
    public void game() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Введите желаемое развлечение: ");
        System.out.println("1 - Рыбалка");
        System.out.println("2 - Фотосессия");
        System.out.println("3 - Кемпинг");
        int number = cin.nextInt();
        switch (number) {
            case 1: System.out.println("Вы выбрали: Рыбалка"); break;
            case 2: System.out.println("Вы выбрали: Фотосессия"); break;
            case 3: System.out.println("Вы выбрали: Кемпинг"); break;
            default: System.out.println("Вы ничего не выбрали"); break;
        }
    }
}
