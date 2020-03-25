package TTD_and_JUNIT_Testing;
import static org.junit.Assert.*;
import org.junit.Test;
public class Junit_DemoClass_Testing {
	Java_TTD_and_Junit_Demo obj=new Java_TTD_and_Junit_Demo();
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		assertEquals(obj.To_Remove_A("ABCD"),"BCD");
		assertEquals(obj.To_Remove_A("AACD"),"CD");
		assertEquals(obj.To_Remove_A("BACD"),"BCD");
		assertEquals(obj.To_Remove_A("BBAA"),"BBAA");
	    assertEquals(obj.To_Remove_A("AABAA"),"BAA");
	}

}
