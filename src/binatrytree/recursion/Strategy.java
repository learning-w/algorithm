package binatrytree.recursion;

import binatrytree.TreeNode;

import java.util.ArrayList;

/**
 * @Author wucy0
 * @Date 2023/9/5
 * @Description
 **/
public interface Strategy {
    /**
     * 递归排序策略
     *
     * @param root
     * @param result
     */
    public void order(TreeNode root, ArrayList<Integer> result);
}
