package pratice;

import java.util.Scanner;

public class multiThreading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("printing Number started");
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("printing Number Ended");
        System.out.println("Character printing started");
        for(int i=65;i<70;i++){
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Character printing Ended");

        System.out.println("Adding Number started");
        System.out.println("Enter the First Number");
        int a = in.nextInt();
        System.out.println("Enter the Second Number");
        int b = in.nextInt();
        int c = a+b;
        System.out.println(c);
        System.out.println("Adding Number Ended");

    }
}
