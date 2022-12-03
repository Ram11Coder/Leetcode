package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}


// Easy
public class BinaryTreeInorderTraversal {
  public static void main(String[] args) {
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    node.right = new TreeNode(3);
    System.out.println(inorderTraversal(node));
  }

  public static List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> res = new ArrayList<Integer>();

    if (root == null) {
      return res;
    }
    inorderTraversal(root.left);
    res.add(root.val);
    inorderTraversal(root.right);
    return res;

  }
}

