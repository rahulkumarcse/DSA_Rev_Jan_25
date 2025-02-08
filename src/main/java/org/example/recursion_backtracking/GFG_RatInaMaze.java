package org.example.recursion_backtracking;

import java.util.ArrayList;

/**
 * Consider a rat placed at position (0, 0) in an n x n square matrix mat. The rat's goal is to reach the destination at position (n-1, n-1).
 * The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).
 *
 * The matrix contains only two possible values:
 *
 * 0: A blocked cell through which the rat cannot travel.
 * 1: A free cell that the rat can pass through.
 */
public class GFG_RatInaMaze {
    public void helper(ArrayList<ArrayList<Integer>> mat , int row , int col,String curr, ArrayList<String> res){
        if(row == mat.size()-1 && col == mat.size()-1){
            res.add(new String(curr));
            return;
        }
        mat.get(0).set(0,-1);
        int[] nextRow = {1,0,0,-1};
        int[] nextCol = {0,-1, 1, 0};
        char[] direction = {'D', 'L', 'R', 'U' };
        for(int i =0;i<4;i++){
            int newRow = row + nextRow[i];
            int newCol = col + nextCol[i];
            if(newRow >=0 && newRow<mat.size() && newCol >= 0 && newCol< mat.size() && mat.get(newRow).get(newCol)==1){
                mat.get(newRow).set(newCol,-1);
                helper(mat, newRow,newCol, new String(curr)+direction[i], res);
                mat.get(newRow).set(newCol,1);
            }
        }
    }
    public  ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> res = new ArrayList<>();
        helper(mat, 0,0, "",res);
        return res;
    }
}
