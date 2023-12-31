public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1(){
        System.out.println("Задание 1");
        for(int i = 1; i <= 10; i += 1){
            System.out.println(i);
        }
    }

    public static void task2(){
        System.out.println("Задание 2");
        for(int i = 10; i >= 1; i -= 1){
            System.out.println(i);
        }
    }

    public static void task3(){
        System.out.println("Задание 3");
        for(int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }
    }

    public static void task4(){
        System.out.println("Задание 4");
        for(int i = 10; i >= -10; i -= 1){
            System.out.println(i);
        }
    }

    public static void task5(){
        System.out.println("Задание 5");
        for(int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6(){
        System.out.println("Задание 6");
        for(int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
    }

    public static void task7(){
        System.out.println("Задание 7");
        for(int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }
    }

    public static void task8(){
        System.out.println("Задание 8");
        int savings = 29_000;
        int depositAmount = 0;
        for(int i = 1; i <= 12; i++){
            depositAmount += savings;
            System.out.println("Месяц " + i +"-й, сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task9(){
        System.out.println("Задание 9");
        int savings = 29_000;
        int depositAmount = 0;
        double clientPercentPerMonth = 1.01;
        for(int i = 1; i <= 12; i++){
            depositAmount *= clientPercentPerMonth;
            depositAmount += savings;
            System.out.println("Месяц " + i +"-й, сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task10(){
        System.out.println("Задание 10");
        int firstMultiplier = 2;
        int productOfNumbers;
        for(int i = 1; i <= 10; i++){
            productOfNumbers = firstMultiplier * i;
            System.out.println(firstMultiplier + " * " + i + " = " + productOfNumbers);
        }
    }
}