package task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> lol = new Pair<>(22,"Hi");
        System.out.println("First elem: " + lol.getFirst());
        System.out.println("Second elem: " + lol.getSecond());
        System.out.println("#######################");
        lol.setFirst(45);
        lol.setSecond("4eburek");
        System.out.println("NewFirst elem: " + lol.getFirst());
        System.out.println("NewSecond elem: " + lol.getSecond());


    }
}