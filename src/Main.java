import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Введите название задачи");
            String taskName = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение задачи?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов потребуется на выполнение задачи?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут потребуется на выполнение задачи?");
            int minutes = Integer.parseInt(scanner.nextLine());
            System.out.println("Для завершения работы нажмите 'end' / для продолжения нажмите enter ");

            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            if (biggestTime < currentTimeTask) {
                biggestTime = currentTimeTask;
            }

            if (currentTimeTask < smallestTime) {
                smallestTime = currentTimeTask;
            }
            String end = scanner.nextLine();

            if ("end".equals(end)) {
                System.out.println("Завершение программы!");
                break;
            }
        }

        System.out.println("Всего потребуется: " + totalTime + " секунд");
        System.out.println("Самая продолжительная задача займет: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача займет: " + smallestTime + " секунд");
    }

    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = (minutes * 60) + (hours * 3600) + (days * 3600 * 24);
        return seconds;
    }
}