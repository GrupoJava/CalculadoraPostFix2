import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Yosemite
 *
 */
public class SimplementeEnlazadaTest {

	SimplementeEnlazada <Integer> se = new SimplementeEnlazada <Integer>();
	//se = simplemente enlazada
	
	@Test
	public void testAddLast() {
		se.addLast(2);
		se.addLast(4);
		//Agregando dos valores a la lista. Se verifica que haya sido agregado al final
		assertEquals(2, se.getLast(),0);		
	}
	
	@Test
	public void testGetLastFallado() {
		se.addLast(2);
		se.addLast(5);
		se.addLast(4);
		se.addLast(6);
		//Agreangdo dos valores a la lista. Se verifica cual es el ultimo valor
		int gLast = se.getLast();
		assertEquals(5, gLast,0);
		
	}
	
	@Test
	public void testRemoveLast() {
		se.addLast(2);
		se.addLast(5);
		se.addLast(1);
		
		int rLast = se.removeLast();
		assertEquals (1,rLast,0);
	}
	
	@Test
	public void testContains() {
		se.addLast(1);
		se.addLast(25);
		se.addLast(30);
		se.addLast(50);
		
		if(se.contains(30))
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
	}
	
	@Test
	public void testIsEmpty() {
		se.addLast(1);
		se.addLast(25);
		
		se.empty();
		
		if(se.isEmpty() == true)
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
		
	}
	
	@Test
	public void testPush() {
		se.push(1);
		se.push(2);
		se.push(3);
		
		assertEquals(3,se.size(),0);
	}
		
	@Test
	public void testPop() {
		se.addLast(1);
		se.addLast(2);
		se.addLast(3);
		
		try {
			assertEquals(1,se.pop(),0);
			assertEquals(2,se.pop(),0);
			assertEquals(3,se.pop(),0);
			
			if (se.isEmpty())
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
		se.push(1);
		se.push(2);
		se.push(3);
		se.push(5);
		
		try {
			int p = se.peek();
			assertEquals(5,p,0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testSize() {
		se.push(1);
		assertEquals(1,se.size(),0);
		
	}
	
	@Test
	public void testSizeFallado() {
		se.push(1);
		se.push(2);
		assertEquals(1,se.size(),0);
		
	}
}
