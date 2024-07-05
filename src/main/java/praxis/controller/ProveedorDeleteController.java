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
 * Servlet implementation class ProveedorDeleteController
 */
@WebServlet("/delete")
public class ProveedorDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProveedorDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String strId = request.getParameter("id");
		
		int id = 0;
		
		if (strId != null) {
			id = Integer.parseInt(strId);
		}
		
		if (id > 0) {
			IProveedoresDAO pDAO = new ProveedoresDAOImpl();
			String res =  pDAO.delete(id);
			getServletContext().getRequestDispatcher("/proveedores").forward(request, response);
		}else {
			response.sendRedirect("error.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
