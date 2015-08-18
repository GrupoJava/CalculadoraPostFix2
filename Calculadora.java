/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase <Calculadora> implementa la interfaz <ADTCalculadora>. 
 * Reciben archivos tipo String. Con esta clase se puede recibir un
 * archivo y leerlo. Lanza errores sino se encuentra el archivo o es
 * inaccesible. Luego de leerlo analiza los datos que trae. Los convierte 
 * a una cadea de caracteres sin espacios. Estos caracteres son analizados
 * para realizar una operación con notación Postfix. Lo que hace es un push
 * a los dos operandos en una pila y luego utiliza esos valores para operarlos
 * dependiendo el operador que esté en la cadena y dependiendo su jerarquía.
 * 
 * En esta clase se utilizan los siguietnes atributos:
 * <MyStr>: para unir la cadena de caracteres
 * <pila>: una nueva Pila.
 * <op1>: el primer operando
 * <op2>: el segundo operando
 * <res>: el resultado de la operacion
 * <numeros>: los números que deben estar contenidos en la cadena de caracteres
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 * @param <P> para tipo de datos String.
 */
public class Calculadora<P> implements ADTCalculadora<P>{
	private String MyStr;
	private Pila<Integer> pila;
	private Integer op1;
	private Integer op2;
	private Integer res;
	final String numeros = "123456789";
	
	/**
	 * Este es el constructor de la Clase. Crea cuatro objetos que son
	 * <MyStr>: para unir la cadena de caracteres, inicia vacío
	 * <op1>: el primer operando, inicia en cero
	 * <op2>: el segundo operando, inicia en cero
	 * <pila>: una nueva Pila, tipo Stack
	 * 
	 */
	public Calculadora() {
		MyStr = "";		
		op1 = 0;
		op2 = 0;
	}

	@Override
	public void readFile(String file) throws FileNotFoundException {
		File archivo = new File(file);
		 BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        try {
				while ((line = br.readLine()) != null) {
					sb.append(line);
				    //sb.append("\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        MyStr = sb.toString();
	        MyStr = MyStr.trim().replace(" ", "");

	}

	@SuppressWarnings("unchecked")
	@Override
	public P calcular() throws Exception {
		for (int i=0;i<=(MyStr.length()-1);i++)
		{
			CharSequence MyChar = "" + MyStr.charAt(i);
			if (numeros.contains(MyChar)){
				pila.push(Integer.parseInt(MyChar.toString()));
			}else 
			{
				String a = MyChar.toString();
				op1 = (Integer) pila.pop();
				op2 = (Integer) pila.pop();
				if(a.equals("+"))
					res = op1 + op2;
				else
				if(a.equals("-"))
					res = op2 - op1;
				else
				if(a.equals("*"))
					res = op1 * op2;
				else
				if(a.equals("/"))
					res = op2 / op1;
				else
				if(a.equals("^"))
					res = op2 ^ op1;
				else
					throw new Exception("Se ingreso un caracter desconocido!");
				pila.push(res);
			}
		}
		return (P) pila.peek();
	}

	public void seleccionarMetodo(int metodo) {
		switch(metodo){
		case 1:
			pila= new Arraylist<Integer>();
			break;
		case 2:
			pila= new MVector<Integer>();	
			break;
		case 3:
			pila = new SimplementeEnlazada<Integer>();
			break;
		case 4:
			pila = new DoblementeEnlazada<Integer>();
			break;
		case 5:
			pila = new Circular<Integer>();
			break;
		}
	}
	
}
