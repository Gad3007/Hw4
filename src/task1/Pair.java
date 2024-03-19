package task1;

public class Pair<T,U> {
    private T firstItem;
    private U secondItem;
    public Pair(T firstItem,U secondItem){
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }
    public T getFirst(){
        return firstItem;
    }
    public U getSecond(){
        return secondItem;
    }
    public void setFirst(T firstItemNew){
        firstItem = firstItemNew;
    }
    public void setSecond(U secondItemNew){
        secondItem = secondItemNew;
    }

}
