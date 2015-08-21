import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Yosemite
 *
 */
public class DoblementeEnlazadaTest {

	DoblementeEnlazada <Integer> de = new DoblementeEnlazada <Integer>();
	//se = doblemente enlazada
	
	@Test
	public void testAddLast() {
		de.addLast(2);
		de.addLast(4);
		//Agregando dos valores a la lista. Se verifica que haya sido agregado al final
		assertEquals(4, de.getLast(),0);		
	}
	
	@Test
	public void testGetLast() {
		de.addLast(2);
		de.addLast(3);
		de.addLast(5);
		//Agreangdo dos valores a la lista. Se verifica cual es el ultimo valor
		int gLast = de.getLast();
		assertEquals(5, gLast,0);
		
	}
	
	@Test
	public void testGetLastFallado() {
		de.addLast(2);
		de.addLast(3);
		de.addLast(5);
		//Agreangdo dos valores a la lista. Se verifica cual es el ultimo valor
		int gLast = de.getLast();
		assertEquals(3, gLast,0);
		
	}
	
	@Test
	public void testRemoveLast() {
		de.addLast(2);
		de.addLast(5);
		de.addLast(1);
		
		int rLast = de.removeLast();
		assertEquals (1,rLast,0);
	}
	
	@Test
	public void testContains() {
		de.addLast(1);
		de.addLast(25);
		de.addLast(30);
		de.addLast(50);
		
		if(de.contains(25))
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
	}
	
	@Test
	public void testContainsFallado() {
		de.addLast(1);
		de.addLast(25);
		de.addLast(30);
		de.addLast(50);
		
		if(de.contains(20))
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
	}
	
	@Test
	public void testIsEmpty() {
		de.addLast(1);
		de.addLast(25);
		
		de.empty();
		
		if(de.isEmpty() == true)
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
		
	}
	
	@Test
	public void testPush() {
		de.push(1);
		de.push(2);
		de.push(3);
		
		assertEquals(3,de.size(),0);
	}
		
	@Test
	public void testPop() {
		de.push(1);
		de.push(2);
		de.push(3);
		
		try {
			assertEquals(3,de.pop(),0);
			assertEquals(2,de.pop(),0);
			assertEquals(1,de.pop(),0);
			
			if (de.isEmpty())
				assertEquals(0,0,0);
			else
				assertEquals(1,0,0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testPeek() {
		de.push(1);
		de.push(2);
		de.push(3);
		de.push(5);
		
		try {
			int p = de.peek();
			assertEquals(5,p,0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testSize() {
		de.push(1);
		assertEquals(1,de.size(),0);
		
	}

}
