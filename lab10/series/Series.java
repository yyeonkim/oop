package series;

public interface Series {
    int getNext(); // return the next number in series

    void reset(); // restart

    void setStart(int x);
}