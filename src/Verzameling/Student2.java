package Verzameling;
public class Student2 extends Persoon {

    private int studentnr;

    public Student2() {
        super();
    }

    public void spreek() {
        System.out.println("Ik ben een student.");
    }

    @Override
    public String toString() {
        return "Student {" + studentnr + "}";
    }
}
