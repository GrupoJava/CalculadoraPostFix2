/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

/**
 * La calse SimplementeEnlazada es una lista que, como su nombre 
 * lo indica es de enlace simple. Solo se puede apuntar al siguiente
 * nodo y no se puede apuntar al anterior ni al ultimo. Hay un atritubo
 * que se llama head que apunta al primer nodo de la lista y ayudará a
 * encontrar valores siguientes o apuntar a otros nodos.
 * 
 * @author Rudy Garrido
 * @author Yosemite Meléndez
 *
 * @param <E>
 */

public class SimplementeEnlazada<E> extends Lista<E>{
	
	private Nodo<E> head=null;
	
	
	/**
	 * Este es el constructor de objetos. Crea un count que lo inicializa
	 * en cero y head que al inicio es null porque la lista está vacía
	 */
	public SimplementeEnlazada() {
		cont = 0;
		head = null;
		
		// TODO Auto-generated constructor stub
	}

	public E removeLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getNext() != null){ //fin de la lista
			previous = finger;
			finger = finger.getNext();
		}
		//finger = null o fin de la lista
		if (previous == null){
			head = null; //un elemento
		}
		else{ 
			previous.setNext(null);
		}
		cont--;
		return finger.getValor();
	}
	
	public void addLast(E value) {
		Nodo <E> temp = new Nodo <E> (value);
		if (head!=null){
			Nodo<E> finger = head;
			while (finger.getNext() != null){
				finger = finger.getNext();
			}
			finger.setNext(temp);
		}
		else head = temp;
		cont ++;
	}

	
	public E getLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getNext() != null){ //fin de la lista
			previous = finger;
			finger = finger.getNext();
		}
		return previous.getValor();
	}
	
	public boolean contains(E value) {
		Nodo <E> finger = head;
		while (finger != null && !finger.getValor().equals(value)){
			
			finger = finger.getNext();
		}
		return finger != null;
	}

	@Override
	public void empty() {
		cont=0;
		head=null;
	}

	@Override
	public boolean isEmpty() {
		return cont==0;
	}

	@Override
	public void push(E x) {
		System.out.println("VALOR ENTRANDO"+x);
		Nodo<E> temporal = head;
		head = new Nodo<E>(x) ;
		head.setNext(temporal);
		cont++;
	}

	@Override
	public E pop() throws Exception {
		System.out.println(head);
		Nodo <E> temp = head;
		if(head!=null && head.getNext()!=null){
			head = head.getNext();
		}else{
			head=null;
		}
		cont--;
		return temp.getValor();
	}

	@Override
	public E peek() throws Exception {
		return head.getValor();
	}

	@Override
	public int size() {
		return cont;
	}


	
}