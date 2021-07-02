package Bitree427;

import java.util.LinkedList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void levelIterator(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode current = null;
        queue.offer(root);//将根节点入队--将指定的元素添加为此列表的尾部
        while (!queue.isEmpty()) {  //空
            if(current != null) System.out.print("-->");
            current = queue.poll();//出队队头元素并访问 --检索并删除此列表的头（第一个元素）。 返回此列表的开头
            System.out.print(current.val);
            if (current.left != null)//如果当前节点的左节点不为空入队
            {
                queue.offer(current.left);  //入队
            }
            if (current.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                queue.offer(current.right);  //入队
            }
        }
    }
}
