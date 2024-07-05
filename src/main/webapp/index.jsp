<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de proveedores</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link
	href="//cdn.datatables.net/2.0.8/css/dataTables.dataTables.min.css"
	rel="stylesheet">
	
	
	
</head>
<body>
	<div class="container">
		<h1>Listado de proveedores</h1>
		<a href="crearproveedor.jsp" class="btn btn-primary">Nuevo proveedor</a>
		<table class="table" id="tblProveedores">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Rut</th>
					<th>Dirección</th>
					<th>Correo</th>
					<th>Teléfono</th>
					<th>Contacto</th>
					<th>Teléfono de Contacto</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${proveedores}">
					<tr>
						<th><c:out value="${p.getId()}"></c:out></th>
						<td><c:out value="${p.getNombre()}"></c:out></td>
						<td><c:out value="${p.getRut()}"></c:out></td>
						<th><c:out value="${p.getDireccion()}"></c:out></th>
						<td><c:out value="${p.getCorreo()}"></c:out></td>
						<td><c:out value="${p.getTelefono()}"></c:out></td>
						<th><c:out value="${p.getContacto()}"></c:out></th>
						<td><c:out value="${p.getTelefono_contacto()}"></c:out></td>
						<td>
							<!--<a href="${pageContext.request.contextPath}/proveedor?id=${p.getId()}" class="btn btn-secondary"><i class="fa-solid fa-pen-to-square"></i></a>-->
							<a href="${pageContext.request.contextPath}/delete?id=${p.getId()}" class="btn btn-danger"><i class="fa-solid fa-trash-can"></i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>

	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
		
	<script src="https://cdn.datatables.net/2.0.8/js/dataTables.min.js"></script>
	
	<script>
		$(document).ready(()=>{
			$('#tblProveedores').DataTable();
		})
	</script>
	
	<script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
	
</body>
</html>