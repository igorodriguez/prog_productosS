package modelo.bean;
/**
 * 
 * @author Igor
 *
 */
public class Talla {
	
	private int id;
	private String nombre;
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Talla [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
