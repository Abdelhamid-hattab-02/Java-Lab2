public class Task4VatTransactions {

    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;
        final int numberOfUnits = 10_000;

        double vatPerUnit = productCost * vatRate;
        double grossPerUnit = productCost + vatPerUnit;
        System.out.println("VAT amount for a single unit: " + vatPerUnit);

        double totalNetSales = 0.0;
        double totalVat = 0.0;
        double totalGross = 0.0;

        for (int i = 0; i < numberOfUnits; i++) {
            totalNetSales += productCost;
            totalVat += vatPerUnit;
            totalGross += grossPerUnit;
        }

        System.out.println("Processed " + numberOfUnits + " transactions.");
        System.out.println("Total net sales value: " + totalNetSales);
        System.out.println("Total VAT amount: " + totalVat);
        System.out.println("Total gross value: " + totalGross);
    }
}
