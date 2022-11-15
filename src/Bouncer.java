public class Bouncer {


    public boolean checkAge(Customer c){
        if (c.getAge()<18){
            return false;
        }else {
            return true;
        }
    }

}
