package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i=1; i<numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            // Add 1 to the beginning
            row.add(1);

            for (int j = 1; j < i; j++)
            {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            // Add 1 to the end
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }

}
