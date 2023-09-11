public class Multiples {
    public static void main(String[] args) {
        int multiples_so_far = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples_so_far += 1;
            }
        }
        System.out.print(multiples_so_far);
    }
}