package CodeChallages.Paris;

public class Pair<T extends Shoe> {
    private T first;
    private T second;
    public Pair(T firstElement, T secondElement)
    {
        if(firstElement.equals(secondElement)) {
            this.first = firstElement;
            this.second = secondElement;
        }

    }
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}


