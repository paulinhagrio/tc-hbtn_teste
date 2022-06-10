

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTest {

    public Person person;

    @BeforeEach
    public void setup(){
        person = new Person("Paul","McCartney", new Date(2000), true,true,true );

    }

    @Test
    public void show_full_name(){
        assertEquals("Paul McCartney",person.fullName("Paul","McCartney" ));
    }

    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person.setSalary(1200);
       person.setBirthDate(new Date(2000));
        person.setPublicServer(false);
        person.setPensioner(false);
        person.setAnotherCompanyOwner(false);

        assertTrue(person.isMEI());

    }

    @Test
    public void person_is_not_MEI(){

        person.setSalary(12000);
        person.setBirthDate(new Date(2021));
        person.setPublicServer(true);
        person.setPensioner(true);
        person.setAnotherCompanyOwner(true);

        assertFalse(person.isMEI());
    }
}
