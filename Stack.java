import java.util.ArrayList;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Secci�n: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */



/**
 * 
 * La clase Stack implementa la clase ADTStack.
 * Utiliza datos tipo Integer. Con esta clase se pretende utilizar
 * la clase Vector la cual tiene opciones predefinidas que har�n
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
public class Arraylist<E> extends Pila<Integer> {
	
	private ArrayList <Integer> arrayList;
	
	/**
	 * Este es el constructor de <Stack> y crea un nuevo vector
	 * de la Clase Vector. 
	 * Crea un Objeto:
	 * arrayList que ser� la nueva pila
	 * La inicializa y la vac�a.
	 */
	public Arraylist() {
		this.arrayList = new ArrayList <Integer>();	
		arrayList.clear();
	}

	@Override
	public void empty() {
		arrayList.clear();		
	}

	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	@Override
	public int size() {
		return arrayList.size();
	}
	
	@Override
	public Integer pop() throws Exception {
		if (arrayList.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return arrayList.remove(arrayList.size()-1);
	}

	@Override
	public Integer peek() throws Exception {
		if (arrayList.isEmpty())
			throw new Exception("ArrayList vacio!");
		else
			return arrayList.get(arrayList.size()-1);
	}

	@Override
	public void push(Integer x) {
		arrayList.add(x);
	}

}
