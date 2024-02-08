import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int val;
    Node right,left;
    public Node(int v)
    {
        val = v;
    }
}
class IMPLEMENT_TREE {
    public static void main(String[] args) {
Tree t = new Tree();
//            10
//          /    \
//        20      30
//       /  \     /  \
//    40     50  60   70

//
t.root = new Node(8);
t.root.left = new Node(5);
t.root.left.left = new Node(3);
t.root.left.right = new Node(6);
t.root.left.left.left = new Node(1);
t.root.left.left.right = new Node(4);
     //t.root = new Node(10);
     //t.root.left = new Node(20);
     //t.root.right = new Node(30);
     //t.root.left.left = new Node(40);
     //t.root.left.right = new Node(50);
//t.r//t.root.right.left = new Node(60);     oot.right.right = new Node(70);
       System.out.print("Preoder by recursion : " );                //  Root   Left   Right
       t.preorder(t.root);
        System.out.println();
       System.out.print("Inorder by recursion : " );                // Left    Root    Right
       t.inorder(t.root);
        System.out.println();
        System.out.print("Preoder by recursion : " );                //  Right   Left   Root
        t.postorder(t.root);
        System.out.println();
        System.out.print("Node length is : "+t.countnode(t.root));
        System.out.println();
        System.out.print("Level oder traverse : ");
        t.leveloder(t.root);
        System.out.println();
//        System.out.print("Enter Nth Node for inoder :");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        t.nthnodeinoder(t.root,x);
//        System.out.println("What element you search : ");
//        int y = sc.nextInt();
//        t.searchnode(t.root , y);
        System.out.println("Depth : "+t.depthoftree(t.root));
        System.out.println("Depth : "+t.mindepthoftree(t.root));

        System.out.println("Is BST : " +t.isthisBST(t.root));
    }

}
class Tree
{
    Node root;
    public static int count = 0 ;
public void inorder(Node root)
{
    if(root==null) return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}

    public void preorder(Node root) {
    if(root == null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);

    }

    public void postorder(Node root) {
    if(root == null) return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.val + " ");
    }

    public int countnode(Node root) {
    if(root == null) return 0;
    count++;
    countnode(root.right);
    countnode(root.left);
       return count;
    }

    public void leveloder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            Node temp = q.poll();                       //  poll is removing element in que same like remove
            System.out.print(temp.val + " ");
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
            }
        }

    }


public int c1=0;
    public void nthnodeinoder(Node root, int y) {
    if(root == null)
    {
        return;
    }
    nthnodeinoder(root.left,y);
    c1++;
    if(c1 == y)
    {
        System.out.println(root.val);
return;
    }
    nthnodeinoder(root.right,y);
    }
boolean flag = false;
    public void searchnode(Node root, int y) {
  Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
          Node temp = q.poll();
          if(temp.val == y)
          {
              System.out.println("present");
              return;
          }
          if(temp.left!=null)
          {
              q.add(temp.left);
          }
          if(temp.right!=null)
          {
              q.add(temp.right);
          }
      }
        System.out.println("Not present");
    }

    public int depthoftree(Node root) {
        if (root ==null){
            return 0;
        }
        int l = depthoftree(root.left);
        int r =  depthoftree(root.right);
        return 1 + Math.max(l,r);
    }
    public int mindepthoftree(Node root) {
        if (root ==null){
            return 0;
        }
        int l = depthoftree(root.left);
        int r =  depthoftree(root.right);
        return 1 + Math.min(l,r);
    }

    public boolean isthisBST(Node root) {
        if(root == null) return true;
      return   checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean checkBST(Node root, int minValue, int maxValue) {
        if(root == null)
        {

            return true;
        }
        System.out.println(minValue);
        if(root.val<minValue || root.val>maxValue)
        {
            return false;
        }
        return checkBST(root.left,minValue,root.val-1) && checkBST(root.right,root.val+1,maxValue);
    }
}