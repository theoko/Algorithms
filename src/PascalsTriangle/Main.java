package PascalsTriangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> generate1 = solution.generate(5);
        System.out.println(generate1.toString());
    }
}
