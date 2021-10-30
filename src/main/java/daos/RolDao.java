package daos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import tablas.Roles;
import utils.HibernateUtil;



public class RolDao {
	
	public static Map<Integer, Roles> getRolesMap() {		
	Map<Integer, Roles> map = new HashMap<Integer, Roles>();
	
	Session s = HibernateUtil.getSessionFactory().openSession();		
	List<Roles> list = getRoles(s);
	
		if (list.size() == 0) {
		
			//map = generateDefaultProductMap();
		} else {
			map = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x));
		}
	
	return map;
	}	
	public void insertarRoles(Session miSesion, String rol) {
	// TODO Auto-generated method stub
	String nuevoRol = rol;
	Roles roles = new Roles(nuevoRol);
	miSesion.save(roles);

	}
	
	public static List<Roles> getRoles(Session s) {		
		String hQuery = " from Roles r ";
		
		List<Roles> roles =
				s.createQuery(hQuery, Roles.class)
                 .list();
		
		return roles;
	}
	public static List<Roles> getListaRoles()
	{
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Roles> list = getRoles(s);
		return list;
		
		
	}
}
