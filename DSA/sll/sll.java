class sll {
    Node head;
    private int size;

    sll() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first-last
    public void addFirst(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = head.next;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        sll list = new sll();

        list.addFirst("rohan");
        list.addFirst("kashid");
        list.addFirst("ram");
        list.addFirst("sham");
        list.deleteFirst();
        list.deleteLast();
        int size = list.getSize();
        System.out.println(size);

        list.printList();

    }

}
