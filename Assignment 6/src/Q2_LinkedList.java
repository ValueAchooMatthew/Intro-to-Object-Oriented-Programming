/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (40 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;

    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        /* place your code here */
        Node new_node = new Node(new_data);
        if(this.head == null){
            this.head = new_node;
        }
        else{
            Node temp = this.head;
            this.head = new_node;
            new_node.next = temp;

        }

    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        /* place your code here */
        Node new_node = new Node(new_data);
        if(this.head == null){
            this.head = new_node;
        }
        else{
            Node last_in_list = this.head;
            while(last_in_list.next != null){
                last_in_list = last_in_list.next;
            }
            last_in_list.next = new_node;
        }


    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        /* place your code here */
        Node node_after = prev_node.next;
        Node inserted_node = new Node(new_data);
        if(node_after == null){
            prev_node.next = inserted_node;
        }else{
            prev_node.next = inserted_node;
            inserted_node.next = node_after;
        }
    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        /* place your code here */
        int i = 1;
        Node curr_node = this.head;
        if(position == 0){
            this.head = this.head.next;
        }else{
            while(true){
                Node prev_node = curr_node;
                curr_node = curr_node.next;
                Node next_node = curr_node.next;
                if(position == i){
                    prev_node.next = next_node;
                    curr_node = null;
                    break;
                }
                i++;
            }
        }


    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        /* place your code here */
        boolean found = false;
        if(head.data == key){
            found = true;
        }
        else{
            Node next_node = head.next;
            while(next_node.next != null){
                if(next_node.data == key){
                    found = true;
                    break;
                }else{
                    next_node = next_node.next;
                }
            }
        }

        return found;
    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        /* place your code here */
        boolean done = false;
        Node curr_node = this.head;
        Node next_node = curr_node.next;

        while(!done){
             done = true;
             curr_node = this.head;
             next_node = curr_node.next;
             while(next_node != null){
                 if(curr_node.data > next_node.data){
                     int temp = curr_node.data;
                     curr_node.data = next_node.data;
                     next_node.data = temp;
                     done = false;
                    }
                 curr_node = curr_node.next;
                 next_node = next_node.next;
                }

            }

    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        /* TA may test different functions of the LinkedList here */
        /* The following is just an example of how to do the test. */

        Q2_LinkedList llist = new Q2_LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("Linked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(0);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sortLinkedList(llist.head);
        System.out.println("Sorted List: ");
        llist.printList();
    }
}