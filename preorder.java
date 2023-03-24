import java.util.*;
public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
     }

     public class Binary{
        static int idx=-1;
        public static Node biNode(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=biNode(node);
            newNode.right=biNode(node);
            return newNode;
        }
     }

        // PREORDER TRAVERSAL
     public static void preorder(Node root){
        if (root==null) {
            return;
        }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
     }

    //  INORDER TRAVERSAL
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

        // POSTORDER TRAVERSAL
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        // Binary tree=new Binary();
        // Node root=tree.biNode(node);
        // System.out.println(root.data);
    }
}
