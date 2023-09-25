package Test;
import Entidades.Empleados;
import Controllers.EmpleadosBD;
import java.util.Scanner;

//Stefano Diaz

public class TestInsertar {
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		
		EmpleadosBD ObjBD = new EmpleadosBD();
		Empleados ObjE = new Empleados();
		
		System.out.print("INGRESE APELLIDOS :"); 
		ObjE.setApellidos(tecla.nextLine());
		System.out.print("INGRESE NOMBRES :"); 
		ObjE.setNombres(tecla.nextLine());
		System.out.print("INGRESE EDAD :"); 
		ObjE.setEdad(Integer.parseInt(tecla.nextLine()));
		System.out.print("INGRESE SEXO :"); 
		ObjE.setSexo(tecla.nextLine().charAt(0));
		System.out.print("INGRESE SALARIO :"); 
		ObjE.setSalario(Integer.parseInt(tecla.nextLine()));
		
		ObjBD.Insertar(ObjE);
	}
}
