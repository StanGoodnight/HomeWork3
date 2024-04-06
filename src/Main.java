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
    }
}