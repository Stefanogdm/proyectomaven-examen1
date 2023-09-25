package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controllers.EmpleadosBD;
import Entidades.Empleados;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class WinListado extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTable miTabla;
	private JScrollPane scrollPane;
	private String[] Columnas = {"Id","Apellidos","Nombres","Edad","Sexo","Salario"};
	private Object[][] Filas;
	private int filas = 0;
	private DefaultTableModel tabla = new DefaultTableModel();
	
	
	//Stefano Diaz
	
	private void Listar() {
		EmpleadosBD ObjBD = new EmpleadosBD();
		List<Empleados> Lista;
		Lista = ObjBD.Listado();
		// Cargar los nombres de las columnas
		for(String c : Columnas)tabla.addColumn(c);
		// Inicializar la matriz de datos
		filas = Lista.size();
		Filas = new Object[filas][5];
		for(int i = 0; i < filas; i++) {
			Filas[i][0] = Lista.get(i).getId();
			Filas[i][1] = Lista.get(i).getApellidos();
			Filas[i][2] = Lista.get(i).getNombres();
			Filas[i][3] = Lista.get(i).getEdad();
			Filas[i][4] = Lista.get(i).getSexo();
			Filas[i][5] = Lista.get(i).getSalario();
			tabla.addRow(Filas[i]);
		}		
		// Asignar toda la carga del objeto "tabla" al objeto "miTabla"
		miTabla.setModel(tabla);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinListado frame = new WinListado();
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
	public WinListado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("LISTADO DE EMPLEADOS");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setBounds(81, 0, 279, 25);
			contentPane.add(lblNewLabel);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 36, 386, 197);
			contentPane.add(scrollPane);
			{
				miTabla = new JTable();
				scrollPane.setViewportView(miTabla);
			}
		}
		Listar() ;
	}
}
