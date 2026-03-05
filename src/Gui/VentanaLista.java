package Gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class VentanaLista extends JFrame {
	
	private JLabel titulo;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	
	public VentanaLista(JTextArea textArea) {
		
		setTitle("Registros de estudiantes.");
		setSize(659,366);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		this.textArea = textArea;
		initComponents();
	}
	
	private void initComponents() {
		
		titulo = new JLabel();
		titulo.setText("REGISTROS:");
		titulo.setBounds(80,20,450,25);
		titulo.setFont(new Font("Verdana", Font.BOLD, 25));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		add(titulo);
		
		textArea = new JTextArea();
		textArea.setBounds(45,50,559,272);
		add(textArea);		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(45,50,559,272);
		scrollPane.setViewportView(textArea);
		add(scrollPane);
	}
	
	public void imprimir(String texto) {
		this.textArea.setText(texto);
	}
}
