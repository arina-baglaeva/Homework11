import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        int year = 2000;
        task1VisocosniOrNot(year);
        byte clientOs = 1;
        int currentYear = LocalDate.now().getYear();
        int rastToClient = 95;
        task2VersionApp(currentYear, clientOs);
        task3Dostavka(rastToClient);
    }
    public static void task1VisocosniOrNot(int year)
    {
        if(year%4==0 && year%100!=0){
            System.out.println(year +" год является високосным.");
        }else if (year%400==0){
            System.out.println(year +" год является високосным.");
        }else{
            System.out.println(year +" год не является високосным.");
        }

    }
    public static void task2VersionApp( int clientDeviceYear, byte clientOS)
    {
        System.out.println("Текущий год: "+ clientDeviceYear);
        if(clientDeviceYear <2015){
            if (clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }else{
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

    }
    public static void task3Dostavka(int distance)
    {
        System.out.println("Расстояние до клиента: "+ distance);
        if (distance <=20){
            System.out.println("Потребуется дней: 1 ");
        }
        else if(20< distance && distance<60){

            System.out.println("Потребуется дней: 2 ");
        }else if (60<= distance && distance<=100){

            System.out.println("Потребуется дней: 3 ");
        }else{
            System.out.println("Нет доставки.");
        }

    }
}
