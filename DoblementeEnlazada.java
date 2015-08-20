/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

/**
 * La calse DoblementeEnlazada es una lista que, como su nombre 
 * lo indica es de enlace doble. Se caraceteriza porque peude apuntar
 * tanto al nodo anterior como al siguiente. Hay un atritubo que se llama 
 * head que apunta al primer nodo de la lista y otro que es tail que apunta
 * al último elemento de la lista. 
 * @author Rudy Garrido
 * @author Yosemite
 *
 * @param <E>
 */
public class DoblementeEnlazada <E> extends Lista <E>{

	protected NodoDoble <E> head = null;
	protected NodoDoble <E> tail = null;
	
	/**
	 * Este es el constructor de objetos. Crea un count que lo inicializa
	 * en cero y head que al inicio es null porque la lista está vacía.
	 * tail debe considerarse en un caso particular, porque si está vacía
	 * head = tail = null y si la lista es uno head = tail. 
	 */
	public DoblementeEnlazada() {
		cont = 0;
		head = null;
	}
	
	public int size() {
		return cont;
	}
	
	public void addLast(E value) { //
		tail = new NodoDoble <E> (value);
		cont ++;
	}
	
	public E removeLast() { //
		NodoDoble<E> temp = tail;
		tail = tail.getPrevious();
		if (tail == null){
			head = null;
		}
		else {
			tail.setNext(null);
		}
		cont --;
		return temp.getValor();
		
	}
	
	
	public E getLast() {
		return tail.getValor();
	}
	
	public boolean contains(E value) { 
		int i = 0;
		NodoDoble<E> temp = head;
		while (i<size()){
			if (temp.valor == value){
				return true;
			}
			else
			{
				temp = (NodoDoble<E>) temp.getNext();
			}
			i++;
		}
		
		return false;
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
		if(head==null){
			head = new NodoDoble<E>(x) ;
		}else{
			tail=head;
			head= new NodoDoble<E>(x) ;
			head.setNext(tail);
			tail.setPrevious(head);
			
		}
		cont++;
	}

	@Override
	public E pop() throws Exception {
		
		if (head!=null && size()!=0){
			NodoDoble<E> temp;
			temp=head;
			head.setNext(null);
			head=tail;
			head.setPrevious(null);
			if(head.getNext()!=null){
				tail=(NodoDoble<E>) head.getNext();
			}
			cont--;
			return (E) temp.getValor();
		}
		cont--;
		return null;
	}

	@Override
	public E peek() throws Exception {
		return head.getValor();
	}
}