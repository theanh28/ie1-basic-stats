public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = { 1, 5, 6, 2, 4 };
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int num : numbers) {
          minNum = Math.min(minNum, num);
          maxNum = Math.max(maxNum, num);
        }

        System.out.println("Minimal value: " + minNum);
        System.out.println("Maximal value: " + maxNum);
    }
}
