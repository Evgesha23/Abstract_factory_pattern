package advanture.Season;

import java.util.Scanner;

public class Summer implements Season {
    @Override
    public void paint() {
        System.out.println("Вы выбрали сезон года: Лето");
    }

    @Override
    public void game() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Введите желаемое развлечение: ");
        System.out.println("1 - Катание на водном скутере");
        System.out.println("2 - Пикник");
        System.out.println("3 - Дайвинг");
        int number = cin.nextInt();
        switch (number) {
            case 1: System.out.println("Вы выбрали: Катание на водном скутере"); break;
            case 2: System.out.println("Вы выбрали: Пикник"); break;
            case 3: System.out.println("Вы выбрали: Дайвинг"); break;
            default: System.out.println("Вы ничего не выбрали"); break;
        }
    }
}
