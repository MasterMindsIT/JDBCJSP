<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proveedor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Proveedor</h1>
		<form class="form" method="post" action="/proveedor">
			<input type="hidden" id="id" name="id" value="${proveedor.getId()}">
			<div class="row">
				<div class="col">
					<label for="nombre" class="form-label">Nombre:</label><input
						type="text" class="form-control" id="nombre" name="nombre"
						value="${proveedor.getNombre()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="rut" class="form-label">Rut</label><input
						type="text" class="form-control" id="rut" name="rut"
						value="${proveedor.getRut()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="direccion" class="form-label">Direccion:</label><input
						type="text" class="form-control" id="direccion" name="direccion"
						value="${proveedor.getDireccion()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="correo" class="form-label">Correo</label><input
						type="text" class="form-control" id="correo" name="correo"
						value="${proveedor.getCorreo()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="telefono" class="form-label">Teléfono:</label><input
						type="text" class="form-control" id="telefono" name="telefono"
						value="${proveedor.getTelefono()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="contacto" class="form-label">Contacto</label><input
						type="text" class="form-control" id="contacto" name="contacto"
						value="${proveedor.getContacto()}">
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="telcon" class="form-label">Teléfono Contacto:</label><input
						type="text" class="form-control" id="telcon" name="telcon"
						value="${proveedor.getTelefono_contacto()}">
				</div>
			</div>
			
			<div class="row">
				<div class="col pt-4">
					<button type="submit" class="btn btn-primary"><i class="fa-solid fa-floppy-disk"></i>Actualizar Proveedor</button>
				</div>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>

	<script src="https://kit.fontawesome.com/81a2ed02b0.js"
		crossorigin="anonymous"></script>
</body>
</html>