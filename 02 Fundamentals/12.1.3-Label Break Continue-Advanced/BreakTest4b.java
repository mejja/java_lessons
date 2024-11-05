public class BreakTest4b {
    public static void main(String[] args) {
        int i = 0;
        outer: while (i < 3) {
            System.out.println("outer:" + i);
            int j = 0;
            inner: while (j < 3) {
                System.out.println(" inner:" + j);
                if (i == 2) {
                    j++;
                    continue inner;
                }
                int k = 0;
                innest: while (k < 3) {
                    if (j == 2) {
                        k++;
                        continue innest;
                    }
                    System.out.println("  innest:" + k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
