package task_1;

import task_2.Game;

import java.util.Random;

public class main {

    public static void main(String[] args) {
//        MyArrayList<Integer> array = new MyArrayList<Integer>();
//        Random r = new Random();
//        for (int i = 0; i < 37; i++) {
//            array.add(r.nextInt(10));
//        }
//        System.out.println(array.size());
//
//        System.out.println(array.get(23));
//        array.add(23,3);
//        System.out.println(array.get(3));

        Game gm = new Game();
        new Thread(gm).start();
    }

}
