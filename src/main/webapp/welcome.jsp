<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido!</title>
<style>
	main{
		display:flex;	
		align-items: center;
		
		flex-direction: column;
	}
	
	.card{
		display: block;
		width: 100%;
		height: 100%;
	}
</style>
</head>
<body>
	<main>
		<div class="card">
			<h1>Bienvenido <%=request.getParameter("nombre")%></h1>
	
			<p>Nombre: <%=request.getParameter("nombre")%></p>
			<p>Contraseña: <%=request.getParameter("password")%></p>
		</div>
	</main>
	
</body>
</html>