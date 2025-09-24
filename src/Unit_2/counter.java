package Unit_2;

public class counter {
    public int count = 0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
