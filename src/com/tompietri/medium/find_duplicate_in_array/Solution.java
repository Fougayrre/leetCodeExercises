package com.tompietri.medium.find_duplicate_in_array;

import java.util.ArrayList;
import java.util.List;


/**
 * Solution for leetcode problem https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 *
 * Input is in the from of 1<num[i]<n with n the size of the array
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            //If we haven't found the element yet
            if(nums[Math.abs(nums[i])-1] >= 0)
            {
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            } else
            {
                output.add(Math.abs(nums[i]));
            }
        }
        return output;
    }
}
