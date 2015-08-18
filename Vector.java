/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Secci�n: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.util.Vector;

/**
 * 
 * La clase <Stack> implementa la clase <ADTStack>.
 * Utiliza datos tipo Integer. Con esta clase se pretende utilizar
 * la clase <Vector> la cual tiene opciones predefinidas que har�n
 * que se cree un vector de datos que tendr� la forma de una pila
 * por los m�todos definidos para esta clase. Gracias a esta clase
 * se har�n operaciones en notaci�n Postfix en <Calculadora>
 * La idea de la pila es realizar push y pop de datos, verificar si
 * la pila est� vac�a y mostrarlo en pantalla as� como vaciar la pila
 * u obtener su �ltimo dato.
 * 
 * @author Andr� Rodas
 * @author Rudy Garrido 
 * @author Yosemite Mel�ndez
 *
 * @param <Integer> para recibir datos num�ricos
 */
public class MVector<Integer> extends Pila<Integer> {
	
	private Vector <Integer> vector;
	
	/**
	 * Este es el constructor de <Stack> y crea un nuevo vector
	 * de la Clase <Vector>. 
	 * Crea un Objeto:
	 * <vector> que ser� la nueva pila
	 * La inicializa y la vac�a.
	 */
	public MVector() {
		this.vector = new Vector <Integer>();	
		vector.clear();
	}

	public void empty() {
		vector.clear();		
	}


	public boolean isEmpty() {
		return vector.isEmpty();
	}

	public int size() {
		return vector.size();
	}
	
	public Integer pop() throws Exception {
		if (vector.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return vector.remove(vector.size()-1);
	}

	public Integer peek() throws Exception {
		if (vector.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return vector.lastElement();
	}

	public void push(Integer x) {
		vector.add(x);
	}

}
