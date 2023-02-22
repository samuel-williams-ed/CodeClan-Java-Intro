import org.junit.Before;
import org.junit.Test;
import staff.Developer;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    Developer Ryian;

    @Before
    public void before() {
        Ryian = new Developer("Ryian", 5678, 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Ryian", Ryian.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals(5678, Ryian.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, Ryian.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        Ryian.raiseSalary(1000);
        assertEquals(31000, Ryian.getSalary());
    }

    @Test
    public void canPayBonus() {
        Ryian.payBonus();
        assertEquals(30300, Ryian.getSalary());
    }
}