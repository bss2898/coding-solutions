/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> levels=new LinkedList<>();
        List<Double> ans=new ArrayList<>();

        levels.offer(root);
        while(!levels.isEmpty()){
            int levNodes=levels.size();
            double levsum=0;
            //int c=0;
            for(int i=0;i<levNodes;i++){
                TreeNode temp=levels.poll();
                levsum+=temp.val;
                if(temp.left!=null){
                    levels.offer(temp.left);
                }
                if(temp.right!=null){
                    levels.offer(temp.right);
                }
            }
            ans.add(levsum/levNodes);
        }
        return ans;
    }
}