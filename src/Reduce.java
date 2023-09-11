public class Reduce {
    public static void main(String[] args) {
        int result = Reduce.countSteps(100);
        System.out.println(result);
    }

    public static int countSteps(int n) {
        int steps_so_far = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
                steps_so_far += 1;
            } else {
                n = n - 1;
                steps_so_far += 1;
            }
        }
    return steps_so_far;}
}