package pratice;//import java.util.Scanner;
//class Demo1 extends Thread{
//    @Override
//    public void run() {
//        System.out.println("printing Number started");
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("printing Number Ended");
//    }
//}
//
//class Demo2 extends Thread{
//    @Override
//    public void run() {
//        System.out.println("Character printing started");
//        for(int i=65;i<70;i++){
//            System.out.println((char)i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Character printing Ended");
//    }
//}
//
//class Demo3 extends Thread{
//    @Override
//    public void run() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Adding Number started");
//        System.out.println("Enter the First Number");
//        int a = in.nextInt();
//        System.out.println("Enter the Second Number");
//        int b = in.nextInt();
//        int c = a+b;
//        System.out.println(c);
//        System.out.println("Adding Number Ended");
//    }
//}
//public class multiThreading2 {
//    public static void main(String[] args) {
//
//    Demo1 d1 = new Demo1();
//    Demo2 d2 = new Demo2();
//    Demo3 d3 = new Demo3();
//
////    d1.run();
////    d1.run();
////    d1.run();
//
//        d1.start();
//        d2.start();
//        d3.start();
//
//
//
//    }
//}
