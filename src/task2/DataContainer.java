package task2;

import java.util.ArrayList;
import java.util.Iterator;

public class DataContainer<T> {
    private int size;
    private ArrayList<T> Container = new ArrayList<>();
    public DataContainer(int size){
        this.size = size;

    }

    public void add(T item){
        if(size > 0) {
            Container.add(item);
        }
        else{
            System.out.println("Вышли за границы массива!!!");
        }
        this.size--;
    }
    public T get(int index){
       return Container.get(index);
    }
    public void remove(int index){
        Container.remove(index);
    }
    public int getSize(){
       return Container.size();
    }


    // Метод итератор массива
    public void showList(){
        Iterator<T> iter = Container.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
