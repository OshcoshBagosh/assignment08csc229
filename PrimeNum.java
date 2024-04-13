
public class PrimeNum {

    //Fills in a linkList with only prime numbers from 1 to n
    //O(nlog(n))
    public static void fillList(SinglyLinkedList list, int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                list.append(new Node(i));
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
    public static boolean digit3(int n){
        while (n > 0){
            if (n % 10 == 3)
                return true;
            n /= 10;
        }
        return false;
    }
}



