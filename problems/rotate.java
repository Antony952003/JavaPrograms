package problems;
import java.util.*;
public class rotate {
    Node head;
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
    public void display(Node head)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public Node reverse(Node head)
    {
        Node temp = null;
        Node temp2 = null;
        while(head!=null)
        {
            temp2 = head.next;
            head.next = temp;
            temp = head;
            head = temp2;
        }
        head = temp;

        return head;
    }
    public Node rotation(Node head)
    {
        Node temp = head;
        Node i = head;
        for(i=head;i.next!=null;i=i.next)
        {
            if(temp.next.next!=null)
                temp = temp.next;
        }
        i.next = head;
        temp.next = null;
        head = i;
        return head;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        rotate r =new rotate();
        r.insert(10);
        r.insert(15);
        r.insert(16);
        r.insert(17);
        r.insert(18);
        r.insert(19);
        r.display(r.head);
        System.out.println();
        System.out.println("The reversed list is");
        Node head1 = r.reverse(r.head);
        r.display(head1);
        System.out.println();
        System.out.println("Enter the K value :");
        int c = sc.nextInt();
        Node head = r.head;
        for(int i=1;i<=c;i++)
        {
            head = r.rotation(head);
        }
        r.display(head);
    }
}

