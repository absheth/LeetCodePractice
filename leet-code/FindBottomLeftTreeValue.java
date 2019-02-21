
/**
 * Definition for a binary tree node.
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        int level = 0;
        int[] levelAndNumber = new int[2];

        levelAndNumber[0] = level;
        levelAndNumber[1] = root.val;
        findBottomLeft(root, levelAndNumber, level+1);
        return levelAndNumber[1];
    }

    void findBottomLeft(TreeNode root, int[] levelAndNumber, int level) {
        if (root.left == null && root.right == null) {
            if (level > levelAndNumber[0]) {
                levelAndNumber[0] = level;
                levelAndNumber[1] = root.val;
            }
        } else {
            if (root.left != null) {
                findBottomLeft(root.left, levelAndNumber, level + 1);
            }

            if (root.right != null) {
                findBottomLeft(root.right, levelAndNumber, level + 1);
            }
        }
    }
}


