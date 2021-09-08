package com.leetcode;

public class BinaryTreeTraversal {
    //INORDER TRAVERSAL
//    public List<Integer> inorderTraversal(TreeNode root) {
//        Stack<TreeNode> stack = new Stack();
//        List<Integer> list = new ArrayList();
//
//        while(!stack.isEmpty() || root != null){
//            while(root != null){
//                stack.push(root);
//                root = root.left;
//            }
//
//            root = stack.pop();
//            list.add(root.val);
//            root = root.right;
//        }
//
//        return list;
//
//    }

    //PREORDER TRAVERSAL #1
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList();
//        Stack<Integers> stack = new Stack();
//
//        while(!stack.isEmpty || root != null){
//            while(root != null){
//                list.add(root.val);
//                stack.push(root);
//                root = root.left;
//            }
//
//            root = stack.pop();
//            root = root.right;
//        }
//
//        return list;
//    }

    //PREORDER TRAVERSAL #2
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList();
//        Stack<TreeNode> stack = new Stack();
//
//        stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode curr = stack.pop();
//            if(curr != null){
//                list.add(curr.val);
//                stack.push(curr.right);
//                stack.push(curr.left);
//            }
//        }
//
//        return list;
//    }
}
