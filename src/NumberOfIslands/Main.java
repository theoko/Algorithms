package NumberOfIslands;

public class Main {

    /**
     * 11110
     * 11010
     * 11000
     * 00000
     */
    static char[][] test1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
    };

    /**
     * 11000
     * 11000
     * 00100
     * 00011
     */
    static char[][] test2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
    };

    public static void main(String[] args) {
        Solution solution = new Solution();

        /**
         * Test 1
         */
        int numIslands1 = solution.numIslands(test1);
        System.out.println("Number of islands for test 1: " + numIslands1);

        /**
         * Test 2
         */
        int numIslands2 = solution.numIslands(test2);
        System.out.println("Number of islands for test 2: " + numIslands2);
    }
}
