import java.util.*;

public class TreesTypes {
    static class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static void PreOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void InOrder(TreeNode root){
        if(root==null) return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }
    public static int countLeaves(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countLeaves(root.left)+countLeaves(root.right);
    }    
    public static void LevelOrder(TreeNode root){
        if(root==null) return;
        final Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            System.out.print(node.val+" ");
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }
    }
    
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(7);

        PreOrder(root);
        InOrder(root);
        LevelOrder(root);
        System.out.println("\n"+"the counting of leaf nodes "+countLeaves(root));
    }
}