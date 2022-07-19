package Functional.Personal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Date;

@FunctionalInterface
public interface PaymentFunction {

    int numberRepOfPaymentType(String paymentType);

    default String defaultCurrency() {
        return "KSH";
    }

    static String getPaymentDate(){
        SimpleDateFormat format = new SimpleDateFormat("YYYY-M-dd");
        return format.format(new Date());
    }

}
