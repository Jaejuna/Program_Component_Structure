package Lab.Lab_8_1;

public class IntegerKey implements Key{
    private int c;

    public IntegerKey(int i){
        c = i;
    }

    public boolean equals(Key k) {
        if (k instanceof IntegerKey)
            return k.equals(((IntegerKey)k).getInt());
        else
            return false;
    }

    public int getInt() {
        return c;
    }
}