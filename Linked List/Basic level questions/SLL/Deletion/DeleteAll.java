public class DeleteAll {
    class LL {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void InsertTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void DeleteFirst() {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            }
            head = head.next;
        }

        public void DeleteLast() {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            } else if (head.next == null) {
                head = null;
                return;
            }
            Node last = head.next;
            Node secondLast = head;
            while (last.next != null) {
                last = last.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }

        public void DeleteKth(int k) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (k == 1) {
                head = head.next;
                return;
            }
            Node current = head;
            Node previous = null;
            int count = 1;
            while (current != null) {
                if (count == k) {
                    if (previous != null) {
                        previous.next = current.next;
                    }
                    return;
                }
                previous = current;
                current = current.next;
                count++;
            }
            System.out.println("Position exceeds list length");
        }

        public void DeleteValue(int value) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.data == value) {
                head = head.next;
                return;
            }
            Node current = head;
            Node previous = null;
            while (current != null) {
                if (current.data == value) {
                    if (previous != null) {
                        previous.next = current.next;
                    }
                    return;
                }
                previous = current;
                current = current.next;
            }
            System.out.println("Value not found");
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        DeleteAll obj = new DeleteAll();
        LL list = obj.new LL();  // inner class instance

        // Insert elements
        list.InsertTail(10);
        list.InsertTail(20);
        list.InsertTail(30);
        list.InsertTail(40);
        list.InsertTail(50);

        System.out.println("Initial List:");
        list.printList(); // 10->20->30->40->50->Null

        list.DeleteFirst(); // Deletes 10
        System.out.println("After DeleteFirst:");
        list.printList(); // 20->30->40->50->Null

        list.DeleteLast(); // Deletes 50
        System.out.println("After DeleteLast:");
        list.printList(); // 20->30->40->Null

        list.DeleteKth(2); // Deletes 30
        System.out.println("After DeleteKth(2):");
        list.printList(); // 20->40->Null

        list.DeleteValue(40); // Deletes 40
        System.out.println("After DeleteValue(40):");
        list.printList(); // 20->Null
    }
}
