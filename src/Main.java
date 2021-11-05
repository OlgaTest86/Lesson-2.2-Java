public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int refill = 1050;
        int bonus;
        if (refill <= 1000) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }
        int totalSum = currentAccount + refill + bonus;


        System.out.println(totalSum);
    }
}
