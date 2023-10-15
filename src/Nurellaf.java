import java.math.BigDecimal;

public class Nurellaf {
    public static void main(String[] args) {
        System.out.println("Using double");
        double productNet = 9.99;
        double vat = 0.23;
        double productGross = (vat + 1) * productNet;
        System.out.println("productGross = " + productGross);
        double totalGross =  productGross * 10000;
        System.out.println("totalGross =" + totalGross);
        double totalNet = totalGross - (totalGross * vat);
        System.out.println("totalNet =" + totalNet);

        System.out.println("using Big Decimal");
        BigDecimal productN = BigDecimal.valueOf(9.99);
        BigDecimal V = BigDecimal.valueOf(0.23);
        BigDecimal productG = (V.add(BigDecimal.ONE)).multiply(productN);
        System.out.println("productG = " + productG);
        BigDecimal totalG =  productG.multiply(BigDecimal.valueOf(10000));
        System.out.println("totalG =" + totalG);
        BigDecimal totalN = totalG.subtract(totalG.multiply(V));
        System.out.println("totalN =" + totalN);
        //For such smaller values there is small difference in result
    }
}
