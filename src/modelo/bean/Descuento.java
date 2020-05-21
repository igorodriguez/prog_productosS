package modelo.bean;
/**
 * 
 * @author Igor
 *
 */
public class Descuento {
	private int id;
	private int valor;
	private String descripcion;
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
	public int getValor() {
		return valor;
	}
/**
 * 
 * @param valor
 */
	public void setValor(int valor) {
		this.valor = valor;
	}
/**
 * 
 * @return
 */
	public String getDescripcion() {
		return descripcion;
	}
/**
 * 
 * @param descripcion
 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", valor=" + valor + ", descripcion=" + descripcion + "]";
	}

}