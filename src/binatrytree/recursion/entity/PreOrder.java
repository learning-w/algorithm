package binatrytree.recursion.entity;

import binatrytree.TreeNode;
import binatrytree.recursion.Strategy;

import java.util.ArrayList;

/**
 * @Author wucy0
 * @Date 2023/9/5
 * @Description
 **/
public class PreOrder implements Strategy {

    @Override
    public void order(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        order(root.left, result);
        order(root.right, result);
    }
}
