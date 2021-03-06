package tablas;

// default package
// Generated 27 oct 2021 18:30:09 by Hibernate Tools 5.5.7.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 * 
 */
@Entity
@Table(name = "roles")
public class Roles implements java.io.Serializable {

	private Integer id;
	private String rol;
	private Set usuarioses = new HashSet(0);
	
	
	public Roles() {
	}
	public Roles(String rol) {
		
		this.rol = rol;
	}
	@Id

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "rol")
	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Set getUsuarioses() {
		return this.usuarioses;
	}

	public void setUsuarioses(Set usuarioses) {
		this.usuarioses = usuarioses;
	}

}
