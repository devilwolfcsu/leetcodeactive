package com.leetcode.problems.medium;

import com.leetcode.problems.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II Unique Binary Search Trees II
 *
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 *
 * Created by zeyuan on 2020/6/20.
 */
public class UniqueBinarySearchTreesII {

        public LinkedList<TreeNode> generate_trees(int start, int end) {
            LinkedList<TreeNode> all_trees = new LinkedList<TreeNode>();
            if (start > end) {
                all_trees.add(null);
                return all_trees;
            }

            // pick up a root
            for (int i = start; i <= end; i++) {
                // all possible left subtrees if i is choosen to be a root
                LinkedList<TreeNode> left_trees = generate_trees(start, i - 1);

                // all possible right subtrees if i is choosen to be a root
                LinkedList<TreeNode> right_trees = generate_trees(i + 1, end);

                // connect left and right trees to the root i
                for (TreeNode l : left_trees) {
                    for (TreeNode r : right_trees) {
                        TreeNode current_tree = new TreeNode(i);
                        current_tree.left = l;
                        current_tree.right = r;
                        all_trees.add(current_tree);
                    }
                }
            }
            return all_trees;
        }

        public List<TreeNode> generateTrees(int n) {
            if (n == 0) {
                return new LinkedList<TreeNode>();
            }
            return generate_trees(1, n);
        }
}
