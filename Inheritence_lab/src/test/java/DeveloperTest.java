import org.junit.Before;
import org.junit.Test;
import staff.Developer;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer Brian;

    @Before
    public void before() {
        Brian = new Developer("Bryan", 5679, 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Bryan", Brian.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals(5679, Brian.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, Brian.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        Brian.raiseSalary(1000);
        assertEquals(31000, Brian.getSalary());
    }
    @Test
    public void canPayBonus() {
        Brian.payBonus();
        assertEquals(30300, Brian.getSalary());
    }
    @Test
    public void canComplain(){
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        System.out.println(Brian.complain());
        assertEquals( String.class, Brian.complain().getClass() );
    }
}