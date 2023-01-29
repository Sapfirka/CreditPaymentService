public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loan = 1_000_000; //Сумма кредита
        int creditTerm = 3; //Срок кредита (год/лет)
        double rate = 9.99; //Процентная ставка
        double payments = Math.round(service.accounting(loan, creditTerm, rate));
        System.out.println("Ежемесячный платёж:");
        System.out.println();
        System.out.println(payments);

    }
}
