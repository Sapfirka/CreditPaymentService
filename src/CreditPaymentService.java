public class CreditPaymentService {
    public double accounting(int loan, int creditTerm, double rate) {
        int term = creditTerm * 12;
        double percentPerMounth = rate / 100 / 12;
        double result = loan * (percentPerMounth * (Math.pow((1 + percentPerMounth), term)) / (Math.pow((1 + percentPerMounth), term) - 1));
        return result;

    }
}
