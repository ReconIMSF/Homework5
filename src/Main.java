//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        //Задача 1
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задача 2
        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        byte clientOS1 = 1;
        if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //второй вариант
        System.out.println("Задача 2, второй вариант решения");
        short clientDeviceYear1 = 2015;
        byte clientOS2 = 1;
        if (clientDeviceYear1 < 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear1 >= 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задача 3
        System.out.println("Задача 3");
        short year = 2021;
        boolean leapYearStart = year >= 1584;
        if (leapYearStart && year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (leapYearStart) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Високосного года не было ранее 1584 года");
        }

        //Задача 4
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Cвыше 100 км доставки нет");
        }

        //Второй вариант
        short deliveryDistance1 = 95;
        int deliveryTime1 = 0;
        if (deliveryDistance1 < 100) {
            if (deliveryDistance1 <= 20) {
                deliveryTime1 += 1;
                System.out.println("Потребуется дней: " + deliveryTime1);
            } else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
                deliveryTime1 += 2;
                System.out.println("Потребуется дней: " + deliveryTime1);
            } else if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
                deliveryTime1 += 3;
                System.out.println("Потребуется дней: " + deliveryTime1);
            }
        } else {
            System.out.println("Cвыше 100 км доставки нет");
        }

        //Задача 5
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}
