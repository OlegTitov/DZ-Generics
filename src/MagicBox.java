import java.util.Random;

public class MagicBox<T> {
    private T objects;
    private int numberOfitems;
    Random random = new Random();

    public MagicBox(T objects, int numberOfitems) {
        this.objects = objects;
        this.numberOfitems = numberOfitems;
    }
    public boolean add(T item) {
        if (items.length > itemCount) {
            return true;
        } else {
            return false;
        }
    }
    public T pick() throws RuntimeException {
        if (itemCount < items.length) {
            throw new RuntimeException("Коробка ещё не полна, осталось заполнить 3 ячейки");
        }
        return(int randomInt = random.nextInt());
    }
}
