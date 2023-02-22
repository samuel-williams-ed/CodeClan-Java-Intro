import org.junit.Before;
import org.junit.Test;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager Bryan;

    @Before
    public void before() {
        Bryan = new Manager("Bryan", 5678, 33000, "AI");
    }

    @Test
    public void hasName(){ assertEquals("Bryan", Bryan.getName());}
    @Test
    public void hasNumber(){
        assertEquals(5678, Bryan.getNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(33000, Bryan.getSalary());
    }
    @Test
    public void hasDepartment(){
        assertEquals("AI", Bryan.getDepartment());
    }
    @Test
    public void canRaiseSalary(){
        Bryan.raiseSalary(1000);
        assertEquals(34000, Bryan.getSalary());
    }
    @Test
    public void canPayBonus(){
        Bryan.payBonus();
        assertEquals(33330, Bryan.getSalary());
    }
}
