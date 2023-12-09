public class Main {
    public static void main(String[] args) {

        // Задача 1
        int intNumber = -2_147_483_648;
        byte byteNumber = -128;
        short shortNumber = -32_768;
        long longNumber = 9_223_372_036_854_775_807L;
        float floatNumber = 12.1234567F;
        double doubleNumber = 12345.12345678901;

        System.out.println("Значение переменной «intNumber» с типом int равно: " + intNumber + ".");
        System.out.println("Значение переменной «byteNumber» с типом byte равно: " + byteNumber + ".");
        System.out.println("Значение переменной «shortNumber» с типом short равно: " + shortNumber + ".");
        System.out.println("Значение переменной «longNumber» с типом long равно: " + longNumber + ".");
        System.out.println("Значение переменной «floatNumber» с типом float равно: " + floatNumber + ".");
        System.out.println("Значение переменной «doubleNumber» с типом double равно: " + doubleNumber + ".");

        // Задача 2

        int intNumber1 = 569;
        byte byteNumber1 = 67;
        short shortNumber1 = -159;
        short shortNumber11 = 27_897;
        long longNumber1 = 987_678_965_549L;
        float floatNumber1 = 27.12F;
        double doubleNumber1 = 2.786;

        // Задача 3

        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short totalSheets = 480;
        int sheetsForEach = totalSheets / (classLP + classAS + classEA);
        System.out.println("\nНа каждого ученика рассчитано " + sheetsForEach + " листов бумаги");

        // Задача 4
        byte productivity2 = 16;
        byte productivity1 = (byte)(productivity2 / 2);
        short productivity20 = (short) (productivity1 * 20);
        short productivity1day = (short)(productivity1 * 60 * 24);
        int productivity3days = productivity1day * 3;
        int productivity1month = productivity1day * 31;
        System.out.println("\nЗа 2 минуты машина произвела " + productivity2 + " штук бутылок.");
        System.out.println("За 20 минут машина произвела " + productivity20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + productivity1day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + productivity3days + " штук бутылок.");
        System.out.println("За месяц машина произвела " + productivity1month + " штук бутылок.");

        // Задача 5
        short totalBanks = 120;
        short classes = 120 / (4 + 2);

        short whiteBanks = (short) (classes * 2);
        short brownBanks = (short) (classes * 4);
        System.out.println("\nВ школе, где " + classes + " классов, нужно " + whiteBanks + " банок белой краски и " + brownBanks + " банок коричневой краски");

        // Задача 6
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int weight = bananas + milk + iceCream + eggs;

        System.out.println("\nВес завтрака спортсмена: " + weight + " гр.");

        // Задача 7

        int totalWeightLoss = 7000;
        int maxDailyWeightLoss = 500;
        int minDailyWeightLoss = 250;
        int avgDailyWeightLoss = (minDailyWeightLoss + maxDailyWeightLoss) / 2;
        short maxDays = (short) (totalWeightLoss / minDailyWeightLoss);
        short minDays = (short) (totalWeightLoss / maxDailyWeightLoss);
        short avgDays = (short)(Math.ceil((double) totalWeightLoss / avgDailyWeightLoss));
        System.out.println("\n" + maxDays + " дней уйдёт для похудения спортсмена на 7кг, при наименьшем сбросе веса ");
        System.out.println(minDays + " дней уйдёт для похудения спортсмена на 7кг, при наибольшем сбросе веса ");
        System.out.println(avgDays + " дней уйдёт для похудения спортсмена на 7кг, при среднем темпе сброса веса ");

        // Задача 8
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int newSalaryMasha = (int) Math.ceil(67_760 * 1.1f);
        int newSalaryDenis = (int) Math.ceil(83_690 * 1.1f);
        int newSalaryKristina = (int) Math.ceil(76_230 * 1.1f);
        int incrYaerlySalaryMasha = newSalaryMasha * 12 - salaryMasha * 12;
        int incrYaerlySalaryDenis = 12 * (newSalaryDenis - salaryDenis);
        System.out.println("\nМаша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + incrYaerlySalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + incrYaerlySalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + 12 * (newSalaryKristina - salaryKristina) + " рублей");
    }
}