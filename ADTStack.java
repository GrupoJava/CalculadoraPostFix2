/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * @author Diego Morales. Carné: 14012
 * @author Diego Sosa. Carné: 14735
 * @author Julio González. Carné: 14096
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */


/**
 * Esta es la interfaz <ADTStack> creada por los propios alumnos para
 * utilizarlo en toda la sección. Con esta interfaz se busca implementar una
 * pila y realizar las funciones principales: push y pop de datos. 
 * Con esta interfaz se busca recibir cualquier tipo de dato ya que se especifica
 * que se utilizará en posteriores códigos y por eso es la razón que sea tipo <E>
 * aunque luego se utilice <Integer> ya que por ahora interesa relizar operaciones
 * numéricas básicas.
 * Se realiza una implementación de pila con un vector de tamaño variable utilizando
 * la Clase <Vector>
 * 
 * Además utiliza los siguientes métodos:
 * <empty> vaciar pila
 * <isEmptiy> verifica si está vacía
 * <push> guarda datos
 * <pop> saca datos
 * <size> tamaño de la pila
 * <peek> obtener el valor más alto de la pila
 *
 * @param <E> para utilizar cualquier tipo de dato
 */
public interface ADTStack<E> {
	
	/**
	 * Este método es el encargado de vaciar la pila. 
	 * Con este método se pueden elminar todos los elementos
	 * de la pila sin importar el orden en que hayan entrado.
	 * Simplemente borra todos los datos.
	 */
	public void empty();
	
	/**
	 * Con este método se puede verificar excusivametne si la pila está vacía.
	 *  
	 * @return true únicamente si la pila no tiene ningún elmento
	 * 		   false de manera opuesta
	 */
	public boolean isEmpty();
	
	/**
	 * Este método permite agregar un elemento a la pila.
	 * Se realiza la operación agergando el parámetro <x> directamente 
	 * al final del vector que contiene los datos. No puede ingresarse 
	 * el valor en otra posicion
	 * 
	 * @param x es el elemento que será agregado al final de la pila
	 */
	public void push(E x) ;
	
	/**
	 * Este métdo permite recuperar el último elemento ingresado a la pila.
	 * Toma el último elemento del vector, toma el valor o el dato y lo
	 * remueve de la pila para ser utilizado como sea requerido.
	 * 
	 * @return El último valor de la pila, además de removerlo de dicha pila.
	 * @throws Exception errores en ejecución cuando se llama al método
	 * 		   			 Retorna un error si la pila está vacía
	 */
	public E pop() throws Exception;
	
	/**
	 * Con este método se puede saber la cantidad de componentes que tiene la pila luego de
	 * estarle agretando elementos.
	 * @return el tamaño de la pila. Este tamaño será el número de elementos que tiene la pila.
	 */
	public int size();
	
	/**
	 * Con este método se puede obtener el último componente de la pila sin sacarlo de dicha pila. 
	 * Se diferencia del método <pop> porque dicho método saca el valor de la pila. Con este método
	 * el elemento se mantiene dentro de la pila.
	 * 
	 * @return Retorna el último componente de la pila. Esta opción no quita el elemento de
	 * 				   la pila como lo hace el <pop> sino solo se obtiene dicho componente:
	 * 				   el dato, el valor que tiene, etc. 
	 * 
	 * @throws Exception errores en ejecución cuando se llama al método
	 * 		   			 Retorna un error si la pila está vacía
	 */
	public E peek() throws Exception;
	
}
