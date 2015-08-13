/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Secci�n: 10
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


/**
 * Esta es la clase <InterfazGrafica> y muestra una Interfaz
 * mas amigable con el usuario al tener un bot�n para buscar el
 * archivo deseado para realizar las operacinoes. Busca el archivo
 * y tienen otro bot�n que permite realizar el c�lculo de la operacion.
 * Por �tltimo, tiene un �rea de texto en el cual muestra el resultado
 * de la operaci�n.
 * 
 * @author Andr� Rodas
 * @author Rudy Garrido 
 * @author Yosemite Mel�ndez
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
		 * Crea los elementos de la interfaz gr�fica.
		 *El frame principal, etiquetas para nombre y 
		 *resultado, botones buscar archivo y calcular 
		 *y un �rea de texto para mostrar el resultado.
		 */
		public void initialize(){
			frame = new JFrame();
			frame.setBounds(100, 100, 622, 381);
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
			textArea.setBounds(20, 218, 378, 113);
			frame.getContentPane().add(textArea);
			
			fc = new JFileChooser();
			
			
		}
		/**
		 * Clase interna <Evento> para poder obtener el bot�n al cual se le realiza 
		 * la acci�n y asi realizar la operaci�n deseada por el usuario.
		 * Un evento en <btnSeleccionarArchivo> permite abrir el buscador de archivos
		 * Un envento en <btnCalcular> permite realizar el c�lculo de la operacion
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
				}else{
					try {
						calculadora.readFile(file.getAbsolutePath());
						textArea.setText(String.valueOf("El resultado final de su operacion es: " +calculadora.calcular()));
					} catch ( Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
}
