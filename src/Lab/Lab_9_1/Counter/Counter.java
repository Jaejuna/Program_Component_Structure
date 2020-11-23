package Lab.Lab_9_1.Counter;

public class Counter {
    private int count;

    public Counter(){
        count = 0;
    }

    public void increment(){
        count += 1;
    }

    public int countOf(){
        return count;
    }

    public void exit(){
        System.exit(0);
    }
}
