public class LinkedList {
    class Node{
        int data;
        Node next;

        Node (int data ){
            this.data=data;
            this.next=null; 
        }
    }
    Node head=null;
    public class LinkedListDemo1{
        public void printList(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
}
