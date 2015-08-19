/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Secci�n: 10
 * @author Diego Morales. Carn�: 14012
 * @author Diego Sosa. Carn�: 14735
 * @author Julio Gonz�lez. Carn�: 14096
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */


/**
 * Esta es la interfaz ADTStack creada por los propios alumnos para
 * utilizarlo en toda la secci�n. Con esta interfaz se busca implementar una
 * pila y realizar las funciones principales: push y pop de datos. 
 * Con esta interfaz se busca recibir cualquier tipo de dato ya que se especifica
 * que se utilizar� en posteriores c�digos y por eso es la raz�n que sea tipo E
 * aunque luego se utilice Integer ya que por ahora interesa relizar operaciones
 * num�ricas b�sicas.
 * Se realiza una implementaci�n de pila con un vector de tama�o variable utilizando
 * la Clase Vector
 * 
 * Adem�s utiliza los siguientes m�todos:
 * empty: vaciar pila
 * isEmptiy: verifica si est� vac�a
 * push: guarda datos
 * pop: saca datos
 * size: tama�o de la pila
 * peek: obtener el valor m�s alto de la pila
 *
 * @param <E> para utilizar cualquier tipo de dato
 */
public abstract class Pila<E> {
	/*JAKLSFJDKLSDJFKLSJDFKLJ*/
	/**
	 * Este m�todo es el encargado de vaciar la pila. 
	 * Con este m�todo se pueden elminar todos los elementos
	 * de la pila sin importar el orden en que hayan entrado.
	 * Simplemente borra todos los datos.
	 */
	public abstract void empty();
	
	/**
	 * Con este m�todo se puede verificar excusivametne si la pila est� vac�a.
	 *  
	 * @return true �nicamente si la pila no tiene ning�n elmento
	 * 		   false de manera opuesta
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Este m�todo permite agregar un elemento a la pila.
	 * Se realiza la operaci�n agergando el par�metro <x> directamente 
	 * al final del vector que contiene los datos. No puede ingresarse 
	 * el valor en otra posicion
	 * 
	 * @param x es el elemento que ser� agregado al final de la pila
	 */
	public abstract void push(E x) ;
	
	/**
	 * Este m�tdo permite recuperar el �ltimo elemento ingresado a la pila.
	 * Toma el �ltimo elemento del vector, toma el valor o el dato y lo
	 * remueve de la pila para ser utilizado como sea requerido.
	 * 
	 * @return El �ltimo valor de la pila, adem�s de removerlo de dicha pila.
	 * @throws Exception errores en ejecuci�n cuando se llama al m�todo
	 * 		   			 Retorna un error si la pila est� vac�a
	 */
	public abstract E pop() throws Exception;
	
	/**
	 * Con este m�todo se puede saber la cantidad de componentes que tiene la pila luego de
	 * estarle agretando elementos.
	 * @return el tama�o de la pila. Este tama�o ser� el n�mero de elementos que tiene la pila.
	 */
	public abstract int size();
	
	/**
	 * Con este m�todo se puede obtener el �ltimo componente de la pila sin sacarlo de dicha pila. 
	 * Se diferencia del m�todo <pop> porque dicho m�todo saca el valor de la pila. Con este m�todo
	 * el elemento se mantiene dentro de la pila.
	 * 
	 * @return Retorna el �ltimo componente de la pila. Esta opci�n no quita el elemento de
	 * 				   la pila como lo hace el <pop> sino solo se obtiene dicho componente:
	 * 				   el dato, el valor que tiene, etc. 
	 * 
	 * @throws Exception errores en ejecuci�n cuando se llama al m�todo
	 * 		   			 Retorna un error si la pila est� vac�a
	 */
	public abstract E peek() throws Exception;
	
}
