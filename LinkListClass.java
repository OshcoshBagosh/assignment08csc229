import java.util.LinkedList;
public class LinkListClass {

    //Fills in a linkList with only prime numbers from 1 to n
    //O(nlog(n))
    public static void fillList(LinkedList list, int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                list.add(i);
        }

    }

    //Checks if number is a prime number
    //O(log(n)
    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Checks if a number has a digit of 3
    //O(n)
    private static boolean digit3(int n){
        while (n > 0){
            if (n % 10 == 3)
                return true;
            n /= 10;
        }
        return false;
    }

    //Moves prime numbers with digits of 3 to another LinkedList
    //O(n^2)
    public static void move3(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int num;
        int size = list1.size();
        for (int i = 0; i < size; i++){
            num = list1.peek();
            if (digit3(num) == true)
                list2.add(list1.remove());
            else
                list1.remove();
        }
    }

    //returns sum of LinkedList
    public static int addPrime(LinkedList<Integer> list){
        int sum = 0;
        int size = list.size();
        for (int i = 0; i <size; i++)
            sum += list.remove();
        return sum;
    }
}



