 //import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.math.BigDecimal;
import static java.math.BigDecimal.*;
public class TaxCalc {
   public static void main(String[] args){
       double priceWithoutVat = 9.99;

       System.out.println("Price without VAT: " + priceWithoutVat);

       double priceWithVat = priceWithoutVat * 1.23;
       System.out.println(" Price With VAT: " + priceWithVat);

       double valueWithVat = priceWithVat * 10_000;
       System.out.println("Value with VAT: " + valueWithVat);

       double priceWithoutVat2 = valueWithVat / 1.23;
       System.out.println("Value without VAT: " + priceWithoutVat2);

       //use of the BigDecimal class
       System.out.println(" ");
       System.out.println("After Using Big Decimal");

       BigDecimal dbPriceWithoutVat = new BigDecimal( "9.99");
       System.out.println("Price without VAT: "+ dbPriceWithoutVat);

       BigDecimal dbPriceWithVat = dbPriceWithoutVat.multiply(new BigDecimal  ("1.23") );

       dbPriceWithVat = dbPriceWithVat.setScale(2, ROUND_HALF_EVEN);
       System.out.println("Peic with VAT rounded: " + dbPriceWithVat);

       BigDecimal dbValueWithVat = dbPriceWithVat.multiply(new BigDecimal(10_000));
       System.out.println("Value with VAT: " + dbValueWithVat);

       BigDecimal dbPriceWithoutVat2 = dbPriceWithoutVat.divide(new BigDecimal("1.23"), ROUND_HALF_EVEN );
       System.out.println("Value without VAT: "+ dbPriceWithoutVat2);

   }
}
