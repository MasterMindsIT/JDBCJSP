package praxis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import praxis.model.dao.IProveedoresDAO;
import praxis.model.dao.ProveedoresDAOImpl;
import praxis.model.dto.ProveedoresDTO;

/**
 * Servlet implementation class ProveedorController
 */
@WebServlet("/proveedor")
public class ProveedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProveedorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//ver un solo proveedor
		String strId = request.getParameter("id");
		
		int id = 0;
		
		if (strId != null) {
			id = Integer.parseInt(strId);
		}
		
		if (id > 0) {
			IProveedoresDAO pDAO = new ProveedoresDAOImpl();
			ProveedoresDTO p = pDAO.read(id);
			
			request.setAttribute("proveedor", p);
			
			getServletContext().getRequestDispatcher("/proveedor.jsp").forward(request, response);
		}else {
			response.sendRedirect("error.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// editar un proveedor
		doGet(request, response);
	}

}
