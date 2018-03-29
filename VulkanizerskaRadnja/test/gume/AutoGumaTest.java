
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AutoGumaTest {

	AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Sava");
		
		assertEquals("Sava", a.getMarkaModel());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		
		assertEquals(20, a.getPrecnik());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(3);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(50);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(200);
		
		assertEquals(200, a.getSirina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(20);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(356);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(80);
		
		assertEquals(80, a.getVisina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(20);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		a.setVisina(100);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(30);
		
		assertEquals("AutoGuma [markaModel=Sava, precnik=15, sirina=200, visina=30]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(30);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Sava");
		b.setPrecnik(15);
		b.setSirina(200);
		b.setVisina(30);
		
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(30);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(15);
		b.setSirina(200);
		b.setVisina(30);
		
		assertFalse(a.equals(b));
	}

}
