package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	String correctName = "jotape";
	String correctPassword = "12345";
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");		
		
		if(nombre.equals(correctName) && password.equals(correctPassword)) {
			/*response.getWriter()
			.append("<h1>Bienvenido "+nombre+"</h1>")
			.append("<hr><h2>Tus datos</h2>")
			.append("<p>Nombre: "+nombre+"<p>")
			.append("<p>Password: "+ password+"</p>");
			*/
			response.sendRedirect("./welcome.jsp?nombre="+nombre+"&password="+password);
		}else {
			/*response.getWriter().append("<h1>ERROR</h1>")
			.append("<p>Lo siento pero el nombre o las contraseña son incorrectos</p>");*/
			response.sendRedirect("./index.html");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

};