package ListClass;

public class MyList <T>{

    public T[] list;
    public T[] tempList;
    public int capacity = 10;
    public int counter = 0;
    public T[] subList;

    public MyList(){
        this.capacity =10;
        this.setList();
    }

    public MyList(int capacity){
        this.capacity =capacity;
        this.setList();
    }

    public void setList(){
        this.list =(T[]) new Object[this.capacity];
    }

    public void increaseCapasity(){
        this.tempList = (T[]) new Object[this.capacity];
        for (int i = 0;i< this.list.length;i++){
            this.tempList[i] = this.list[i];
        }
        this.list=this.tempList;
    }

    public  int size(){
        return this.counter;
    }

    public void sizeCalculator(){
        int count = 0;
        for (int i = 0; i<this.list.length;i++){
            if (this.list[i]!= null){
                count++;
            }
        }
        this.counter = count;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void add (T data){
        if (this.size()<this.capacity){
            list[this.counter]=data;
            this.sizeCalculator();
        }else {
            this.capacity = this.capacity*2;
            this.increaseCapasity();
            this.add(data);
        }
    }

    //get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
    public T get(int index){
        if (index <= this.list.length-1 && index > 0){
            return this.list[index];
        }
        return null;
    }

    //remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı.
    // Geçersiz indis girilerse null döndürür.
    public T remove(int index){
        if (index <= this.list.length-1 && index > 0){
            for (int i = 0 ; i < this.list.length ; i++){
                if (i != index){
                    tempList[i] = list[i];
                }
            }
        }
        return null;
    }

    public T set(int index, T data){
        if (index > 0 && index < this.list.length){
            list[index] = data;
        }
        return null;
    }

    @Override
    public String toString(){
        System.out.print("[");
        for (T x:list){
            if (x!= null){
                System.out.print(x+ ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public int indexOf(T data){
        for (int i = 0; i < this.list.length ; i++){
            if (list[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int index = -1;
        for (int i = 0 ; i < this.list.length ; i++){
            index = i;
        }

        return index;
    }

    public boolean isEmpty(){
        if (this.size() == 0){
            return true;
        }
        return false;
    }

    public Object[] toArray(){
        Object[] tempObject =new Object[this.list.length];
        for (int i =0;i<this.list.length;i++){
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public MyList<T> subList(int start, int finish){
        MyList<T> sub =new MyList<>(finish - start +1);
        for (int i = start; i<= finish; i++){
            sub.add((T)this.list[i]);
        }
        return sub;
    }

    public boolean contains(T data){
        for (int i = 0 ; i < this.list.length ; i++){
            if (list[i] == data){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0 ; i < this.list.length ; i++){
            list[i] = null;
        }
    }
}
