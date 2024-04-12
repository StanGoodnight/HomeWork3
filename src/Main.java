public class Main {
    public static void main(String[] args) {
        int a = 2140560327;
        System.out.println("Значение переменной -a- с целочисленным типом данных равно " + a);

        byte b = 123;
        System.out.println("Значение переменной -b- с целочисленным типом данных равно " + b);

        short c = 23356;
        System.out.println("Значение переменной -с- с целочисленным типом данных равно " + c );

        long d = 9122336545567188590L;
        System.out.println("Значение переменной -d- с целочисленным типом данных равно " + d );

        float e = 3.4546738f;
        System.out.println("Значение переменной -e- с типом данных с плавающей точкой равно " + e);

        double f = 1.2345465754657567;
        System.out.println("Значение переменной -f- с типом данных с плавающей точкой равно " + f);

        float g = 27.12F;
        System.out.println(g);

        long art = 987678965549L;
        System.out.println(art);

        double pic = 2.786;
        System.out.println(pic);

        short thorn = 569;
        System.out.println(thorn);

        short storm = -159;
        System.out.println(storm);

        short cargo = 27897;
        System.out.println(cargo);

        byte mug = 67;
        System.out.println(mug);

        byte atLyudmila = 23;
        System.out.println("У Людмилы Павловны - " + atLyudmila + " ученика.");

        byte atAnna = 27;
        System.out.println("У Анны Сергеевны - " + atAnna + " учеников.");

        byte atEkaterina = 30;
        System.out.println("У Еквтерины Андреевны - " + atEkaterina + " учеников.");

        short sheetsOfPaper = 480;
        System.out.println("Всего закупили листов бумаги - " + sheetsOfPaper + " штук.");

        int totalStudents = atAnna + atEkaterina + atLyudmila;
        System.out.println("Всего учеников - " + totalStudents + ".");

        int sheetsPerStudent = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано - " + sheetsPerStudent + " листов бумаги.");

        byte bottlesIn2minutes = 16;
        System.out.println("Бутылок за 2 минуты - " + bottlesIn2minutes + ".");

        byte timeFor16bottles = 2;
        System.out.println("Времени на " + bottlesIn2minutes + " бутылок - " + timeFor16bottles + ".");

        int bottlesPerMinute = bottlesIn2minutes / timeFor16bottles;
        System.out.println("Бутылок в минуту - " + bottlesPerMinute + ".");

        int in20minute = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела - " + in20minute + " штук бутылок.");

        int inAnHour = bottlesPerMinute * 60;
        System.out.println("Бутылок в час - " + inAnHour + ".");

        int perDay = inAnHour * 24;
        System.out.println("За сутки машина произвела - " + perDay + " штук бутылок.");

        int in3days = perDay * 3;
        System.out.println("За 3 дня машина произвела - " + in3days + " штук бутылок.");

        int inMonth = perDay * 30;
        System.out.println("За 1 месяц машина произвела - " + inMonth + " штук бутылок.");

        byte whitePaintFor1stGrade = 2;
        System.out.println("Белой краски на 1 класс - " + whitePaintFor1stGrade + ".");

        byte brownPaintFor1stGrade = 4;
        System.out.println("Коричневой краски на 1 класс - " + brownPaintFor1stGrade + ".");

        byte totalCansOfPaint = 120;
        System.out.println("Всего банок краски купили - " + totalCansOfPaint + ".");

        int totalCansOfPaintPerClass = whitePaintFor1stGrade + brownPaintFor1stGrade;
        System.out.println("всего банок краски на 1 класс - " +totalCansOfPaintPerClass);

        int totalClasses = totalCansOfPaint / totalCansOfPaintPerClass;
        System.out.println("Всего классов - " + totalClasses + ".");

        int totalCansOfWhitePaint = totalClasses * whitePaintFor1stGrade;
        System.out.println("Всего купили - " + totalCansOfWhitePaint + " банок белой краски.");

        int totalCansOfBrownPaint = totalClasses * brownPaintFor1stGrade;
        System.out.println("Всего купили - " + totalCansOfBrownPaint + " банок коричневой краски.");

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски.");

        byte bananaWeight = 80;
        System.out.println("Вес 1 банана - " + bananaWeight + " грамм.");

        byte totalBananas = 5;
        System.out.println("Всего бананов - " + totalBananas + " штук.");

        int weightOfAllBananas = totalBananas * bananaWeight;
        System.out.println("Вес всех бананов - " + weightOfAllBananas + " грамм");

        byte milkWeight100milliliters = 105;
        System.out.println("Вес молока (100 мл) - " + milkWeight100milliliters + "грамм.");

        byte totalMilk = 2;
        System.out.println("Всего молока - " + totalMilk + " порции.");

        int totalWeightOfMilk = milkWeight100milliliters * totalMilk;
        System.out.println("Общиий вес молока - " + totalWeightOfMilk + " грамм.");

        byte iceCreamWeight = 100;
        System.out.println("Вес 1 брикета мороженного - " + iceCreamWeight + " грамм.");

        byte totalIceCream = 2;
        System.out.println("Всего брикетов мороженного - " + totalIceCream + " штук.");

        int totalWeightOfIceCream = iceCreamWeight * totalIceCream;
        System.out.println("Общий вес мороженного - " + totalWeightOfIceCream + " грамм");

        byte rawEggs = 70;
        System.out.println("Вес 1 сырого яйца - " + 70 + " грамм.");

        byte totalRawEggs = 4;
        System.out.println("Всего сырых яиц - " + totalRawEggs + " штук.");

        int totalWeightRawEggs = rawEggs * totalRawEggs;
        System.out.println("Общий вес сырых яиц - " + totalWeightRawEggs + " грамм.");

        int sportsBreakfastWeight = weightOfAllBananas + totalWeightOfMilk + totalWeightRawEggs + totalWeightOfIceCream;
        System.out.println("Вес спортзавтрака - " + sportsBreakfastWeight + " грамм.");

        float weightOfSportsBreakfastInKilograms = sportsBreakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака - " + weightOfSportsBreakfastInKilograms + " килограмм.");

        byte needToReset = 7;
        System.out.println("Нужно сбросить - " + needToReset + " кг.");

        int needToReset2 = needToReset * 1000;
        System.out.println("Нужно сбросить - " + needToReset2 + " г.");

        short diet1 = 250;
        System.out.println("Можно сбросить с лёгкой диетой - " + diet1 + " г., в день.");

        short diet2 = 500;
        System.out.println("Можно сбросить с тяжелой диетой - " + diet2 + " г., в день.");

        int daysForALightDiet = needToReset2 / diet1;
        System.out.println(daysForALightDiet + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + diet1 + " г., в день.");

        int daysForAHeavyDiet = needToReset2 / diet2;
        System.out.println(daysForAHeavyDiet + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + diet2 + " г., в день.");

        int diet3 = (diet1 + diet2) / 2;
        System.out.println("Можно сбросить со средней диетой - " + diet3 + " г., в день.");

        int daysForAnAverageDiet = needToReset2 / diet3;
        System.out.println(daysForAnAverageDiet + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + diet3 + " г., в день.");

        int mashaGets = 67760;
        System.out.println("Маша получает - " + mashaGets + " рублей.");

        int mashaIncomePerYear = (mashaGets * 10) * 12;
        System.out.println("Годовой доход Маши составлял - " + mashaIncomePerYear + " рублей.");

        int mashaWillReceive = (mashaGets / 100) * 10 + mashaGets;
        System.out.println( "Маша теперь получает - " + mashaWillReceive + " рублей.");

        int mashaIncomeHasIncreased = (mashaWillReceive * 10) * 12;
        System.out.println("Годовой доход Маши вырос на - " + mashaIncomeHasIncreased + " рублей.");

        int denisGets = 83690;
        System.out.println("Денис получает - " + denisGets + " рублей.");

        int denisIncomePerYear = (denisGets* 10) * 12;
        System.out.println("Годовой доход Дениса составлял - " + denisIncomePerYear + " рублей.");

        int denisWillReceive = (denisGets / 100) * 10 + denisGets;
        System.out.println( "Денис теперь получает - " + denisWillReceive + " рублей.");

        int denisIncomeHasIncreased = (denisWillReceive * 10) * 12;
        System.out.println("Годовой доход Дениса вырос на - " + denisIncomeHasIncreased + " рублей.");

        int kristinaGets = 76230;
        System.out.println("Кристина получает - " + kristinaGets + " рублей.");

        int kristinaIncomePerYear = (kristinaGets* 10) * 12;
        System.out.println("Годовой доход Кристины составлял - " + kristinaIncomePerYear + " рублей.");

        int kristinaWillReceive = (kristinaGets / 100) * 10 + kristinaGets;
        System.out.println( "Кристина теперь получает - " + kristinaWillReceive + " рублей.");

        int kristinaIncomeHasIncreased = ( kristinaWillReceive * 10 ) * 12;
        System.out.println("Годовой доход Кристины вырос на - " + kristinaIncomeHasIncreased + " рублей.");

    }
}