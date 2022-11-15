import java.util.function.Function;

public class Bar {
    public static void main(String[] args) {


        Customer customer = new Customer(18);
        Customer customer1 = new Customer(8);
        Customer customer2 = new Customer(118);
        Customer customer3 = new Customer(16);



        Bartender bartender = new Bartender();
        Promoter promoter = new Promoter();
        WCLady wcLady = new WCLady();
        //Bouncer bouncer = new Bouncer();


        //this is exactly like the piece of code in Bouncer
        AgeChecker ageChecker = (Customer c)->{
            if (c.getAge()<18){
                return false;
            }else {
                return true;
            }
        };
        AgeChecker ageCheckerForAmerica =(Customer c)->{
            if (c.getAge()<21){
                return false;
            }else {
                return true;
            }
        };

        Function<Customer, Boolean> ageFunction = (Customer c)->{

            if (c.getAge()<18){
                return false;
            }else {
                return true;
            }
        };

        //if (bouncer.checkAge(customer))
        if (ageFunction.apply(customer)) {
            bartender.serveADrink("Pina Colada", customer);
        }

        if (ageChecker.checkAge(customer3)) {
            bartender.serveADrink("Pina Colada", customer3);
        }





    }
}