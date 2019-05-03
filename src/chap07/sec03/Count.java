package chap07.sec03;

public class Count {
    static int count = 0;
    Count() {
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Count cnt1 = new Count();
        Count cnt2 = new Count();

        System.out.println(Count.getCount());
    }
}
