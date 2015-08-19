/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;


/**
 * Esta es la clase InterfazGrafica y muestra una Interfaz
 * mas amigable con el usuario al tener un botón para buscar el
 * archivo deseado para realizar las operacinoes. Busca el archivo
 * y tienen otro botón que permite realizar el cálculo de la operacion.
 * Por útltimo, tiene un área de texto en el cual muestra el resultado
 * de la operación.
 * 
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 */
public class InterfazGrafica {

		private JFrame frame;
		private JSlider slider;
		private JLabel label;
		private JTextField textField;
		private JFileChooser fc;
		private File file;
		private Calculadora<Integer> calculadora = new Calculadora<Integer>();
		private JButton btnSeleccionarArchivo;
		private JButton buttonCalcular;
		private JTextArea textArea;
		private JRadioButton rdbtnListaCircular;
		private JRadioButton rdbtnDoblementeEncadenada;
		private JRadioButton rdbtnListaSimple;
		private JRadioButton rdbtnArreglo;
		private JRadioButton rdbtnArraylist;
		private JRadioButton rdbtnLista;
		private int metodo=1;
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						InterfazGrafica window = new InterfazGrafica();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public InterfazGrafica(){
			initialize();
		}
		/**
		 * Crea los elementos de la interfaz gráfica.
		 *El frame principal, etiquetas para nombre y 
		 *resultado, botones buscar archivo y calcular 
		 *y un área de texto para mostrar el resultado.
		 */
		public void initialize(){
			frame = new JFrame();
			frame.setBounds(100, 100, 665, 381);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblCalculadoraPostfix = new JLabel("Calculadora Postfix");
			lblCalculadoraPostfix.setFont(new Font("Tahoma", Font.BOLD, 50));
			lblCalculadoraPostfix.setBounds(10, 11, 586, 106);
			frame.getContentPane().add(lblCalculadoraPostfix);
			
			btnSeleccionarArchivo = new JButton("Seleccionar Archivo");
			btnSeleccionarArchivo.setBounds(422, 128, 174, 23);
			btnSeleccionarArchivo.addActionListener(new Evento());
			frame.getContentPane().add(btnSeleccionarArchivo);
			
			textField = new JTextField();
			textField.setBounds(20, 128, 378, 23);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			buttonCalcular = new JButton("Calcular");
			buttonCalcular.setBounds(20, 164, 174, 23);
			buttonCalcular.addActionListener(new Evento());
			frame.getContentPane().add(buttonCalcular);
			
			JLabel lblResultados = new JLabel("Resultados:");
			lblResultados.setBounds(20, 199, 100, 21);
			frame.getContentPane().add(lblResultados);
			
			textArea = new JTextArea();
			textArea.setBounds(20, 218, 306, 113);
			frame.getContentPane().add(textArea);
			
			rdbtnLista = new JRadioButton("Lista");
			rdbtnLista.setBounds(332, 219, 109, 23);
			rdbtnLista.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnLista);
			
			rdbtnArraylist = new JRadioButton("ArrayList");
			rdbtnArraylist.setSelected(true);
			rdbtnArraylist.setBounds(332, 248, 109, 23);
			rdbtnArraylist.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnArraylist);
			
			rdbtnArreglo = new JRadioButton("Arreglo");
			rdbtnArreglo.setBounds(332, 274, 109, 23);
			rdbtnArreglo.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnArreglo);
			
			rdbtnListaSimple = new JRadioButton("Simplemente Encadenada");
			rdbtnListaSimple.setBounds(443, 219, 200, 23);
			rdbtnListaSimple.setEnabled(false);
			rdbtnListaSimple.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnListaSimple);
			
			rdbtnDoblementeEncadenada = new JRadioButton("Doblemente Encadenada");
			rdbtnDoblementeEncadenada.setBounds(443, 248, 200, 23);
			rdbtnDoblementeEncadenada.setEnabled(false);
			rdbtnDoblementeEncadenada.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnDoblementeEncadenada);
			
			rdbtnListaCircular = new JRadioButton("Lista Circular");
			rdbtnListaCircular.setBounds(443, 274, 109, 23);
			rdbtnListaCircular.setEnabled(false);
			rdbtnListaCircular.addActionListener(new Evento());
			frame.getContentPane().add(rdbtnListaCircular);
			
			fc = new JFileChooser();
			
			
		}
		/**
		 * Clase interna Evento para poder obtener el botón al cual se le realiza 
		 * la acción y asi realizar la operación deseada por el usuario.
		 * Un evento en btnSeleccionarArchivo permite abrir el buscador de archivos
		 * Un envento en btnCalcular permite realizar el cálculo de la operacion
		 *
		 */
		private class Evento implements ActionListener{


			public void actionPerformed(ActionEvent a) {
			
				if(a.getSource()==btnSeleccionarArchivo){
					int returnVal = fc.showOpenDialog(frame);
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			        	System.out.println("Seleccion");
			            file = fc.getSelectedFile();
			            textField.setText(file.getAbsolutePath());
			        } 
				}else if(a.getSource()==buttonCalcular){
					try {
						calculadora.seleccionarMetodo(metodo);
						calculadora.readFile(file.getAbsolutePath());
						textArea.setText(String.valueOf("El resultado final de su operacion es: " +calculadora.calcular()));
					} catch ( Exception e) {
						e.printStackTrace();
					}
				}else if(a.getSource()==rdbtnLista){
					metodo=3;
					/*Desactivando el resto de botones*/
					rdbtnListaSimple.setEnabled(true);
					rdbtnListaSimple.setSelected(true);
					rdbtnDoblementeEncadenada.setEnabled(true);
					rdbtnListaCircular.setEnabled(true);
					rdbtnArreglo.setSelected(false);
					rdbtnArraylist.setSelected(false);
				}else if(a.getSource()==rdbtnArreglo){
					/*Desactivando el resto de botones*/
					metodo=2;
					rdbtnArraylist.setSelected(false);
					rdbtnLista.setSelected(false);
					rdbtnListaSimple.setEnabled(false);
					rdbtnDoblementeEncadenada.setEnabled(false);
					rdbtnListaCircular.setEnabled(false);
				}else if(a.getSource()==rdbtnArraylist){
					/*Desactivando el resto de botones*/
					metodo=1;
					rdbtnArreglo.setSelected(false);
					rdbtnLista.setSelected(false);
					rdbtnListaSimple.setEnabled(false);
					rdbtnDoblementeEncadenada.setEnabled(false);
					rdbtnListaCircular.setEnabled(false);
				}else if(a.getSource()==rdbtnListaSimple){
					/*Desactivando el resto de botones*/
					metodo=3;
					rdbtnDoblementeEncadenada.setSelected(false);
					rdbtnListaCircular.setSelected(false);
				}else if(a.getSource()==rdbtnDoblementeEncadenada){
					/*Desactivando el resto de botones*/
					metodo=4;
					rdbtnListaSimple.setSelected(false);
					rdbtnListaCircular.setSelected(false);
				}else if(a.getSource()==rdbtnListaCircular){
					/*Desactivando el resto de botones*/
					metodo=5;
					rdbtnListaSimple.setSelected(false);
					rdbtnDoblementeEncadenada.setSelected(false);
				}		
			}
		}
}
