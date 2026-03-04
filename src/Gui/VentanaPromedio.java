package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Clases.ModeloDatos;
import Clases.Procesos;
import Entidades.Estudiante;

public class VentanaPromedio extends JFrame implements ActionListener{

	private JLabel etiTitulo;
	private JLabel etiNombre;
	private JLabel etiMateria;
	private JLabel etiNota1;
	private JLabel etiNota2;
	private JLabel etiNota3;
	private JLabel etiResultado;
	private JLabel etiRes;
	private JTextField textNombre;
	private JTextField textMateria;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	private JButton btnCalcular;
	private JButton btnLimpiar;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnLista;
	private JButton btnConsulta;
	private JLabel etiId;
	private JTextField textId;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private Procesos procesos;
	private ModeloDatos modeloDatos;
	
	public VentanaPromedio() {
		this.procesos = new Procesos(); //    <-------
		this.modeloDatos = new ModeloDatos();  //   <-----
		setTitle("Promedio de estudiantes");
		setSize(659,572);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		initComponents();
	}
	
	private void initComponents() {
		
		etiTitulo = new JLabel();
		etiTitulo.setText("SISTEMA CONTROL DE NOTAS");
		etiTitulo.setBounds(35,20,450,25);
		etiTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(etiTitulo);
		
		etiNombre = new JLabel();
		etiNombre.setText("Nombre: ");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiNombre.setBounds(45,70,60,20);
		add(etiNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(35);
		textNombre.setBounds(95,70,130,20);
		add(textNombre);
		
		etiMateria = new JLabel();
		etiMateria.setText("Materia: ");
		etiMateria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiMateria.setBounds(255,70,130,20);
		add(etiMateria);
		
		textMateria = new JTextField();
		textMateria.setColumns(20);
		textMateria.setBounds(300,70,120,20);
		add(textMateria);
		
		etiNota1 = new JLabel();
		etiNota1.setText("Nota #1: ");
		etiNota1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiNota1.setBounds(45,120,100,20);
		add(etiNota1);
		
		textNota1 = new JTextField();	
		textNota1.setColumns(5);
		textNota1.setBounds(97,120,50,20);
		textNota1.setText("0");
		add(textNota1);
		
		etiNota2 = new JLabel();
		etiNota2.setText("Nota #2: ");
		etiNota2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiNota2.setBounds(200,120,100,20);
		add(etiNota2);
		
		textNota2 = new JTextField();	
		textNota2.setColumns(5);
		textNota2.setBounds(252,120,50,20);
		textNota2.setText("0");
		add(textNota2);
		
		etiNota3 = new JLabel();
		etiNota3.setText("Nota #3: ");
		etiNota3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiNota3.setBounds(350,120,100,20);
		add(etiNota3);
		
		textNota3 = new JTextField();	
		textNota3.setColumns(5);
		textNota3.setBounds(402,120,50,20);
		textNota3.setText("0");
		add(textNota3);
		
		etiResultado = new JLabel();
		etiResultado.setText("Resultado: ");
		etiResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiResultado.setBounds(45,170,130,20);
		add(etiResultado);
		
		etiRes = new JLabel();
		etiRes.setText("NO HAY DATOS REGISTRADOS AUN.");
		etiRes.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiRes.setBounds(110,170,450,20);
		add(etiRes);
		
		btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBackground(Color.gray);
		btnCalcular.setBounds(45,220,85,21);
		add(btnCalcular);
		btnCalcular.addActionListener(this);
		
		btnLimpiar = new JButton();
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpiar.setBackground(Color.gray);
		btnLimpiar.setBounds(135,220,85,21);
		add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		btnConsulta = new JButton();
		btnConsulta.setText("Consultar");
		btnConsulta.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsulta.setBackground(Color.gray);
		btnConsulta.setBounds(225,220,95,21);
		add(btnConsulta);
		btnConsulta.addActionListener(this);
		
		btnLista = new JButton();
		btnLista.setText("Lista");
		btnLista.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLista.setBackground(Color.gray);
		btnLista.setBounds(325,220,85,21);
		add(btnLista);
		btnLista.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setBounds(45,250,559,272);
		add(textArea);		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(45,250,559,272);
		scrollPane.setViewportView(textArea);
		add(scrollPane);
		
		etiId = new JLabel();
		etiId.setText("I.D.: ");
		etiId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		etiId.setBounds(450,70,100,20);
		add(etiId);
		
		textId = new JTextField();
		textId.setColumns(20);
		textId.setBounds(478,70,120,20);
		add(textId);
		
		btnEliminar = new JButton();
		btnEliminar.setText("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBackground(Color.gray);
		btnEliminar.setBounds(415,220,85,21);
		add(btnEliminar);
		btnEliminar.addActionListener(this);
		
		btnActualizar = new JButton();
		btnActualizar.setText("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnActualizar.setBackground(Color.gray);
		btnActualizar.setBounds(505,220,95,21);
		add(btnActualizar);
		btnActualizar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCalcular) {
			System.out.println("Calcular");
			calcular();
		} else if(e.getSource() == btnLimpiar) {
			System.out.println("Limpiar");
			limpiar();
		} else if(e.getSource() == btnConsulta) {
			consulta();
		} else if(e.getSource() == btnLista) {
			consultarLista();
		} else if(e.getSource() == btnEliminar) {
			eliminar();
		} else if(e.getSource() == btnActualizar) {
			actualizar();
		}
		
	}
	
	private void calcular() {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(textNombre.getText());
		estudiante.setMateria(textMateria.getText());
		estudiante.setId(Integer.parseInt(textId.getText()));
		estudiante.setNota1(Double.parseDouble(textNota1.getText()));
		estudiante.setNota2(Double.parseDouble(textNota2.getText()));
		estudiante.setNota3(Double.parseDouble(textNota3.getText()));
		
		double promedio = procesos.calcularPromedio(estudiante);
		estudiante.setPromedio(promedio);
		if(estudiante.getPromedio() != -1) {
			if(procesos.aprobar(estudiante.getPromedio()) == false) {
				etiRes.setText(estudiante.getNombre() + ", su promedio es: " + estudiante.getPromedio() + "; perdió porque es menor a 3,5.");   //<-------
				etiRes.setForeground(Color.red);
			} else {
				etiRes.setText(estudiante.getNombre() + ", su promedio es: " + estudiante.getPromedio());
				etiRes.setForeground(Color.blue);
			}
			String registro = modeloDatos.registrarEstudiante(estudiante);
			if(!registro.equals("OK.")) {
				JOptionPane.showMessageDialog(null, registro, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
			}
			
		} else {
			etiRes.setText("Revise los datos, porque no pueden ser negativos ni mayores a 5.");
			etiRes.setForeground(Color.red);
		}
		System.out.println(estudiante.getNombre() + ", su promedio es: " + estudiante.getPromedio());
	}
	
	private void limpiar() {
		textNombre.setText("");
		textMateria.setText("");
		textNota1.setText("0");
		textNota2.setText("0");
		textNota3.setText("0");
		etiRes.setText("");
		textId.setText("");
		etiRes.setForeground(Color.black);
	}
	
	private void consultarLista() {
		String listaConsultada = modeloDatos.imprimirListaEstudiantes();
		textArea.setText(listaConsultada);
	}
	
	private void consulta() {
		int id =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante a consultar: "));
		Estudiante estudianteEncontrado = modeloDatos.consultaEstudiante(id);
		if(estudianteEncontrado != null) {
			textNombre.setText(estudianteEncontrado.getNombre());
			textId.setText(Integer.toString(estudianteEncontrado.getId()));
			textMateria.setText(estudianteEncontrado.getMateria());
			textNota1.setText(Double.toString(estudianteEncontrado.getNota1()));
			textNota2.setText(Double.toString(estudianteEncontrado.getNota2()));
			textNota3.setText(Double.toString(estudianteEncontrado.getNota3()));
			etiRes.setText("El promedio es: " + estudianteEncontrado.getPromedio());
		} else {
			JOptionPane.showMessageDialog(null, "No se encuentra el estudiante.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void eliminar() {
		int id =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante que quiere eleminar: "));
		String mensaje = modeloDatos.eliminarEstudiante(id);
		if(mensaje.equals("No se encontró el estudiante con ID escrito.")) {
			JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
		} else {
			limpiar();
			textArea.setText(mensaje);
		}
	}
	
	private void actualizar() {
		int id =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del estudiante que se quiere actualizar: "));
		Estudiante estudianteEncontrado = modeloDatos.consultaEstudiante(id);
		if(estudianteEncontrado != null) {
			estudianteEncontrado.setNombre(textNombre.getText());
			estudianteEncontrado.setMateria(textMateria.getText());
			estudianteEncontrado.setNota1(Double.parseDouble(textNota1.getText()));
			estudianteEncontrado.setNota2(Double.parseDouble(textNota2.getText()));
			estudianteEncontrado.setNota3(Double.parseDouble(textNota3.getText()));
			double promedio = procesos.calcularPromedio(estudianteEncontrado);
			estudianteEncontrado.setPromedio(promedio);
			if(estudianteEncontrado.getPromedio() != -1) {
				if(procesos.aprobar(estudianteEncontrado.getPromedio()) == false) {
					etiRes.setText(estudianteEncontrado.getNombre() + ", su promedio es: " + estudianteEncontrado.getPromedio() + "; perdió porque es menor a 3,5.");   //<-------
					etiRes.setForeground(Color.red);
				} else {
					etiRes.setText(estudianteEncontrado.getNombre() + ", su promedio es: " + estudianteEncontrado.getPromedio());
					etiRes.setForeground(Color.blue);
				}
				String registro = modeloDatos.actualizarEstudiante(estudianteEncontrado);
				limpiar();
				textArea.setText(registro);
				if(registro.equals("NO se pudo hacer la actualización.")) {
					JOptionPane.showMessageDialog(null, registro, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				}
				
			} else {
				etiRes.setText("Revise los datos, porque no pueden ser negativos ni mayores a 5.");
				etiRes.setForeground(Color.red);
			}
			System.out.println(estudianteEncontrado.getNombre() + ", su promedio es: " + estudianteEncontrado.getPromedio());
		
		} else {
			JOptionPane.showMessageDialog(null, "No se encuentra el estudiante.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
		}
		
	}
}
	
