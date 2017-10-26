package sk.holic.sos;

public class GeneralTest {
    public int getCount() {return 1;}
}


 class Test1 extends GeneralTest {
    public int getCount() {return 10;}

    public static void main(String[] args) {
        Test1 test = new Test1();
        int count = test.getCount();
        GeneralTest generalTest = new Test1();
        count += generalTest.getCount();



        generalTest = new GeneralTest();
        count += generalTest.getCount();
        System.out.println(count);
        //vypise to cislo 21
        //metoda bola 3 krat zavolana
    }
}

