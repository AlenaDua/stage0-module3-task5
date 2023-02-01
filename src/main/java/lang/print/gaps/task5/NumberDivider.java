package lang.print.gaps.task5;

public class NumberDivider {
    static void divide(int toBeDivided) {
        System.out.printf("%.1f\n",(double)toBeDivided/5);
    }

    public static void main(String[] args) {
        int toBeDivided1 = 0;
        divide(toBeDivided1);
    }
}
