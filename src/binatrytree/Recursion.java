package binatrytree;

import binatrytree.recursion.Strategy;

import java.util.ArrayList;

/**
 * @Author wucy0
 * @Date 2023/9/5
 * @Description
 **/
public class Recursion {
    private Strategy strategy;

    public Recursion(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(TreeNode root,ArrayList<Integer> arrayList){
        strategy.order(root,arrayList);
    }
}
