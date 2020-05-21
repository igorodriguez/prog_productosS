package modelo.bean;

import java.util.Date;
/**
 * 
 * @author Igor
 *
 */
public class Producto {
	
	private int id;
	private String nombre;
	private int stock;
	private Date fecha_compra;
	private String color;
	private String made_in; //Name del estado
	private Double precio;
	private int descuento;
	private String tallas; //tallas separados por coma ej.: S,L
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
	/**
	 * 
	 * @return
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/**
	 * 
	 * @return
	 */
	public Date getFecha_compra() {
		return fecha_compra;
	}
	/**
	 * 
	 * @param fecha_compra
	 */
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * 
	 * @return
	 */
	public String getMade_in() {
		return made_in;
	}
	/**
	 * 
	 * @param made_in
	 */
	public void setMade_in(String made_in) {
		this.made_in = made_in;
	}
	/**
	 * 
	 * @return
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * 
	 * @return
	 */
	public int getDescuento() {
		return descuento;
	}
	/**
	 * 
	 * @param descuento
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	/**
	 * 
	 * @return
	 */
	public String getTallas() {
		return tallas;
	}
	/**
	 * 
	 * @param tallas
	 */
	public void setTallas(String tallas) {
		this.tallas = tallas;
	}
	/**
	 * 
	 * @param tallas
	 */
	public void setTallas(String[] tallas) {
		String cadena = "";

		if(tallas!=null) {
			for (int i = 0; i < tallas.length-1; i++) {
				cadena = cadena + tallas[i]+",";
			}
			cadena = cadena + tallas[tallas.length-1];
		}

		this.tallas = cadena;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", fecha_compra=" + fecha_compra
				+ ", color=" + color + ", made_in=" + made_in + ", precio=" + precio + ", descuento=" + descuento
				+ ", tallas=" + tallas + "]";
	}
	
	
}