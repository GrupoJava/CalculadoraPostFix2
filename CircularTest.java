import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Rudy Garrido
 * @author Yosemite
 *
 */
public class CircularTest {

	Circular <Integer> cr = new Circular <Integer>();
	//se = doblemente enlazada
	
	
	@Test
	public void testPush() {
		cr.push(1);
		cr.push(2);
		cr.push(3);
		
		assertEquals(3,cr.size(),0);
	}
		
	@Test
	public void testPop() {
		cr.push(1);
		cr.push(2);
		cr.push(3);
		
		try {
			assertEquals(3,cr.pop(),0);
			assertEquals(2,cr.pop(),0);
			assertEquals(1,cr.pop(),0);
			
			if (cr.isEmpty())
				assertEquals(0,0,0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPeek() {
		cr.push(1);
		cr.push(2);
		cr.push(3);
		cr.push(5);
		
		try {
			int p = cr.peek();
			assertEquals(5,p,0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testSize() {
		cr.push(1);
		assertEquals(1,cr.size(),0);
		
	}
	
	@Test
	public void testIsEmpty() {
		cr.push(1);
		cr.push(2);
		
		cr.empty();
		
		if(cr.isEmpty() == true)
			assertEquals(0,0,0);
		else
			assertEquals(1,0,0);
		
	}
	


}
