package Lab.Lab_8_1;

public class PersonFrom extends Person{

    private String city;

    public PersonFrom (String n, String c) {
        super(n);
        city = c;
    }

    public String getCity() {
        return city;
    }

    public boolean sameName(Person p) {
        return sameName(p) && (this.getName()).equals(p.getName());
    }

    public static void main(String[] args) {
        Person p = new Person ("마음");
        Person q = new PersonFrom("소리", "안산");
    }
}
