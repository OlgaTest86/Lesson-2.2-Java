public class Main {
    public static void main(String[] args) {
        int currentAccount = 200;
        int refill = 100;
        int bonus;
        if (refill <= 100) {
            bonus = 0;
        } else bonus = refill / 100;
        int totalSum = currentAccount + refill + bonus;


        System.out.println(totalSum);
    }
}
