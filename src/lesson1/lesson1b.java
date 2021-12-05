package lesson1;

public class lesson1b {
    public lesson1 getL1() {
        return l1;
    }

    public void setL1(lesson1 l1) {
        this.l1 = l1;
    }

    public lesson1 l1;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String a;

    public lesson1b() {

    }
    public lesson1b(lesson1 l1) {
        this.l1 = l1;
    }

    public void zulu(){
        System.out.println(this.a);
    }
}
