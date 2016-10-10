package Base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getAreaTest() {
		Triangle Triangle = new Triangle(3,4,5);
		assertEquals(6,Triangle.getArea(),0);
		
		    }
	@Test
	public void getPerimeterTest() {
		Triangle Triangle = new Triangle(1,1,1);
		assertEquals(3,Triangle.getPerimeter(),0);
		
		    }
	}