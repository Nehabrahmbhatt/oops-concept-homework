package OopsConcept;

public class Test {

    public void call (String a, String b){
        System.out.println("1");
    }
    public void call (int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.call ("abc","bcd");
    }}