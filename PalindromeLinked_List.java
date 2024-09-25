package POTD;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeLinked_List {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.println(isPalindrome(n1));
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " =>  ");
            temp = temp.next;
        }
    }

    public static boolean isPalindrome(Node head) {
        Node currNode = head;
        Node prev = null;
        while (currNode != null) {
            Node temp = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = temp;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data != prev.data) {
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
}
