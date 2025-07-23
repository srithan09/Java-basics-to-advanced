
public class InsertAll {
    class LL
    {
        Node head;
        class Node
        {
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }
        public void addFirst(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
        }
        public void addTail(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = newNode;
                return;
            }
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        public void printList()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
        public void insertKth(int element,int k)
        {
            Node newNode = new Node(element);
            if(head == null)
            {
                if(k==1)
                {
                    head = newNode;
                    return;
                }
                else
                {
                    System.out.println("List is empty");
                    return;
                }
            }
            if(k == 1)
            {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp;
            int count = 0;
            temp = head;
            while(temp != null)
            {
                count++;
                if(count == k-1)
                {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }
        }
        public void insertValue(int element, int value) {
            Node newNode = new Node(element);
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                if (temp.data == value) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Value not found in list");
        }
    }

    public static void main(String[] args) {
        InsertAll obj = new InsertAll();
        LL list = obj.new LL(); // instantiate inner class

        list.addFirst(10);
        list.addFirst(20);
        list.addTail(5);
        list.insertKth(15, 2);
        list.insertValue(17, 10);

        list.printList(); // Expected: 20->15->10->17->5->Null
    }
}
