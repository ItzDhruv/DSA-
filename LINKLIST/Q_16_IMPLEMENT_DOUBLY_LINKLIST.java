public class Q_16_IMPLEMENT_DOUBLY_LINKLIST {

    // Represent a node of the doubly linked list
    public static void main(String[] args) {

        Q_16_IMPLEMENT_DOUBLY_LINKLIST dList = new Q_16_IMPLEMENT_DOUBLY_LINKLIST();
        // Add nodes to the list
        dList.addlastNode(1);
        dList.addlastNode(2);
        dList.addlastNode(3);
        dList.addlastNode(4);
        dList.addlastNode(5);
        dList.addfirstNode(23);
        System.out.println("before reverse : ");
        dList.display();
        dList.reverselist();
        System.out.println("After reverse : ");
        dList.display();

    }
//    public void SORTED_INSERT(int x)
//    {
//        nod nn = new nod(x);
//        if(head==null)
//        {
//            head=nn;
//            tail=nn;
//            nn.previous=null;
//            nn.next=null;
//        }
//        nod temp=head;
//        while (temp!=null)
//        {
//            if(temp.data< nn.data)
//            {
//                temp=temp.next;
//            }
//            else
//            {
//                temp.previous.next=nn;
//
//            }
//        }
//    }
     class nod {
        int data;
        nod previous;
        nod next;

        public nod(int data) {
            this.data = data;
        }
    }


    nod head, tail = null;

    // Represent the head and tail of the doubly linked list

    // addNode() will add a node to the list in last
    public void addlastNode(int data) {
        // Create a new node
        nod newNode = new nod(data);

        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the list
            tail.next = null;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode's previous will point to tail
            newNode.previous = tail;
            // newNode will become new tail
            tail = newNode;
            // As it is last node, tail's next will point to null
            tail.next = null;
        }
    }
public void reverselist()
{


        nod temp = null;
        nod current = head;

        /* swap next and prev for all nodes of
         doubly linked list */
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        /* Before changing head, check for the cases like
         empty list and list with only one node */
        if (temp != null) {
            head = temp.previous;
        }
    }


    public void addfirstNode(int data) {
        // Create a new node
        nod newNode = new nod(data);
        // If list is empty
        if (head == null) {
            // Both head and tail will point to newNode
            head = tail = newNode;
            // head's previous will point to null
            head.previous = null;
            // tail's next will point to null, as it is the last node of the
            tail.next = null;
        } else {
            // newNode will be added after tail such that tail's next will po
            newNode.next=head;
            // newNode's previous will point to tail
            head.previous=newNode;
            // newNode will become new tail
            head=newNode;
            head.previous=null;
            // As it is last node, tail's next will point to null
        }
    }

    // display() will print out the nodes of the list
    public void display() {
        // Node current will point to head
        nod current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            // Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
    }


}