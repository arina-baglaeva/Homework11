import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        task1VisocosniOrNot(year);
        byte clientOs = 1;
        int yearDevice = 2018;
        int currentYear = LocalDate.now().getYear();
        int deliveryDistance = 95;
        task2VersionApp(currentYear, yearDevice, clientOs);
        task3Dostavka(deliveryDistance);
    }

    public static void task1VisocosniOrNot(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void task2VersionApp(int currentYear, int yearDevice, byte clientOS) {
        System.out.println("Текущий год: " + currentYear);
        System.out.println("Год устройства: " + yearDevice);
        String osName = (clientOS == 0) ? "iOS" : "Android";
        String version = (yearDevice >= currentYear) ? "обычную" : "облегченную";
        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке.");
    }

    public static void task3Dostavka(int distance) {
        System.out.println("Расстояние до клиента: " + distance);
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (distance <= 60) {

            System.out.println("Потребуется дней: 2 ");
        } else if (distance <= 100) {

            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Нет доставки.");
        }

    }
}
