package api;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import modelo.bean.Producto;
import modelo.dao.ModeloProducto;

/**
 * Servlet implementation class ApiCrearProducto
 */
@WebServlet("/ApiCrearProducto")
public class ApiCrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCrearProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//datuak jaso 
		request.setCharacterEncoding("UTF-8"); //enieak eta ondo irakurtzeko
		String jsonProducto = request.getParameter("producto");
		Date fecha = null;
		
		String fechaString = request.getParameter("fecha_compra");
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(jsonProducto);
		JSONObject jsonObject = new JSONObject(jsonProducto);
		
		try {
			fecha = formato.parse(jsonObject.getString("fecha_compra"));
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//produktu bat sortu
		Producto producto = new Producto();
		producto.setNombre(jsonObject.getString("nombre"));
		producto.setStock(jsonObject.getInt("stock"));
		producto.setFecha_compra(fecha);
		producto.setColor(jsonObject.getString("color"));
		producto.setMade_in(jsonObject.getString("made_in"));  
		producto.setPrecio(jsonObject.getDouble("precio"));
		producto.setDescuento(jsonObject.getInt("descuento"));  
		producto.setTallas(jsonObject.getString("tallas"));
		
		//modeloa sortu
		ModeloProducto mProducto = new ModeloProducto();
		//inserta egin
		mProducto.insert(producto);
		
		try {
			mProducto.getConexion().close();
		} catch (SQLException e) {
			System.out.println("Errorea conexioa ixtean");
			e.printStackTrace();
		}
		
		response.setHeader("Access-Control-Allow-Origin","*"); //jsonp deia denean ez da behar
		response.setCharacterEncoding("UTF-8");	
		
	}

}
