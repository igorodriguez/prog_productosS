package modelo.bean;
/**
 * 
 * @author Igor
 *
 */
public class Estado {
	
	private int id;
	private String name;
	private String continent;
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
	public String getName() {
		return name;
	}
/**
 * 	
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * 	
 * @return
 */
	public String getContinent() {
		return continent;
	}
/**
 * 	
 * @param continent
 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return "Estado [id=" + id + ", name=" + name + ", continent=" + continent + "]";
	}
	
	
	
}