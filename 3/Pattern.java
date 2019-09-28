public class Pattern {
    public static void main(String[] args) {
        int MAX = 4;

        for(int A = 1; A <= MAX; ++A) {

            for(int B = 1; B <= MAX - A; ++B) {
                System.out.printf(" ");
            }

            for(int B = 1; B <= A; ++B) {
                System.out.printf("%c", (char)(B + 64));
            }

            for(int B = 2; B <= A; ++B) {
                System.out.print(A - 1);
            }

            System.out.println();
        }
    }
}