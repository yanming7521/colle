package Bitree427;

public class TreeArray {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {   //lo 左  hi 右  回溯法
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);  //递归左子树
        root.right = dfs(nums, mid + 1, hi);  //递归右子树
        return root;
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int minx = Integer.MAX_VALUE;;
        if(root.left != null)  minx = Math.min(minDepth(root.left),minx);
        if(root.right != null) minx = Math.min(minDepth(root.right),minx);
        return minx + 1;
    }

    public static void main(String[] args) {
        TreeArray ta = new TreeArray();
        int[] ax = new int[]{3,5,7,10,15,18};
        TreeNode jieguo = ta.sortedArrayToBST(ax);
        TreeNode show = new TreeNode();
        show.levelIterator(jieguo);
        Sumhl sum = new Sumhl();
        int sums = sum.rangeSumBST(jieguo, 7, 15);
        System.out.println();
        System.out.println(sums);
        int i = ta.minDepth(jieguo);
        System.out.println(i);
    }
}
