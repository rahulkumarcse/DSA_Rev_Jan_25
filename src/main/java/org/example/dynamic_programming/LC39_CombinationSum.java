package org.example.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class LC39_CombinationSum {
    void sumHelper(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result){
        if(target<=0){
            if(target==0) result.add(new ArrayList<>(current));
            return;
        }
        for(int i =index; i < candidates.length;i++){
            current.add(candidates[i]);
            sumHelper(candidates, target-candidates[i], i,current, result);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        sumHelper(candidates, target, 0,new ArrayList<>(), result);
        return  result;
    }
}
