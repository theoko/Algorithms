package ContainsDuplicates;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean test1 = solution.containsDuplicates(new int[]{1, 2, 3, 1});
        boolean test2 = solution.containsDuplicates(new int[]{1, 2, 3, 4});
        boolean test3 = solution.containsDuplicates(new int[]{1, 1, 1, 3,3,4,3,2,4,2});
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test3: " + test3);
    }
}
