import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student;

    @Before
    public void before(){
        student = new Student("Debi", 22, "G6", "Python Project");
    }

    @Test
    public void hasName(){
        assertEquals("Debi", student.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G6", student.getCohort());
    }

    @Test
    public void canChangeCohort(){
        student.changeCohort("G8");
        assertEquals("G8", student.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I really enjoyed making Python Project", student.talk("Java"));
    }
}