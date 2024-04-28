public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.MBBANK);
        System.out.println(bank.getBankName());
    }
}