package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;
	private JButton btnS1;
	private JButton btnS2;
	private JButton btnS3;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(56, 30, 99, 23);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número:");
			lblNewLabel_1.setBounds(56, 62, 130, 23);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número (opcional):");
			lblNewLabel_2.setBounds(56, 94, 147, 28);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtn1 = new JTextField();
			txtn1.setBounds(213, 31, 86, 20);
			contentPane.add(txtn1);
			txtn1.setColumns(10);
		}
		{
			txtn2 = new JTextField();
			txtn2.setColumns(10);
			txtn2.setBounds(213, 63, 86, 20);
			contentPane.add(txtn2);
		}
		{
			txtn3 = new JTextField();
			txtn3.setColumns(10);
			txtn3.setBounds(213, 98, 86, 20);
			contentPane.add(txtn3);
		}
		{
			btnS1 = new JButton("Sumar 2 enteros");
			btnS1.addActionListener(this);
			btnS1.setBounds(104, 133, 152, 23);
			contentPane.add(btnS1);
		}
		{
			btnS2 = new JButton("Sumar 3 enteros");
			btnS2.addActionListener(this);
			btnS2.setBounds(104, 166, 152, 23);
			contentPane.add(btnS2);
		}
		{
			btnS3 = new JButton("Sumar 2 reales");
			btnS3.addActionListener(this);
			btnS3.setBounds(104, 200, 152, 23);
			contentPane.add(btnS3);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(41, 238, 272, 118);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Verificando");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnS3) {
			do_btnS3_actionPerformed(e);
		}
		if (e.getSource() == btnS2) {
			do_btnS2_actionPerformed(e);
		}
		if (e.getSource() == btnS1) {
			do_btnS1_actionPerformed(e);
		}
	}
	protected void do_btnS1_actionPerformed(ActionEvent e) {
		try 
		{
			int n1=Integer.parseInt(txtn1.getText());
			int n2=Integer.parseInt(txtn2.getText());
			
			Calculadora c = new Calculadora(n1,n2);
			txtS.append("La suma de 2 enteros es: "+c.Sumar(n1, n2)+"\n");
		} catch(Exception e2)
		{
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
	}
	protected void do_btnS2_actionPerformed(ActionEvent e) {
		try 
		{
		int n1=Integer.parseInt(txtn1.getText());
		int n2=Integer.parseInt(txtn2.getText());
		int n3=Integer.parseInt(txtn3.getText());
		
		Calculadora c = new Calculadora(n1,n2);
		txtS.append("La suma de 3 enteros es: "+c.Sumar(n1, n2, n3)+"\n");
		} catch(Exception e2)
		{
			JOptionPane.showMessageDialog(this,  "Ingrese números enteros");
		}
	}
	
	
	protected void do_btnS3_actionPerformed(ActionEvent e) {
		try {
		double num1=Double.parseDouble(txtn1.getText());
		double num2=Double.parseDouble(txtn2.getText());
		
		Calculadora c = new Calculadora(num1,num2);
		txtS.append("La suma de 2 reales es: "+c.Sumar(num1,num2)+"\n");
		} catch(Exception e2)
		{
			JOptionPane.showMessageDialog(this,  "Ingrese números reales");
		}	
	}
}
