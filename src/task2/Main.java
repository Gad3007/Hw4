package task2;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    DataContainer<String> Cont1 = new DataContainer<>(3);
    Cont1.add("Apricot");
    Cont1.add("Watermelon");
    Cont1.add("Potato");
    Cont1.showList();
    System.out.println(Cont1.getSize());
    System.out.println("Elem at index 0: " + Cont1.get(0));
    Cont1.remove(0);
    System.out.println(Cont1.getSize());

    Cont1.showList();



    }
}
