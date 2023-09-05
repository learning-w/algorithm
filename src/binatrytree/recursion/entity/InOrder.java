package binatrytree.recursion.entity;

import binatrytree.TreeNode;
import binatrytree.recursion.Strategy;

import java.util.ArrayList;

/**
 * @Author wucy0
 * @Date 2023/9/5
 * @Description
 **/
public class InOrder implements Strategy {
    @Override
    public void order(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        order(root.left, result);
        result.add(root.val);
        order(root.right, result);
    }
}
