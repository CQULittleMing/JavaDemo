public class FinallyTest {
    public static void main(String[] args) {
        int i;
        try {
            i = 1 / 0;
        } finally {
            int[] a = new int[3];
            i = a[3];
            System.out.println("finally 被执行");
        }
    }
}
