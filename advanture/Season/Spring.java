package advanture.Season;

import java.util.Scanner;

public class Spring implements Season {
    @Override
    public void paint() {
        System.out.println("Вы выбрали сезон года: Весна");
    }
    @Override
    public void game() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Введите желаемое развлечение: ");
        System.out.println("1 - Полет на дельтаплане");
        System.out.println("2 - Катание на лошадях");
        System.out.println("3 - Поход в спортзал");
        int number = cin.nextInt();
        switch (number) {
            case 1: System.out.println("Вы выбрали: Полет на дельтаплане"); break;
            case 2: System.out.println("Вы выбрали: Катание на лошадях"); break;
            case 3: System.out.println("Вы выбрали: Поход в спортзал"); break;
            default: System.out.println("Вы ничего не выбрали"); break;
        }
    }
}
