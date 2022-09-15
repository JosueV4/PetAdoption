
package servlets;
        
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import controller.UsuarioController;

	@WebServlet("/ServletUsuarioRegister")
	public class ServletUsuarioRegister extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public ServletUsuarioRegister() {
			super();
			// TODO Auto-generated constructor stub
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			UsuarioController usuario = new UsuarioController();
			
			String username = request.getParameter("username");
			String contrasena = request.getParameter("contrasena");
			String nombre = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
                        String ciudad = request.getParameter("ciudad"); 
			String email = request.getParameter("email");
			double petcoin = Double.parseDouble(request.getParameter("petcoin"));
			boolean contribuyente = Boolean.parseBoolean(request.getParameter("contribuyente"));
			
			String result = usuario.register(username, contrasena, nombre, apellidos, email, petcoin, contribuyente);
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(result);
			out.flush();
			out.close();
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}