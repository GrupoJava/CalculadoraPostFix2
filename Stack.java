/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.util.Vector;

/**
 * 
 * La clase <Stack> implementa la clase <ADTStack>.
 * Utiliza datos tipo Integer. Con esta clase se pretende utilizar
 * la clase <Vector> la cual tiene opciones predefinidas que harán
 * que se cree un vector de datos que tendrá la forma de una pila
 * por los métodos definidos para esta clase. Gracias a esta clase
 * se harán operaciones en notación Postfix en <Calculadora>
 * La idea de la pila es realizar push y pop de datos, verificar si
 * la pila está vacía y mostrarlo en pantalla así como vaciar la pila
 * u obtener su último dato.
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 * @param <Integer> para recibir datos numéricos
 */
public class Stack<Integer> implements ADTStack<Integer> {
	
	private Vector <Integer> myVec;
	
	/**
	 * Este es el constructor de <Stack> y crea un nuevo vector
	 * de la Clase <Vector>. 
	 * Crea un Objeto:
	 * <myvec> que será la nueva pila
	 * La inicializa y la vacía.
	 */
	public Stack() {
		this.myVec = new Vector <Integer>();	
		myVec.clear();
	}

	@Override
	public void empty() {
		myVec.clear();		
	}

	@Override
	public boolean isEmpty() {
		return myVec.isEmpty();
	}

	@Override
	public int size() {
		return myVec.size();
	}
	
	@Override
	public Integer pop() throws Exception {
		if (myVec.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return myVec.remove(myVec.size()-1);
	}

	@Override
	public Integer peek() throws Exception {
		if (myVec.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return myVec.lastElement();
	}

	@Override
	public void push(Integer x) {
		myVec.add(x);
	}

}
