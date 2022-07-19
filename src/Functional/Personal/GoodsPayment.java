package Functional.Personal;

import java.time.LocalDate;
import java.util.Objects;

public class GoodsPayment implements PaymentFunction {


    public static void main(String[] args) {

        PaymentFunction payment = x -> {
            if(x.equals("MPESA")) {
                return 10;
            }

            return 20;
        };

        makePayment(payment);

    }

    static void makePayment(PaymentFunction paymentFunction) {
        System.out.println("Number rep of MPESA is: "+paymentFunction.numberRepOfPaymentType("MPESA"));

        String paymentDate = PaymentFunction.getPaymentDate();

        System.out.println("Payment date formatted : "+paymentDate);

        GoodsPayment goodsPayment = new GoodsPayment();

        System.out.println("Default currency to be used : "+goodsPayment.defaultCurrency());
    }

    @Override
    public String defaultCurrency() {
        //return PaymentFunction.super.defaultCurrency();
        return "USD";
    }

    @Override
    public int numberRepOfPaymentType(String paymentType) {
        return 0;
    }
}
