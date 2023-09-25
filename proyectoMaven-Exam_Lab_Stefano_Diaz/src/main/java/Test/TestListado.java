package Test;
import Entidades.Empleados;
import Controllers.EmpleadosBD;
import java.util.List;

//Stefano Diaz


public class TestListado {
	public static void main(String[] args) {
		EmpleadosBD ObjBD = new EmpleadosBD();
		List<Empleados> Lista;
		Lista = ObjBD.Listado();
		
		System.out.println("--- LISTADO DE EMPLEADOS ---");
		for(Empleados ObjE : Lista)
			System.out.println("\n" + ObjE.getId() + "\t" +
					ObjE.getApellidos() + "\t" +
					ObjE.getNombres() + "\t" +
					ObjE.getEdad() + "\t" +
					ObjE.getSexo() + "\t" +
					ObjE.getSalario());
	}
}
