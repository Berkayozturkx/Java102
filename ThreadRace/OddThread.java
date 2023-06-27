package Thread;

import java.util.ArrayList;
import java.util.List;

public class OddThread implements Runnable{
    private List<Integer> arrayList;
    private List<Integer> OddNumberList;

    private final Object LOCK = new Object();

    public OddThread(List<Integer> arrayList, List<Integer> oddNumberList) {
        this.arrayList = arrayList;
        this.OddNumberList = oddNumberList;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < arrayList.size() ; i++){
            synchronized (LOCK){
                if (arrayList.get(i) % 2 != 0){
                    this.OddNumberList.add(arrayList.get(i));
                }
            }
        }
    }
}
