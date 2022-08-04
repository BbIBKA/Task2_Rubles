public class Main {
    public static void main(String[] args) {
        int accountMoney = 500;
        int amountDeposit = 700;
        int sumAccountMoney = accountMoney + amountDeposit;

        int bonus;
        if (amountDeposit < 1000) {
            bonus = 0;
            System.out.println(sumAccountMoney);
            System.out.println(bonus);
        } else {
            bonus = amountDeposit / 100;
            System.out.println(sumAccountMoney + bonus);
            System.out.println(bonus);
        }
    }
}
