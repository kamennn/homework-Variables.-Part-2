public class Main {
    public static void main(String[] args) {
        //задача 1//
        int a = 9;
        System.out.println(a);
        byte b = 2;
        System.out.println(b);
        short c = 4;
        System.out.println(c);
        long d = 502354234235235425l;
        System.out.println(d);
        float e = 2.8485389f;
        System.out.println(e);
        double f = 5.7;
        System.out.println(f);
        //задача 2//
        double one = 27.12;
        long two = 987678965549l;
        float fhree = 2.786f;
        boolean four = false;
        char five = 569;
        short sixe = -159;
        int seven = 27897;
        byte eight = 67;
        //задача 3//
        byte firstGradeStudents = 23;
        byte secondGradeStudents = 27;
        byte thirdGradeStudents = 30;
        short totalPaper = 480;
        int papersPerPupil = totalPaper / (firstGradeStudents + secondGradeStudents + thirdGradeStudents);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");
        //задача 4//
        int bottles = 16;
        int time = 2;
        int performance = bottles / time;
        System.out.println("За 1 минуту машина произвела бутылок " + performance + " штук");
        int time1 = 20;
        int performance1 = performance * time1;
        System.out.println("За " + time1 + " минут машина произвела бутылок " + performance1 + " штук");
        int time2 = 1440;
        int performance2 = time2 * performance;
        System.out.println("За " + time2 + " минут машина произвела бутылок " + performance2 + " штук");
        int time3 = 4320;
        int performance3 = time3 * performance;
        System.out.println("За " + time3 + " минут машина произвела бутылок " + performance3 + " штук");
        int time4 = 43200;
        int performance4 = time4 * performance;
        System.out.println("За " + time4 + " минут машина произвела бутылок " + performance4 + " штук");
        //задача 5//
        int totalCans = 120;
        int whitePainPertClass = 2;
        int brownPainPertClass = 4;
        int totalClasses = totalCans / (whitePainPertClass + brownPainPertClass);
        int totalWhitePain = totalClasses * whitePainPertClass;
        int totalBrownPain = totalClasses * brownPainPertClass;
        System.out.println( "В школе, где " + totalClasses + " классов, нужно " + totalWhitePain + " банок белой краски и " + totalBrownPain + " банок коричневой краски");
        //задача 6//
        int totalBananas = 5;
        int weightOfOneBanana = 80;
        int totalMilk = 200;
        int oneHundredMillilitersOfMilk = 105;
        int totolIceCream = 2;
        int iceCreamWeight = 100;
        int totalEggs = 4;
        int weighEgg = 70;
        int weighBananas = totalBananas * weightOfOneBanana;
        int weighMilk = totalMilk / 100 * oneHundredMillilitersOfMilk;
        int weighIceCream = totolIceCream * iceCreamWeight;
        int weighEggs = totalEggs * weighEgg;
        int gramSportsBreakfast = weighBananas + weighMilk + weighIceCream + weighEggs;
        int kilogram = 1000;//грамм//
        float kilogramSportsBreakfast = gramSportsBreakfast / (float)kilogram;
        System.out.println("вес в граммах " + gramSportsBreakfast + " такого спорт завтрака и в киллограммах " + kilogramSportsBreakfast);
        //задача 7//
        int needToResetInKilograms = 7;
        int needToResetInGrams = 7000;
        int loseGramsPerDay = 250;
        int daysNeeded = needToResetInGrams / loseGramsPerDay;
        System.out.println("нужно " + daysNeeded + " дней, чтобы сбросить " + needToResetInKilograms + " килограмм");
        int loseGramsPerDay2 = 500;
        int daysNeeded2 = needToResetInGrams / loseGramsPerDay2;
        System.out.println("нужно " + daysNeeded2 + " дней, чтобы сбросить " + needToResetInKilograms + " килограмм");
        //задача 8//
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float annualIncomeIncreased = ((float)masha / 100) * 10;
        float mashaNowReceives = annualIncomeIncreased + masha;
        System.out.println("Маша теперь получает " + mashaNowReceives + " рублей. Годовой доход вырос на " + annualIncomeIncreased + " рублей");
        float annualIncomeIncreased2 = ((float)denis / 100) * 10;
        float denisNowReceives = annualIncomeIncreased2 + denis;
        System.out.println("Динис теперь получает " + denisNowReceives + " рублей. Годовой доход вырос на " + annualIncomeIncreased2 + " рублей");
        float annualIncomeIncreased3 = ((float)kristina / 100) * 10;
        float kristinaNowReceives = annualIncomeIncreased3 + kristina;
        System.out.println("Кристина теперь получает " + kristinaNowReceives + " рублей. Годовой доход вырос на " + annualIncomeIncreased3 + " рублей");

    }
}