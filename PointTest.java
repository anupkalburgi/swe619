import static org.junit.Assert.*;
import org.junit.*;

public class PointTest {
	//Liskov's implementation fails transitivity test of equals()
	@Test
	public void Point3TransitiveTest()
	{
		Object x = new Point3(3,4,7);
		Object y = new Point2(3,4);
		Object z = new Point3(3,4,8);
		assertTrue((x.equals(y) && y.equals(z)) ? x.equals(z) : true);
	}
	
	//NewPoint3 passes transitive test, as well as reflexive, symmetric, and null tests (omitted)
	@Test
	public void NewPoint3TransitiveTest()
	{
		Object x = new NewPoint3(3,4,7);
		Object y = new Point2(3,4);
		Object z = new NewPoint3(3,4,8);
		assertTrue((x.equals(y) && y.equals(z)) ? x.equals(z) : true);
	}
}