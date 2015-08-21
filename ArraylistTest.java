import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * 
 */

/**
 * 
 * @author Rudy Garrido
 * @author Yosemite Melendez
 *
 */
public class ArraylistTest extends TestCase {
	
	Arraylist <Integer> ap = new Arraylist <Integer>();
	//ap = Arraylist prueba
	
	
	public void testIsEmpty(){
		if (ap.isEmpty()){
			assertEquals(0,0,0);
		}else
			assertEquals(1,0,0);	
	}
	
	
	public void testPush() {
		ap.push(1);
		ap.push(2);
		assertEquals(2,ap.size(),0);
	}
	
	public void testPop() {
		ap.push(1);
		ap.push(2);
		//Ahora hay 2 elementos en el Arraylist
		try{
			assertEquals(2,ap.pop(), 0);
			assertEquals(1,ap.pop(),0);
			//Quitando elementos
			if (ap.isEmpty())
				assertEquals(0,0,0);
			else
				assertEquals(1,0,0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testPeek() throws Exception {
		ap.push(1);
		ap.push(2);
		ap.push(3);
		
		try{
			//El valor esperado es 3
			assertEquals(3,ap.peek(),0);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testPeekFallado() throws Exception {
		ap.push(1);
		ap.push(2);
		ap.push(3);
		ap.push(4);
		try{
			//El valor esperado es 3
			assertEquals(3,ap.peek(),0);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testSize() {
		ap.push(1);
		int sz = ap.size();
		assertEquals(1, sz, 0);
	}
	

}
