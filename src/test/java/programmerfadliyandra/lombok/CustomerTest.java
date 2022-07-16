package programmerfadliyandra.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void tstCustomer() {

        var customer = new Customer();
        customer.setId("100");
        customer.setName("fadli");

        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }

    @Test
    void testCustomerConstructor() {

        var customer = new Customer("ID", "NAME");
        Assertions.assertEquals("ID",customer.getId());
        Assertions.assertEquals("NAME",customer.getName());

    }

    @Test
    void testEqualas() {
        var customer1 = new Customer("ID","NAME1");
        var customer2 = new Customer("ID","NAME2");

        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());
    }
}
