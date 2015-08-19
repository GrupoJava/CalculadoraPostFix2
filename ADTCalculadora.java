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

import java.io.FileNotFoundException;


/**
 * Esta es la interfaz ADTCalculadora creada por los propios alumnos para
 * utilizarlo en toda la secci�n. Practiacamente de esta interfaz se podr�n
 * hacer la lectura del archivo y realizar las operaciones. Esta clase recibe
 * datos tipo string P
 *
 * @param <P>	para que los datos sean String
 * 
 */
public interface ADTCalculadora<P> {
	
	/**
	 * Permite la lectura de un archivo tipo String. Este archivo traer� una secuencia
	 * de caracteres que ser� una operaci�n en formato postifix. 
	 * El m�todo permite traer el arhcivo y luego har� desaparecer los espacios en blanco
	 * para empezar a realizar el proceso de meter operandos a la pila y encontrar operadores.
	 * 
	 * @param file	un archivo tipo String que traer� datos, 
	 * 				en este caso la operaci�n en notaci�n postfix
	 * @throws FileNotFoundException si no lee un archivo o no lo puede acceder
	 * @throws Exception son excepciones que pueden implementarse al ejecutar el constructor o el m�todo
	 * 					 En este m�todo se utiliza un IOException, excepciones por entradas o salidas de
	 * 					 datos incorrectos. 
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	
	/**
	 * Este m�todo realizar� todas las operaciones deseada. Una vez tomada la cadena de 
	 * caracteres sin espacios, empeiza buscando los operandos y los mete a la pila. 
	 * Cuando va guardando los elementos a la pila <push> realiza una conversi�n de String a Integer,
	 * luego los saca <pop> y ya los opera seg�n la jerarqu�a de operaciones.
	 * Los operandos ser�n n�meros de un d�gito, de 1-9 y las operaciones a realizar son:
	 * -, +, *, /, ^ Un operador o s�mbolo distinto de estos cinco, mostrar� error. 
	 * 
	 * @return el valor resultante de la operaci�n que est� dentro de la pila
	 * 			el dato no es sacado de la pila, s�lo retorna su valor.
	 * @throws Exception excepciones que pueden al ejecutar el constructor o el m�todo.
	 * 					 En este caso, retorna error de s�mbolo o caracter desconocido.
	 */
	public P calcular() throws Exception;
	
	
}
