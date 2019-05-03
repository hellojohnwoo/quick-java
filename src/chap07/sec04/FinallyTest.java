package chap07.sec04;

public class FinallyTest {
    public void shouldBeRun() {
        System.out.println("ok thanks");
    }

    public static void main(String[] args) {
        FinallyTest finaltest = new FinallyTest();
        int c;

        try {
            c = 4 / 0;
                                            // ft.shouldBeRun();
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            finaltest.shouldBeRun();
        }
    }

}
