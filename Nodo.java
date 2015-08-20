/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Secci�n: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

/**
 * 
 * 
 * @author Rudy Garrido
 * @author Yosemite Melendez
 * 
 *
 * @param <E>
 */
public class Nodo<E> {
	
	protected E valor;
	protected Nodo<E> next;
	
	public Nodo(E v){
		valor = v;
	}
	
	public void setNext(Nodo<E> E){
		next = E;
	}
	
	public Nodo<E> getNext(){
		return next;
	}
	
	public void setValor(E s){
		valor = s;
	}
	
	public E getValor(){
		return valor;
	}
}