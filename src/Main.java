public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 326578;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = -14;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 2500;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 122_467_874_342L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.1f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = -2.555556566668;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Залача 2
        System.out.println("Задача 2");
        float dogWeight = 27.12f;
        long starsAmount = 987_678_965_549L;
        double ratWeight = 2.786;
        boolean dogIsSmall = false;
        char letter = 569;
        short justNumber = -159;
        int distance = 27897;
        byte age = 67;
        System.out.println(letter);

        // Задача 3
        System.out.println("Задача 3");
        byte amountPupils1 = 23;
        byte amountPupils2 = 27;
        byte amountPupils3 = 30;
        short totalSheets = 480;
        int amountSheetsOnePupil = totalSheets / (amountPupils1 + amountPupils2 + amountPupils3);
        System.out.println("На каждого ученика рассчитано " + amountSheetsOnePupil + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        byte bottlesAmount = 16;
        int timeMinute = 2;
        int productivityIn1Minute = bottlesAmount / timeMinute;
        System.out.println("За 1 минуту работы машина произвела бутылок " + productivityIn1Minute + " штук");
        timeMinute = 20;
        int productivity = productivityIn1Minute * timeMinute;
        System.out.println("За " + timeMinute + " минут работы машина произвела бутылок " + productivity + " штук");
        timeMinute = (timeMinute / 20) * 60 * 24; // количество минут в одних сутках
        productivity = productivityIn1Minute * timeMinute;
        System.out.println("За " + timeMinute + " минут (сутки) работы машина произвела бутылок " + productivity + " штук");
        timeMinute *= 3; // количество минут в трех днях
        productivity = productivityIn1Minute * timeMinute;
        System.out.println("За " + timeMinute + " минут (три дня) работы машина произвела бутылок " + productivity + " штук");
        timeMinute = (timeMinute / 3) * 30; // количество минут в месяце
        productivity = productivityIn1Minute * timeMinute;
        System.out.println("За " + timeMinute + " минут (месяц) работы машина произвела бутылок " + productivity + " штук");

        // Задача 5
        System.out.println("Задача 5");
        byte totalAmountPaint = 120;
        byte paintWhiteFor1Class = 2;
        byte paintBrownFor1Class = 4;
        int totalAmountClasses = totalAmountPaint / (paintWhiteFor1Class + paintBrownFor1Class);
        int totalAmountPaintWhite = paintWhiteFor1Class * totalAmountClasses;
        int totalAmountPaintBrown = paintBrownFor1Class * totalAmountClasses;
        System.out.println("В школе, где " + totalAmountClasses + " классов, нужно " + totalAmountPaintWhite + " банок белой краски и " + totalAmountPaintBrown + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananasWeightGram = 5 * 80;
        int milkWeightGram = 200 / 100 * 105;
        int iceCreamWeightGram = 2 * 100;
        int eggsWeightGram = 4 * 70;
        int totalWeightGram = bananasWeightGram + milkWeightGram + iceCreamWeightGram + eggsWeightGram;
        float totalWeightKilogram = totalWeightGram / 1000f;
        System.out.println("Вес спорт-завтрака " + totalWeightGram + " грамм или " + totalWeightKilogram + " килограмм");

        // Задача 7
        System.out.println("Задача 7");
        short overweightGram = 7000;
        short diet1InDayGram = 250;
        short diet2InDayGram = 500;
        int diet1Duration = overweightGram / diet1InDayGram;
        System.out.println(diet1Duration + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + diet1InDayGram + " грамм");
        int diet2Duration = overweightGram / diet2InDayGram;
        System.out.println(diet2Duration + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + diet2InDayGram + " грамм");
        int averageDietDuration = (diet1Duration + diet2Duration) / 2;
        System.out.println(averageDietDuration + " дней в среднем потребуется, чтобы добиться результата похудения");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float newSalaryMasha = 1.1f * salaryMasha;
        float newSalaryDenis = 1.1f * salaryDenis;
        float newSalaryKristina = 1.1f * salaryKristina;
        float annualIncomeGrowthMasha = (newSalaryMasha - salaryMasha) * 12;
        float annualIncomeGrowthDenis = (newSalaryDenis - salaryDenis) * 12;
        float annualIncomeGrowthKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeGrowthMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeGrowthDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeGrowthKristina + " рублей");

    }
}