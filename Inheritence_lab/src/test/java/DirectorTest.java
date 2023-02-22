import org.junit.Before;
import org.junit.Test;
import staff.Director;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director Dian;

    @Before
    public void before() {
        Dian = new Director("Dian", 5678, 33000, "AI", 3000000);
    }

    @Test
    public void hasName(){ assertEquals("Dian", Dian.getName());}
    @Test
    public void hasNumber(){
        assertEquals(5678, Dian.getNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(33000, Dian.getSalary());
    }
    @Test
    public void hasDepartment(){
        assertEquals("AI", Dian.getDepartment());
    }
    @Test
    public void hasBudget(){
        assertEquals(3000000, Dian.getBudget());
    }
    @Test
    public void canSetBudget(){
        Dian.setBudget(2000000);
        assertEquals(2000000, Dian.getBudget());
    }
    @Test
    public void canRaiseSalary(){
        Dian.raiseSalary(1000);
        assertEquals(34000, Dian.getSalary());
    }
    @Test
    public void canPayBonus(){
        Dian.payBonus();
        assertEquals(33330, Dian.getSalary());
    }
    @Test
    public void cantGivePayCut(){
        Dian.raiseSalary(-1000);
        assertEquals(33000, Dian.getSalary());
    }
    @Test
    public void canChangeName(){
        Dian.setName("Barbara");
        assertEquals("Barbara", Dian.getName());
    }
    @Test
    public void cantGiveNullName(){
        Dian.setName(null);
        assertEquals("Dian", Dian.getName());
    }

}
