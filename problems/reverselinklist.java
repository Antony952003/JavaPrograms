package problems;
import java.util.Scanner;


public class reverselinklist {
	Node head;

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	Node reverse(Node head, int k)
	{
		if(head == null)
		return null;
		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;

		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}


		if (next != null)
			head.next = reverse(next, k);

		return prev;
	}

	public void push(int new_data)
	{
        Node temp = head;
		Node new_node = new Node(new_data);
        if(head==null)
		    head = new_node;
        else{
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = new_node;

        }
	}

	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		reverselinklist llist = new reverselinklist();


        boolean flag = true;
        while(flag)
        {
            int data = sc.nextInt();
            if(data == -1)
            {
                flag = false;
            }
            else{
                llist.push(data);
            }
        }	

		System.out.println("Given Linked List");
		llist.printList();
        int k = sc.nextInt();

		llist.head = llist.reverse(llist.head, k);

		System.out.println("Reversed list");
		llist.printList();
	}
}
