public class Implementation{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static class Queue{
            static Node head = null;
            static Node tail = null;

            // isEmpty
            public static boolean isEmpty(){
                return head == null && tail == null;
            }

            public static void add(int data){
                Node newNode = new Node(data);
                if(head == null){
                    tail = head = newNode;
                    return;

                }
                tail.next = newNode;
                tail = newNode;

            }

            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int front = head.data;
                if(tail == head){
                    tail = head = null;
                }else{
                    head = head.next;
                }
                return front;
            }

        }
