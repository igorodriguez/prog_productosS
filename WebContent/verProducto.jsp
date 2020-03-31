<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Producto</title>
  </head>
  <body>

	<div class="container mt-2 rounded border border-dark">
		<div class="row">
			<div class="col">
				<h1 class="text-center">${producto.nombre}</h1>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Stock</div>
			<div class="col text-center font-weight-bold">${producto.getStock()}</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Fecha compra</div>
			<div class="col text-center font-weight-bold">${producto.getFecha_compra()}</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Color</div>
			<div class="col text-center font-weight-bold">${producto.getColor()}</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Made in</div>
			<div class="col text-center font-weight-bold">${producto.getMade_in()}</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Precio</div>
			<div class="col text-center font-weight-bold">${producto.getPrecio() } Eur</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Descuento</div>
			<div class="col text-center font-weight-bold">${producto.getDescuento() }</div>
		</div>
		<br>
		<div class="row">
			<div class="col text-center font-weight-bold">Tallas</div>
			<div class="col text-center font-weight-bold">${producto.getTallas()}</div>
		</div>
		<br>
		<br>
		<div class="row">
		
			<div class="col text-center font-weight-bold">
				<a class="btn btn-secondary" href="EditarProducto?id=${producto.getId()}">Editar</a>
			</div>
			<div class="col text-center font-weight-bold">
				<a class="btn btn-danger" href="ElimnarProducto?id=${producto.getId()}">Eliminar</a>
			</div>
			    
		</div>
		<div class="row mt-3">
			<div class="col">
				<a href="VerProductos">Ver productos</a>
			</div>
			
		</div>
		<br>
	</div>
	<div class="container mt-2 pb-1 rounded border border-dark">
		<div class="row">
			<div class="col">
				<h2>Formulario de inscripcion</h2>
				<form action="InscribirUsuario" method="POST">
					<input type="hidden" value="${actividad.id }" name="idactividad">
					<select name="idusuarios">
						<option value="0"></option>
						<c:forEach items="${usuarios}" var="usuario">
							<option value="${usuario.id}">${usuario.nombreApellido} - ${usuario.codigo}</option>
						</c:forEach>
					</select>
					<input type="submit" value="Inscribir">
				</form>
			</div>
			<div class="col">
				<h2>Usuarios inscritos</h2>
				<table class="table">
					<c:forEach items="${actividad.iscripciones }" var="inscripcion">
					<tr>
						<td>${inscripcion.usuario.nombreApellido } - ${inscripcion.usuario.codigo }</td>
						<td><a class="btn btn-danger" href="EliminarInscripcion?idactividad=${actividad.id}&idusuario=${inscripcion.usuario.id}">Cancelar inscripcion</a></td>
					</tr>
					</c:forEach>
				</table>
			</div>
			
		
			
		</div>
	</div>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>