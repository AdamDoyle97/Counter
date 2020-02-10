package ie.gmit;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }
    
    public Counter(int starting) throws IllegalAccessException {
        if (starting <=0)
            throw new IllegalAccessException("Must be greater than 0");
        else
            this.count = starting;
    }

    public int getCount() {
        return count;
    }
}
