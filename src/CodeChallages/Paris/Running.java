package CodeChallages.Paris;

import java.util.Objects;

public class Running extends SizesDoNotMatch implements Shoe {
    String color;
    int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Running running = (Running) o;
//        if(size !=  running.size)
//        {
//            throw new SizesDoNotMatchException("The sizez don t match.")
//        }

        return size == running.size && Objects.equals(color, running.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }
}
