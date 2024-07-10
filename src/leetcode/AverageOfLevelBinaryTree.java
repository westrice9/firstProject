package leetcode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class AverageOfLevelBinaryTree {
    int val;
    TreeNode left;
    TreeNode right;

    AverageOfLevelBinaryTree() {
    }

    AverageOfLevelBinaryTree(int val) {
        this.val = val;
    }

    AverageOfLevelBinaryTree(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        List<Double> list = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            int amount = size;
            double av = 0;
            double sum = 0;
            while (size > 0) {
                TreeNode node = q.poll();
//                sum = sum+node.val;
//                if (node.left!=null) q.offer(node.left);
//                if (node.right!=null) q.offer(node.right);
//                size--;
//            }
//            av= sum/amount;
//            list.add(av);
//        }
//    }
            }
        }
        return list;
    }
}
