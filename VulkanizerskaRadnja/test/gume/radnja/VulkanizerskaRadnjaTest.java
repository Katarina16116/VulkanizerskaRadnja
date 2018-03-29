package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	AutoGuma a;
	AutoGuma b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		b = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
		b = null;
	}

	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(160);
		a.setVisina(50);
		
		v.dodajGumu(a);
		
		assertEquals(a, v.getGume().getFirst());
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(160);
		a.setVisina(50);
		
		b.setMarkaModel("Sava");
		b.setPrecnik(15);
		b.setSirina(160);
		b.setVisina(50);
		
		v.dodajGumu(a);
		v.dodajGumu(b);
	}

	@Test
	public void testPronadjiGumu() {
		a.setMarkaModel("Sava");
		b.setMarkaModel("Tigar");
		
		v.dodajGumu(a);
		v.dodajGumu(b);
		
		assertEquals(a, v.pronadjiGumu("Sava").get(0));
	}
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuNemaUListi() {
		a.setMarkaModel("Sava");
		b.setMarkaModel("Tigar");
		
		v.dodajGumu(a);
		v.dodajGumu(b);
		
		LinkedList<AutoGuma> g = v.pronadjiGumu("Michelin");
		
		assertTrue(g.isEmpty());
	}
	
	@Test
	public void testDodajGumuVecPostojiDveIste() {
		a.setMarkaModel("Sava");
		a.setPrecnik(15);
		a.setSirina(160);
		a.setVisina(50);
		
		b.setMarkaModel("Sava");
		b.setPrecnik(17);
		b.setSirina(162);
		b.setVisina(50);
		
		v.dodajGumu(a);
		v.dodajGumu(b);
		
		LinkedList<AutoGuma> g = v.pronadjiGumu("Sava");
		
		assertEquals(a, g.get(1));
		assertEquals(b, g.get(0));
	}

}
