package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        double max = -1;
        while(start > 0){
            System.out.print("Number " + start + ": ");
            double input = scanner.nextDouble();
            if(input > max){
                max = input;
            }
            start++;
            if(input <= 0){
                start = -1;
            }
        }
        if(max == -1){
            System.out.println("No number entered.");
        }else{
            System.out.printf("The largest number is %.2f", max);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int input = scanner.nextInt();
        if(input <= 0){
            System.out.println("Invalid number!");
        }else{
            int start = 1;
            for(int i = 1; i <= input; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;
        char star = '*';
        char space = ' ';
        for(int i = 1; i <= ROWS; i++){
            for(int j = 1; j <= ROWS - i; j++){
                System.out.print(space);
            }
            for(int k = 1; k <= i * 2 - 1; k++){
                System.out.print(star);
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        }
        else{
            for (int i = 0; i < h / 2; i++) {
                rhombusCalc(h, c, i);
            }

            for (int i = h / 2; i >= 0; i--) {
                rhombusCalc(h, c, i);
            }
      }
    }

    private static void rhombusCalc(int h, char c, int i) {
        for (int k = h - i; k > h / 2 + 1; k--) {
            System.out.print(" ");
        }
        for (int j = i; j > 0; j--) {
            System.out.print((char) (c - j));
        }
        System.out.print(c);
        for (int j = 1; j < i + 1; j++) {
            System.out.print((char) (c - j));
        }
        System.out.println();
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        double sum = 0.00;
        int five = 0;
        int i = 0;
        while(start > 0){
            System.out.print("Mark " + start + ": ");
            double input = scanner.nextInt();
            if(input >= 1 && input <= 5){
                sum += input;
                start++;
            }else if(input == 0){
                i = start - 1;
                start = -1;
            }else{
                System.out.println("Invalid mark!");
            }
            if(input == 5){
                five++;
            }
        }
        if(start == -1){
            if(sum != 0) {
                sum /= i;
            }
            System.out.printf("Average: %.2f", sum);
            System.out.println("\nNegative marks: " + five);
        }
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int input = scanner.nextInt();
        int sum = 0;
        int start = input;
        while(sum != 1 && sum != 4){
            sum = 0;
            while(start > 0){
                sum += Math.pow(start % 10, 2);
                start /= 10;
            }
            start = sum;
        }
        if(sum == 1){
            System.out.println("Happy number!");
        }else{
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}