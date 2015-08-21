import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * 
 * @author Rudy Garrido
 * @author Yosemite Melendez
 *
 */
public class MVectorTest {

	MVector <Integer> vec = new MVector <Integer>();
	//ap = Arraylist prueba
	
	@Test
	public void testIsEmpty(){
		if (vec.isEmpty()){
			assertEquals(0,0,0);
		}else
			assertEquals(1,0,0);	
	}
	
	@Test
	public void testPush() {
		vec.push(1);
		vec.push(2);
		assertEquals(2,vec.size(),0);
	}
	
	@Test
	public void testPop() {
		vec.push(1);
		vec.push(2);
		//Ahora hay 2 elementos en el Arraylist
		try{
			assertEquals(2,vec.pop(), 0);
			assertEquals(1,vec.pop(),0);
			//Quitando elementos
			if (vec.isEmpty())
				assertEquals(0,0,0);
			else
				assertEquals(1,0,0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPeek() throws Exception {
		vec.push(1);
		vec.push(2);
		vec.push(3);
		
		try{
			//El valor esperado es 3
			assertEquals(3,vec.peek(),0);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSize() {
		vec.push(1);
		int sz = vec.size();
		assertEquals(1, sz, 0);
	}

}
