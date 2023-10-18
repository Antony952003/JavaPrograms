package problems;
import java.util.Scanner;

public class mergesort {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int d)
    {
        Node newnode =new Node(d);
        if(head==null)
        {
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public Node mergesortfn(Node head)
    {
        if( head==null || head.next==null)
        {
            return head;
        }
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            temp = slow;
            slow= slow.next;
            fast = fast.next.next;
        }

        temp.next = null;
        Node l1 = mergesortfn(head);
        Node l2 = mergesortfn(slow);

        return merge(l1,l2);

    }
    public Node merge(Node list1,Node list2)
    {
        Node merg = new Node(0);
        Node head = merg;
        while(list1 != null && list2 != null)
        {
            if(list1.data < list2.data)
            {
                head.next = list1;
                list1 = list1.next;
            }
            else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
            if(list1!=null)
            {
                head.next = list1;
                list1 = list1.next;
            }
            if(list2!=null)
            {
                head.next = list2;
                list2 = list2.next;
            }
            
        return merg.next;
    }
    public void display(Node merge)
    {
        Node temp = merge;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[]args)
    {
        mergesort m = new mergesort();
        int ch=0;
        Scanner sc =new Scanner(System.in);
        while(ch!=5)
        {
            int x = sc.nextInt();
            m.insert(x);
            ch++;
        }
        m.display(m.head);
        System.out.println();
        // m.insert(35);
        // m.insert(25);
        // m.insert(100);
        // m.insert(10);
        // m.insert(22);
        // m.insert(15);
        Node head1c = m.mergesortfn(m.head);
        m.display(head1c);
    }
}
