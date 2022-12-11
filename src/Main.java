public class Main {
    public static void main(String[] args) {
        // Циклы. Часть 2
        System.out.println("\nЦиклы. Часть 2.");

        task1();  // Метод для задачи 1
        task2();  // Метод для задачи 2
        task3();  // Метод для задачи 3
        task4();  // Метод для задачи 4
        task5();  // Метод для задачи 5
        task6();  // Метод для задачи 6
        task7();  // Метод для задачи 7
        task8();  // Метод для задачи 8
    }

    public static void task1() {
        // Код для задачи 1 Расчет накоплений. Размер % и накопление с % по условиям задачи не заданы
        System.out.println("\nЗадача 1 ");
        int deposit = 0;
        int contribution = 15_000;
        int month = 0;
        while (deposit <= 2_459_000) {
            // deposit += deposit + deposit * 1 /100 + contribution;
            deposit += contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%,d", deposit) + " рублей");
        }
    }

    public static void task2() {
        // Код для задачи 2 Прямой и обратный счет до 10
        System.out.println("\nЗадача 2 ");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        // Код для задачи 3 Расчет численности населения на 10 лет
        System.out.println("\nЗадача 3");
        int citizenPopulation = 12_000_000;
        int citizenFertility = 17;
        int citizenMortality = 8;
        System.out.println("Начальная численность населения " + String.format("%,d", citizenPopulation));
        for (int year = 1; year <= 10; year++) {
            citizenPopulation += citizenPopulation / 1000 * (citizenFertility - citizenMortality);
            System.out.println("Год " + year + ", численность населения составляет " + String.format("%,d", citizenPopulation));
        }
    }

    public static void task4() {
        // Код для задачи 4 Расчет накоплений при постоянном депозите с %. Округление копеек на результпт не влияют
        System.out.println("\nЗадача 4 ");
        int deposit = 15_000;  // Расчет производим в целых рублях
        int bankInterest = 7;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit += deposit * bankInterest / 100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%,d", deposit) + " рублей");
        }
        System.out.println("Потребуется " + month + " месяцев");

        double depositD = 15_000.00;      // Расчет производим в рублях и копейках
        double bankInterestD = 7.0 / 100;
        int monthD = 0;
        while (depositD <= 12_000_000.00) {
            depositD += depositD * bankInterestD;
            monthD++;
            System.out.println("Месяц " + monthD + ", сумма накоплений равна " + String.format("%1$,.2f", depositD) + " рублей");
        }
        System.out.println("Потребуется " + monthD + " месяцев");
    }

    public static void task5() {
        // Код для задачи 5 Расчет депозита с выводом каждые 6 месяцев
        System.out.println("\nЗадача 5 ");
        double deposit = 15_000.00;     // Первоначальный вклад в рублях и копейках
        double bankInterest = 7.0 / 100;  // Банковский процент
        int month = 0;                    // Месяцы накопления
        do {
            deposit += deposit * bankInterest;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%1$,.2f", deposit) + " рублей");
            }
        }
        while (deposit <= 12_000_000.00);
        System.out.println("Результат: для накопления потребуется " + month + " месяцев");
    }

    public static void task6() {
        // Код для задачи 6 Расчет депозита на 9 лет, выводим результат накоплений каждые полгода
        System.out.println("\nЗадача 6 ");
        double deposit = 15_000.00;   // Исходная сумма в рублях и копейках
        double bankInterest = 7.0 / 100;   // Проценты банка, ежемесячно
        int totalMonth = 0;
        for (int year = 1; year <= 9; year++) {
            for (int month = 1; month <= 12; month++) {
                deposit += deposit * bankInterest;
                totalMonth++;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + String.format("%1$,.2f", deposit) + " рублей");
                }
            }
        }
        // System.out.println( "Количество месяцев, всего " + totalMonth );
    }

    public static void task7() {
        // Код для задачи 7 Напоминание отчетов каждую пятницу месяца
        System.out.println("\nЗадача 7 ");
        int firstFriday = 2;    // Первая пятница месяца, декабрь 2022
        for (int dayMonth = firstFriday; dayMonth <= 31; dayMonth += 7) {
            System.out.println("Сегодня пятница, " + dayMonth + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        // Код для задачи 8 Пролет кометы каждый 79 год
        System.out.println("\nЗадача 8 ");
        int periodCometFly = 79;
        int yearCurrent = 2022;                 // Текущий год
        int yearBefore200 = yearCurrent - 200;  // Год за 200 лет до текущего
        int yearAfter100 = yearCurrent + 100;  // Год через 100 лет от текущего
        for (int year = yearBefore200; year <= yearAfter100; year++) {
            if (year % periodCometFly == 0) {
                System.out.println(year);
            }
        }
    }
}