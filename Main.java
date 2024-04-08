import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        LinkListClass.fillList(list1, 100);
        System.out.println(list1);

        LinkListClass.move3(list1, list2);

        System.out.println(list2);

        System.out.println(LinkListClass.addPrime(list2));

    }
}
