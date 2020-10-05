package Class_Practice;

public class W6_TestPrintClass {
    public static void main(String[] args) {
        W6_PrintClass p = new W6_PrintClass();
        p.printB();
        p.printB();
        new W6_PrintClass().printB();
        W6_PrintClass q = p;
    }
}
