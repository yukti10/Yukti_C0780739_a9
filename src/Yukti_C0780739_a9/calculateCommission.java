package Yukti_C0780739_a9;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class calculateCommission {
    public static String currencyFormat(double amount){
        Locale cad = new Locale("EN","CA");
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(cad);
        return defaultFormat.format(amount);
    }
    public static void main(String[] args) {

        double sales, rate=0, commission, advance, pay;
        Scanner myObj = new Scanner(System.in);
       System.out.println("Enter the sales person's monthly sales:");
       sales = myObj.nextDouble();
        System.out.println("Enter the amount of advance pay:");
        advance= myObj.nextDouble();
        if (sales<10000){
            rate = 0.05;
        }
        else if (sales>=10000 &&  sales<14999 ){
            rate = 0.10;
        }
        else if (sales>=15000 &&  sales<17999 ){
            rate = 0.12;
        }
        else if (sales>=18000 &&  sales<21999 ){
            rate = 0.15;
        }
        else if (sales>=22000){
            rate = 0.16;
        }
        commission =  rate * sales;
        System.out.println("Total Commission: "+currencyFormat(commission));
        commission = commission - advance;
        System.out.println("Final Commission(after deducting advance pay): "+currencyFormat(commission));
        if (commission<0){
            commission=-(commission);
            System.out.println("The sales person must reimburse "+currencyFormat(commission)+" back ");
        }


    }

}
