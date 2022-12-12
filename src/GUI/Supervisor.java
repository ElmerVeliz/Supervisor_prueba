package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Contenedor.MySqlSupervisorDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Supervisor extends JFrame {
String estado = "";

	
	MySqlSupervisorDAO objS = new MySqlSupervisorDAO();
	Supervisor sup;
	private JPanel contentPane;
	private JLabel lblSupervisor;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDNI;
	private JLabel lblCelular;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JTextField txtCelular;
	private JButton btnNuevo;
	private JButton btnRegistrar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervisor frame = new Supervisor();
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
	public Supervisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSupervisor = new JLabel("SUPERVISOR");
		lblSupervisor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSupervisor.setBounds(218, 25, 130, 35);
		contentPane.add(lblSupervisor);
		
		lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(23, 59, 76, 35);
		contentPane.add(lblNombre);
		
		lblApellido = new JLabel("Apellido :");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(23, 126, 56, 26);
		contentPane.add(lblApellido);
		
		lblDNI = new JLabel("DNI :");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDNI.setBounds(23, 195, 66, 47);
		contentPane.add(lblDNI);
		
		lblCelular = new JLabel("Celular :");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCelular.setBounds(23, 268, 76, 53);
		contentPane.add(lblCelular);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 69, 201, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(122, 129, 201, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(122, 209, 201, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(122, 284, 201, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarCajas();
						
			}
		});
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevo.setBounds(23, 342, 130, 23);
		contentPane.add(btnNuevo);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegistrar.setBounds(181, 342, 109, 23);
		contentPane.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//System.out.print("REGISTRAR");
			int  codsuper,dnisuper,celsuper;
			String nomsuper,apesuper;
			
			nomsuper = txtNombre.getText().trim();		
			apesuper=txtApellido.getText().trim();
			
			dnisuper=Integer.parseInt(txtDNI.getText());
			celsuper=Integer.parseInt(txtCelular.getText().trim());
			//probando1
		
			//if(nomsuper.equals("")) {
				//mensaje("Campo título es obligatorio");
					//txtNombre.requestFocus();
			
			//if(nomsuper.equals("")) {mensaje("Llenar el campo del nombre"); }
			//else if(nomsuper.matches("[a-zA-Z]{5,50}")==false) {mensaje("LLenar bien el dato nombre");}
			
			//else if(apesuper.equals("")) {mensaje("Llenar el campo del apellido"); }
			//else if(apesuper.matches("[a-zA-Z]{5,50}")==false) {mensaje("LLenar bien el dato apellido");}
			
			//else if(txtDNI.getText().equals("")) {mensaje("Llenar el campo del DNI"); }
//			else if(dnisuper.matches("[1-9]{8}")==false) {mensaje("Llenar bien el dato DNI");}
//			
//			else if(celsuper.equals("")) {mensaje("Llenar el campo del Celular"); }
//			else if(celsuper.matches("[1-9]+[0-9]{8}")==false ) {mensaje("Llenar bien el dato del Celular");}
				

			
				Clase.Supervisor objA = new Clase.Supervisor();
				
				objA.setNomsuper(nomsuper);
				objA.setApesuper(apesuper);
				objA.setDnisuper(dnisuper);
				objA.setCelsuper(celsuper);	
				 //SuperDao.save(objA);
				objS.registrarsupervisor(objA);
//					if( objS.registrarsupervisor(objA) >0) {mensaje("Dato Registrado");}
//					else {mensaje("Dato no1 registrado");}			
					
				
				}
			}
							
		);
	
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(318, 342, 109, 23);
		contentPane.add(btnSalir);}
		

		
		  void mensaje(String s) {JOptionPane.showInternalMessageDialog(null, s);}
		  void LimpiarCajas() {txtNombre.setText("");
			txtApellido.setText("");
			txtDNI.setText("");
			txtCelular.setText("");}
	
	
}

