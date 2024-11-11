public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        int age = 13 ;
        if (age >= 18) {System.out.println("Если возраст человека равен " + age + " он совереннолетний");}
        else {
            System.out.println("Если возраст человека равен " + age + " он несовереннолетний"); }


        System.out.println("Задача 2");
        int temperature = 3 ;
        if (temperature >= 5) {System.out.println("На улице " + temperature + " градусов, можно идти без шапки. ");}
        else { System.out.println("На улице " + temperature + " градусов,нужно надеть шапку.");}


        System.out.println("Задача 3 ");
        int speed = 61 ;
        if (speed <= 60) {System.out.println("Если скорость " + speed + " , то можно ездить спокойно");}
        else { System.out.println("Если скорость " + speed + " придется заплатить штраф.");}


        System.out.println("Задача 4 ");
        int age1 = 6;
        if (age1>=2 && age1<=6) { System.out.println("Если возраст человека равен " + age1 +" , то ему нужно ходить в детский сад.");}
        int age2 = 17;
        if (age2>=7 && age2<=17) { System.out.println("Если возраст человека равен " + age2 +" , то ему нужно ходить в школу.");}
        int age3 = 18;
        if (age3>=18 && age3<=24) { System.out.println("Если возраст человека равен " + age3 +" , то его место в университете.");}
        int age4 = 25;
        if (age4>24) { System.out.println("Если возраст человека равен " + age4 +" , то ему пора ходить на работу.");}

        System.out.println( "Задача 5");

        int year1 = 15;
        boolean thereIsAnEscort = true;
        if (year1 >14) {System.out.println("Если возраст ребенка равен " + year1 + " то он может кататься на аттракционе.");}
        if (year1<5) {System.out.println("Если возраст ребенка равен " + year1 + " то он не может кататься на аттракционе.");}
        if (year1 > 5 && year1 < 14) {
            if (thereIsAnEscort) {
                System.out.println("Если возраст ребенка равен " + year1 + " то он может кататься только в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + year1 + " и, если взрослого нет, то кататься нельзя");}

        }

        System.out.println("Задание 6");
        int allPlace = 102;
        int seating = 60;
        int standing = allPlace - seating;
        int buySeating = 50;
        int buyStanding = 20;
        if (buySeating < seating){
            System.out.println("В вагоне есть сидячие места");}
        else if (buySeating==seating && buyStanding<standing ) { System.out.println("В вагоне есть стоячие места");}
        else if (buyStanding==seating && buyStanding==standing) {System.out.println("Вагон полностью забит");}




        System.out.println("Задание 7");





    }

}