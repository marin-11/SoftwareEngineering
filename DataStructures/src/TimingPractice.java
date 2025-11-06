public class TimingPractice {
    public static void main(String[] args) {
        // Counting down
        Long start = System.currentTimeMillis();

        int total = 0;

        for (int i = 10000000; i >=0 ; i--){
            total += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start) + " ms");

        // Multiplication table
        Long start2 = System.currentTimeMillis();

        for (int i = 0; i <= 100; i ++){
            for  (int j = 0; j <= 100; j ++){
                System.out.println(i * j);
            }
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Time: " + (end2 - start2) + " ms");

    }
}
