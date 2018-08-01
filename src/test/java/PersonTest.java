import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Artem on 8/1/2018.
 */
public class PersonTest {
    @org.junit.Test
    public void compareTo() throws Exception {
        Test.Person person = new Test.Person();
        int source = person.compareTo(person);
        int expected = 1;
    }

}