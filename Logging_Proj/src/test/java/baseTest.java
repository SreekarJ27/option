import static org.junit.Assert.*;

import org.junit.Test;

public class baseTest {
	 private static final double DELTA = 1e-15;
base r=new base(10,10,1);
base r1=new base(10.0, 100.0, 1.0);

	@Test
	public void test() {
		assertEquals(1.00,r.si(),DELTA);
		assertEquals(20.0,r.ci(),DELTA);
	}

}