import java.util.Scanner;

public class excercise_seven {
 public static double forecast(double currentValue, double rate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue * rate , rate, years - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the present year");
        int pyear = scan.nextInt();
        System.out.println("enter the current value");
        double currentValue = scan.nextDouble();
        System.out.println("enter the year for which you want to forecast");
        int fyear = scan.nextInt();

        int years = fyear - pyear;
         if (years < 0) {
            System.out.println("Forecast year must be greater than or equal to present year.");
            scan.close();
            return;
        }

        System.out.println("enter the rate in %(percentage) at which the revenue grows");
        double rate = scan.nextDouble();
        rate  = 1+rate/100;

        double ans = forecast(currentValue, rate, years);

        System.out.println("the forcasted value for the year "+fyear+" is "+ans);
        scan.close();
    }
}
