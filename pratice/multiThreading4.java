package pratice;

import java.util.Scanner;

class Demo implements Runnable{
    @Override
    public void run() {
       Thread t = Thread.currentThread();
       String s =t.getName();

       if(s.equals("ADD")==true){
           add();
       }
       else if(s.equals("CHAR")){
           printingNum();
       }else{
           characterPrint();
       }
    }
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Adding Number started");
        System.out.println("Enter the First Number");
        int a = in.nextInt();
        System.out.println("Enter the Second Number");
        int b = in.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Adding Number Ended");
    }


    public void printingNum(){
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
    }

    public void characterPrint(){
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
    }

}


public class multiThreading4 {
    public static void main(String[] args) {

        Demo d = new Demo();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();



    }
}
