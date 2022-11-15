import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuntionalInterFaceDemo {
    public static void main(String[] args) {

        //Runnable: doesn't reguire a input, doesn't give an output(no returntype)

        Runnable timeRunnable = () -> {
            System.out.println(LocalDateTime.now());
        };
        timeRunnable.run();

        //Consumer: requires input; doesn't give output(returntype)

        Consumer <Customer> customerConsumer = (Customer c)->{
            System.out.println("This custumer's age is: "+c.getAge());
        } ;
        customerConsumer.accept(new Customer(50));

        //Supplier: doesn't require anything, but gives you something back

        Supplier<Integer> randomNumberSupplier = ()->{
            Random random = new Random();
            return random.nextInt(80);
        } ;
         int random=  randomNumberSupplier.get();
        System.out.println(random);

        //Function

        Function <String, Integer> letterCount = (String s)->{
            return s.length();
        };

        int lengthOfWord = letterCount.apply("word");
        System.out.println(lengthOfWord);



    }
}
