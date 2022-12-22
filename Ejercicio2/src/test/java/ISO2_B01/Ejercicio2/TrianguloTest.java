package ISO2_B01.Ejercicio2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class TrianguloTest {
	
	@Test
	public void TestTriangulo1() {
		
		Triangulo t = new Triangulo(2,3,4,47,84,110);
		assertTrue(t.triangulo == Triangulo.TestTriangulo1);
	}
	
	@Test
	public void TestTriangulo2() {
		
		Triangulo t = new Triangulo(4,3,2,40,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo2);
	}
	
	@Test
	public void TestTriangulo3() {
		
		Triangulo t = new Triangulo(3,2,4,40,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo3);
	}
	
	@Test
	public void TestTriangulo4() {
		
		Triangulo t = new Triangulo(1,3,2,30,60,90);
		assertTrue(t.triangulo == Triangulo.TestTriangulo4);
	}
	
	@Test
	public void TestTriangulo5() {
		
		Triangulo t = new Triangulo(3,4,2,30,60,90);
		assertTrue(t.triangulo == Triangulo.TestTriangulo5);
	}
	
	@Test
	public void TestTriangulo6() {
		
		Triangulo t = new Triangulo(1,2,3,30,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo6);
	}
	
	@Test
	public void TestTriangulo7() {
		
		Triangulo t = new Triangulo(4,1,2,30,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo7);
	}
	
	@Test
	public void TestTriangulo8() {
		
		Triangulo t = new Triangulo(2,2,3,30,30,120);
		assertTrue(t.triangulo == Triangulo.TestTriangulo8);
	}
	
	@Test
	public void TestTriangulo9() {
		
		Triangulo t = new Triangulo(1,4,2,30,30,120);
		assertTrue(t.triangulo == Triangulo.TestTriangulo9);
	}
	
	@Test
	public void TestTriangulo10() {
		
		Triangulo t = new Triangulo(2,2,3,47,84,110);
		assertTrue(t.triangulo == Triangulo.TestTriangulo10);
	}
	
	@Test
	public void TestTriangulo11() {
		
		Triangulo t = new Triangulo(1,2,4,40,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo11);
	}
	
	@Test
	public void TestTriangulo12() {
		
		Triangulo t = new Triangulo(2,3,2,30,60,90);
		assertTrue(t.triangulo == Triangulo.TestTriangulo12);
	}
	
	@Test
	public void TestTriangulo13() {
		
		Triangulo t = new Triangulo(3,2,4,30,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo13);
	}
	
	@Test
	public void TestTriangulo14() {
		
		Triangulo t = new Triangulo(2,2,2,30,30,120);
		assertTrue(t.triangulo == Triangulo.TestTriangulo14);
	}
	
	@Test
	public void TestTriangulo15() {
		
		Triangulo t = new Triangulo(2,3,4,30,60,80);
		assertTrue(t.triangulo == Triangulo.TestTriangulo15);
	}
	
	@Test
	public void TestTriangulo16() {
		
		Triangulo t = new Triangulo("a","b","c","a","b","c");
		assertTrue(t.triangulo == Triangulo.TestTriangulo16);
	}
	
	@Test
	public void TestTriangulo17() {
		
		Triangulo t = new Triangulo(-1,-3,-4,-50,182,190);
		assertTrue(t.triangulo == Triangulo.TestTriangulo17);
	}

}
