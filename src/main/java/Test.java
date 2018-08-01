/**
 * Created by Artem on 8/1/2018.
 */
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    public static class SLF4JTest { private final Logger logger = LoggerFactory.getLogger(SLF4JTest.class);

        private void sayHello() {
            logger.info("hello");
        }

         }

    public static class Person implements Comparable<Person> {

        private String lastName = "Ekker";
        private String middleName = "Vadimovich";
        private String firstName = "Artem";

        // constructor, getters and setters are omitted


        @Override
        public int compareTo(Person o) {
            int result = ComparisonChain.start()
                    .compare(lastName, firstName)
                    .compare(firstName, middleName , Ordering.natural().nullsLast())
                    .result();
            return result;
        }
    }
    public static void main(String args[]) { SLF4JTest scanner = new SLF4JTest(); scanner.sayHello();
    /*scanner.toString();
    System.out.println(scanner);*/
    Person person = new Person();
    System.out.println(person.compareTo(person));

    }

}
