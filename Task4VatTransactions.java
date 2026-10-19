public class Task4VatTransactions {

    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;
        int units = 10_000;

        double vatPerUnit = productCost * vatRate;
        System.out.println("VAT for a single unit: " + vatPerUnit);

        double totalNet = 0;
        double totalVat = 0;
        for (int i = 0; i < units; i++) {
            totalNet += productCost;
            totalVat += vatPerUnit;
        }
        double totalGross = totalNet + totalVat;

        System.out.println("Total net sales value: " + totalNet);
        System.out.println("Total VAT amount: " + totalVat);
        System.out.println("Total gross value: " + totalGross);
    }
}
