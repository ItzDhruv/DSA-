import java.util.Stack;

public class Q_1_IMPLEMENT_Linklist {

   public  Node head=null;  // for first elment of linkedlist
   public Node tail=null;  // for last elment of linkedlist
    public static void main(String[] args) {
        Q_1_IMPLEMENT_Linklist linklist = new Q_1_IMPLEMENT_Linklist();
      linklist.find(20);
        linklist.insert(10);
        linklist.insert(15);
        linklist.insert(20);
        linklist.insert(25);
        linklist.insert(30);
        linklist.insert(30);
        linklist.insert(30);
        linklist.insert(50);
        linklist.insert(80);
        linklist.insert(90);
        linklist.insert(90);
        linklist.insert(90);
        linklist.insert(90);
        linklist.insert(100);
        linklist.insert(200);
        linklist.print();

//        System.out.println();
        linklist.Remove_Dublicate();
//        linklist.reverselinkelist();
        linklist.print();
//linklist.detectloop();
//        linklist.checkcircularlinklist();

//        linklist.get_middle();
//        linklist.deleteperadres(linklist.head.next);
//        System.out.println();
//        linklist.print();
//        linklist.find(23);
//        linklist.size();
//        linklist.reverseprint();
//        linklist.getfromlast(0);
    }

    public void Remove_Dublicate()
    {
        if(head == null || head.next == null)       // Because null or single elment is not possible to be a dublicate value.
        {
            return;
        }

        Node temp =head;

        while (temp.next!=null)
        {
        Node cur = temp;
        Node next = temp.next;
            while (cur!=null)
            {
                if(temp.data==next.data)
                {
                    cur.next=next.next;
                }
                cur=cur.next;
            }
            temp=temp.next;
        }

    }

  public void get_middle()
  {
      Node fast=head;
      Node slow=head;
      Node temp=head;
      while( temp.next.next!=null  && fast.next!=null)
      {
          temp=temp.next;
          slow=slow.next;
          fast=fast.next.next;
      }
      System.out.println("Middle element is : "+slow.data);
  }
    public void checkcircularlinklist()
    {
        Node temp = head;
        while(temp.next!=head && temp.next!=null)
        {
            temp = temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("Not circular its singly linklist ");
            return;
        }
        System.out.println("Its circular linklist ");
    }



    //       -------------------  ERROR  --------------------        //

//    public void reverselinkelist()
//  {
//      Node cur= head;
//      Node prev=null;
//      while(cur!=null)
//      {
//Node temp=cur.next;
//cur.next=prev;
//prev=cur;
//cur=temp;
//
//      }
//head =prev;
// }
//public void reverseprint()
//{
//    Node temp = head;
//    Stack<Integer> stack = new Stack<>();
//    while(temp!=null)
//    {
//        stack.push(temp.data);
//        temp=temp.next;
//    }
//    while(!stack.isEmpty())
//    {
//        System.out.print(stack.pop()+"<-");
//    }
//    System.out.println("Null");
//}
    public  void insert(int val)
    {

        Node nn = new Node(val);              // pass the construcer in node classs and enter a value in node.

        if(head==null)                             // IF NODE IS EMPETY HEAD AND TAIL ARE IN SAME POSITION.
{
    head=nn;
    tail=nn;
}
        else {
            tail.next=nn;
            tail=nn;
        }
    }
public void removedublicate()
{
    Node temp=head;
    while(temp.next!=null)
    {

        if(temp.data==temp.next.data)
        {
            if(temp.next.next==null)
            {
                temp.next=null;
            }
            else {
                temp.next = temp.next.next;
            }
        }
        else {
            temp = temp.next;
        }
    }

}
    public void print()
    {
        Node current = head ;   //     FOR DESTROYING THAT UNNECESSARY NODE.
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else {
            while (current!=null)
            {
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.print("null");
        }
    }
    public void detectloop() {
        if(head==null)
        {
            System.out.println("emty list");
            return;
        }
        Node fast = head.next;
        Node slow = head;
        while(fast.next!=null)
        {
            if(slow==fast)
            {
                System.out.println("There is loop in linkedlist");
                return;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("No loop singly linklist");
    }
    public void size()
    {
        int count =0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println("Size is : "+count);
    }
    public void find(int vlaue)
    {
        if(head==null)
        {
            System.out.print("Emty list ");
        }
        int count=1;
        Node curent=head;
        while(curent!=null)
        {
            if(curent.data==vlaue)
            {
                System.out.println("\n Elment "+curent.data+" position is : "+count);

                return;
            }
            curent=curent.next;
            count++;
        }
        System.out.println("\n Element is not present");
    }

public void delete(int value)
{
if(head==null)                                      // No element in linklist
{
    System.out.println("Empty");
    return;
}
if(head==tail && head.data==value)                  // No element
{
    head=null;
    tail=null;
}
else if(head.data==value)                           // first(Head) elment deleting
{
    Node temp=head;
    head=head.next;
    temp=null;
}
else {
    Node cur=head.next;
    Node prev=head;
    while(cur!=null && cur.data!=value)
    {
prev=cur;
cur=cur.next;
    }
    if(cur==tail)
    {
        tail=prev;
    }
    prev.next=cur.next;
    cur.next=null;
}
}
//  Nth Node from last in linkedlist
    public void getfromlast(int value) {
        int count =0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        Node temp2=head;
        int target = count-value;   // So, we can find Nth eliment from last.
        if(target<=0)
        {
            System.out.println("Out of the range");
            return;
        }
        while(target!=0 && temp2.next!=null)
        {
            temp2=temp2.next;
            target--;
        }
        System.out.println("Last nth element is : "+temp2.data);
    }
    public void deleteperadres(Node p) // Delete element with only giving delet elemnt adress.
    {
p.data=p.next.data;
p.next=p.next.next;
    }

}
class Node  // for multi pule veriable we use class
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}