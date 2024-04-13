public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        PrimeNum.fillList(list1, 100);
        list1.print();

        Node temp = list1.getHead();
        int sum = 0;
        while (temp != null){
            if (PrimeNum.digit3(temp.data)){
                list2.append(new Node(temp.data));
                sum += temp.data;
            }
            temp = temp.next;
        }

        list2.print();
        System.out.println("The sum of List2 is: " + sum);

    }
}
