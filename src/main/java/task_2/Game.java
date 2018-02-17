package task_2;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Game implements Runnable {
    Scanner sc = new Scanner(System.in);
    private String st = "bamm";
    public void run() {
        System.out.println("bamm");
        try {

            Thread.sleep(2000);
            if(sc.nextLine().equals(st)){
                run();
            }else{
                System.out.println("You Lost");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
