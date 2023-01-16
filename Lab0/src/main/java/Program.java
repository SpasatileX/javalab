import java.util.Scanner;

public class Program
{
    static Scanner cin;
    public static void main(String[] args) {
        cin = new Scanner(System.in);
        task7();
    }
    public static void task1(){
        System.out.println("Enter bytes: ");
        Scanner cin = new Scanner(System.in);
        int inputByte = cin.nextInt();
        System.out.println("Resualt: " + inputByte / 1024);
    }

    public static void task2(){
        System.out.println("Enter A: ");
        int num = cin.nextInt();
        if(num%2 == 0){
            System.out.println("A is even");
        }else{
            System.out.println("A is not even");
        }
    }

    public static void task3() {
        System.out.println("Enter num: ");
        int num = cin.nextInt();
        if(num<0){
            num = num - 2;
        }else if(num == 0){
            num = 10;
        }else{
            num++;
        }
        System.out.println("Num res: " + num);
    }
    public static void task4(){
        System.out.println("Enter num (1-12): ");
        int num = cin.nextInt();
        if(num < 1 || num > 12){
            System.out.println("Wrong input");
            task4();
            return;
        }

        switch (num){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Autumn");
                break;

        }
    }
    public static void task5(){
        System.out.println("Enter A: ");
        int a = cin.nextInt();
        System.out.println("Enter B (A < B): ");
        int b = cin.nextInt();

        if(!(a < b)){
            System.out.println("Wrong input");
            task5();
            return;
        }

        System.out.println("N: " + (b - a));
        for(int i = 0; i < b - a; i++){
            System.out.println(a + i);
        }
    }
    public static void task6(){
        System.out.println("Enter N (N > 0): ");
        int n = cin.nextInt();
        System.out.println("Enter K (K > 0): ");
        int k = cin.nextInt();

        if(n < 0 || k < 0){
            System.out.println("Wrong input");
            task6();
            return;
        }

        // виникли проблеми з перекладом завдання
    }
    public static void task7(){
        System.out.println("Enter N (>1): ");
        int n = cin.nextInt();

        if(n < 1){
            System.out.println("Wrong input");
            task7();
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter A: ");
        array[0] = cin.nextInt();

        System.out.println("Enter D: ");
        int d = cin.nextInt();

        System.out.println("Array: \n "+ array[0]);
        for(int i = 1; i < n; i++){
            array[i] = array[0] + i * d;
            System.out.println(array[i]);
        }

    }
    public static void task8(){
        // не зрозумів умову.
    }
}
