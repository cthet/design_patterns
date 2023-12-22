package iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T>{
    private List<T> list;
    private int currentIndex = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return list.get(currentIndex++);
        }
        return null;
    }
}
