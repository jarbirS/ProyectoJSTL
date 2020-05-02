package mensajeJPA.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import mensajeJPA.dao.MensajeDao;

public class Prueba {
	
	public static void main(String[] args) {
		
		Usuario u= new Usuario();
		
		u.setUsuario("Lilia30");
		//u.setClave("amorsh30");
		//Mensaje m = new Mensaje();
		//m.setNombre("stewart");
		//m.setMensaje("segundo mensaje");
	//	m.setEmail("@prueba");
	//	m.setWebsite(".com");
	 //  m.setUsuario(u);
	   // System.out.println(m);
		
		MensajeDao mD = new MensajeDao();

		//mD.registrar(m);
		//System.out.println();
		mD.buscar(8);
		
		
				 }
		
	
	}
	
	

