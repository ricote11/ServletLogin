package daos;

import java.util.List;

import org.hibernate.Session;

import tablas.Categorias;
import tablas.Roles;
import utils.HibernateUtil;

public class CategoriasDao {
	public static List<Categorias> getCategorias(Session s) {		
		String hQuery = " from Categorias r ";
		
		List<Categorias> categoria =
				s.createQuery(hQuery, Categorias.class)
                 .list();
		
		return categoria;
	}
	public static List<Categorias> getListaCategorias()
	{
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Categorias> list = getCategorias(s);
		return list;
		
		
	}
	public void insertarCategoria(Session miSesion, String nombre, String descripcion) {
		// TODO Auto-generated method stub
		String nuevoNombre = nombre;
		String nuevaDescripcion = descripcion;
		Categorias categoria = new Categorias(nuevoNombre, nuevaDescripcion);
		miSesion.save(categoria);

		}

}
