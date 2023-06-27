package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class EvenThread implements Runnable{
    private List<Integer> arrayList;
    private List<Integer> evenNumberList;
    private final Object LOCK = new Object();

    public EvenThread(List<Integer> arrayList, List<Integer> evenNumberList) {
        this.arrayList = arrayList;
        this.evenNumberList = evenNumberList;
    }

    public void run() {
        for (int i = 0 ; i < arrayList.size() ; i++){
            synchronized (LOCK){
                if (arrayList.get(i) % 2 == 0){
                    this.evenNumberList.add(arrayList.get(i));
                }
            }
        }
    }
}
