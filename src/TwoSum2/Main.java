package TwoSum2;

public class Main {
    public static void main(String[] args) {
        int[] input1 = new int[] {2,7,11,15};
        Solution solution = new Solution();
        int[] returnedInts = solution.twoSum(input1, 9);
        for (int i : returnedInts)
        {
            System.out.println(i);
        }
    }
}
