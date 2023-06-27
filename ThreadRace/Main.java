package Thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> array = new ArrayList<>();

        for (int i = 1 ; i <= 10000 ; i++){
            array.add(i);
        }

        List<Integer> altListe1 = array.subList(0,2500);
        List<Integer> altListe2 = array.subList(2500,5000);
        List<Integer> altListe3 = array.subList(5000,7500);
        List<Integer> altListe4 = array.subList(7500,10000);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        OddThread o1 = new OddThread(altListe1, oddNumbers);
        OddThread o2 = new OddThread(altListe2, oddNumbers);
        OddThread o3 = new OddThread(altListe3, oddNumbers);
        OddThread o4 = new OddThread(altListe4, oddNumbers);


        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);
        Thread t4 = new Thread(o4);


        EvenThread e1 = new EvenThread(altListe1, evenNumbers);
        EvenThread e2 = new EvenThread(altListe2, evenNumbers);
        EvenThread e3 = new EvenThread(altListe3, evenNumbers);
        EvenThread e4 = new EvenThread(altListe4, evenNumbers);

        Thread t5 = new Thread(e1);
        Thread t6 = new Thread(e2);
        Thread t7 = new Thread(e3);
        Thread t8 = new Thread(e4);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        t4.start();
        t4.join();

        t5.start();
        t5.join();

        t6.start();
        t6.join();

        t7.start();
        t7.join();

        t8.start();
        t8.join();


        System.out.println(oddNumbers.size());
        System.out.println(evenNumbers.size());
    }
}
