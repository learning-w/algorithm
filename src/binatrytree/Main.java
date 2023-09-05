package binatrytree;

import binatrytree.recursion.entity.InOrder;
import binatrytree.recursion.entity.PostOrder;
import binatrytree.recursion.entity.PreOrder;

import java.util.ArrayList;

/**
 * @Author wucy0
 * @Date 2023/9/5
 * @Description
 **/
public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        init(treeNode);
        Recursion recursion = new Recursion(new PreOrder());
        ArrayList<Integer> result = new ArrayList<>();
        recursion.executeStrategy(treeNode,result);
        System.out.println(result);
        result = new ArrayList<>();
        recursion = new Recursion(new InOrder());
        recursion.executeStrategy(treeNode,result);
        System.out.println(result);
        result = new ArrayList<>();
        recursion = new Recursion(new PostOrder());
        recursion.executeStrategy(treeNode,result);
        System.out.println(result);
    }

    static void init(TreeNode treeNode){
        TreeNode treeNode1 = new TreeNode(3);
        treeNode.left = treeNode1;
        TreeNode treeNode2 = new TreeNode(4);
        treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(5);
        treeNode1.left = treeNode3;
        TreeNode treeNode4 = new TreeNode(6);
        treeNode1.right = treeNode4;
        TreeNode treeNode5 = new TreeNode(7);
        treeNode2.left = treeNode5;
        TreeNode treeNode6 = new TreeNode(8);
        treeNode2.right = treeNode6;
    }
}
