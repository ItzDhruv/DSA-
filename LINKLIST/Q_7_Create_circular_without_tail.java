class node {
    int data;
    Node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
public void deletlast()
{
    if(head==null)
    {
        System.out.println("Not delete because List is empty");
        return;
    }
    if(head.next==head)
    {
        System.out.println("empty");
        head=null;
        return;
    }
    Node temp=head;
    while(temp.next.next!=head)
    {
        temp=temp.next;
    }
    temp.next.next=null;
    temp.next=head;

}
public void size()
{
    if(head==null)
    {
        System.out.println("List is null");
        return;
    }
    int count =0;
    Node temp = head;
    while (temp.next!=head)
    {
        temp = temp.next;
        count++;
    }
    count++;
    System.out.println("Size is : "+count);
}
public void checkcircularlinklist()
{
    if(head==null)
    {
        System.out.println("Empty list");
        return;
    }
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
    public void nodeexchangefirstlast() {
        if (head == null || head.next == null) {
            System.out.println("minimum 3 node is required");
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        Node shead = head.next;
        Node tail = temp.next;
        temp.next = temp.next.next;
        temp.next.next = tail;
        tail.next = shead;
        head = tail;
    }
    public void print() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = head;
        System.out.print(current.data + " -> ");
        current = current.next;
        while (current != head) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
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
    public void lengthofloopinlist()
    {
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
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        int count=1;
        while (fast.next!=slow)
        {
fast=fast.next;
count++;
        }
        System.out.println("loop size is : "+count);
    }
}

public class Q_7_Create_circular_without_tail {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(4);
        cll.insert(43);
        cll.insert(43);
//cll.deletlast();
//cll.nodeexchangefirstlast();
        cll.size();
//        cll.print();
//        cll.checkcircularlinklist();
//        cll.detectloop();
        cll.lengthofloopinlist();
    }
}