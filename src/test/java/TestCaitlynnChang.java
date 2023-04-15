import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaitlynnChang
{
    @Test
    public void returnFullName()
    {
        Assertions.assertEquals("Caitlynn Chang", new CaitlynnChang().getFullName());
    }

    @Test
    public void returnFirstName() { Assertions.assertEquals("Caitlynn", new CaitlynnChang().getFirstName()); }

    @Test
    public void returnLastName() { Assertions.assertEquals("Chang", new CaitlynnChang().getLastName()); }

    @Test void returnNetID() { Assertions.assertEquals("caitlypc", new CaitlynnChang().getUCInetID()); }

    @Test void returnStudentNumber() { Assertions.assertEquals(35366988, new CaitlynnChang().getStudentNumber()); }

    @Test void rotate2left()
    {
        Assertions.assertEquals("itlynn ChangCa", new CaitlynnChang().getRotatedFullName(2));
    }

    @Test void rotate5right()
    {
        Assertions.assertEquals("ChangCaitlynn ", new CaitlynnChang().getRotatedFullName(-5));
    }

    @Test void rotate0()
    {
        Assertions.assertEquals("Caitlynn Chang", new CaitlynnChang().getRotatedFullName(0));
    }
}