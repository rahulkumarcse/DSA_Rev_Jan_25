package org.example.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class LC78_Subset {
    public void subsetHelper(int[] nums, int index, List<Integer> curr , List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subsetHelper(nums,index+1,curr,result);
        curr.remove(curr.size()-1);
        subsetHelper(nums,index+1,curr,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsetHelper(nums,0,new ArrayList<>(),result);
        return result;
    }
}
