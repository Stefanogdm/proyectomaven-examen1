package Controllers;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Entidades.Empleados;

public class EmpleadosBD {
	
	EntityManagerFactory emf;
	EntityManager em;
	List<Empleados> Lista;
	
	//Stefano Diaz
	
	// Método Constructor
	public EmpleadosBD() {
		emf = Persistence.createEntityManagerFactory("JPATest");
		em = emf.createEntityManager();
	}
	
	// Método para Listar
	public List<Empleados> Listado(){
		String SQL = "SELECT e FROM Empleados e";
		Query miConsulta = em.createQuery(SQL);
		Lista = miConsulta.getResultList();
		return Lista;
	}
	
	
	// Método para insertar
	public void Insertar(Empleados ObjE) {
		try {
			em.getTransaction().begin();  //iniciar la transaccion
			em.persist(ObjE);
			em.getTransaction().commit(); // confirmar la transaccion
		} catch (Exception e) {
			em.getTransaction().rollback(); // revertir la transaccion
			System.out.println("*** ERROR:" + e.getMessage());
		}
	}
}
