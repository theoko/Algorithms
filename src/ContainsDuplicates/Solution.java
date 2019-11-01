package ContainsDuplicates;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicates(int[] nums)
    {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i=0; i<nums.length; i++)
        {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }

        return false;
    }
}
