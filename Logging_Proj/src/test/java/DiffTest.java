import static org.junit.Assert.*;

import org.junit.Test;

public class DiffTest {
   Diff a=new Diff();
	@Test
	
	public void test() {
		assertEquals(12000.0,a.variation("SM",10.0,"NA"),0);
			}

}