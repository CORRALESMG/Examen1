package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtusuario;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setTitle("Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(20, 26, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(20, 102, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		txtusuario = new JTextField();
		txtusuario.setBounds(124, 63, 115, 20);
		contentPane.add(txtusuario);
		txtusuario.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(124, 135, 115, 20);
		contentPane.add(txtContraseña);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Usuario = txtusuario.getText();
				String Contraseña = txtContraseña.getText();
				
				if (Usuario.isEmpty()||	Contraseña.isEmpty()){
					JOptionPane.showMessageDialog(null, "Campo Vacio");
				}
				else {
					if(Usuario.equals("Admin")|| Contraseña.equals("12345")) {
						JOptionPane.showMessageDialog(null,"Es correcto ");
					}
					
					else{
						JOptionPane.showMessageDialog(null,"Es correcto ");
					}
				}
			}
		});
		btnNewButton.setBounds(124, 205, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(294, 205, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
