package daos;

import java.util.List;

import tablas.Roles;
import tablas.Usuarios;
import utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.query.Query;



public class UsuarioDao {
	public boolean consultaUsuarios(Session miSesion, String name, String codigo) {
		
		Query<Usuarios> miConsulta=miSesion.createQuery("from Usuarios u where u.nombre = :name and u.clave = :codigo", Usuarios.class)
				.setParameter("name", name)
				.setParameter("codigo", codigo);
		
		
		List<Usuarios> users = miConsulta.getResultList();
		if(users.isEmpty())
		{
			return false;
		}
		else {
			return true;
		}
	
/*

		if (users.get(5).getNombre() == name && users.get(4).getClave() == codigo)
		{
			return true;
			
		}
		else {
			
			return false;
		}
		*/
		
	}
	public static String getNombreUser(Session sesion, String nombre) {
		
		Query<Usuarios> consulta=sesion.createQuery("from Usuarios u where u.nombre = :name ", Usuarios.class)
				.setParameter("name", nombre);
		
		
		List<Usuarios> users = consulta.getResultList();
		String usuario = users.get(0).getNombre();
		return usuario;
	
	}
		public static Usuarios getIdRol(Session sesiones, String nombres) {
		
		Query<Usuarios> consulta=sesiones.createQuery("from Usuarios u where u.nombre = :name ", Usuarios.class)
				.setParameter("name", nombres);
		
		
		List<Usuarios> users = consulta.getResultList();
		Usuarios user = users.get(0);
		return user;
	
	}
	/*
	public static String getNombreUsers()
	{
		Session s = HibernateUtil.getSessionFactory().openSession();		
		List<Usuarios> usuarios = getNombreUser(s);
		String usuario = usuarios.get(0).getNombre();
		return usuario;
		
		
	}*/
	public void insertarUsuario(Session miSesion, String nombre, String clave) {
		// TODO Auto-generated method stub
		String nuevoNombre = nombre;
		String nuevaContraseña = clave;
		Usuarios user = new Usuarios(nombre,clave);
		miSesion.save(user);

		}

}
