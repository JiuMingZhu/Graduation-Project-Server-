package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DBManager;

/**
 * Servlet implementation class Login
 * 用于用户登录
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		String userName = request.getParameter("userName");
		String userPasswd = request.getParameter("userPasswd");
		System.out.println("获取到的用户名为：" + userName);
		System.out.println("获取到的密码为：" + userPasswd);
		if (userName == null || userPasswd == null)
			response.sendRedirect("index.jsp");
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		if (conn == null)
			try {
				throw new Exception("Error when getting DB Connection");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		String sesql = "select * from USER where userName=" + "'" + userName + "'" + " and " + "userPasswd=" + "'"
				+ userPasswd + "'";
		System.out.println(sesql);
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = db.selectSql(stmt, sesql);
		try {
			if (rs.next())
				response.sendRedirect("ShowList");
			else
				response.sendRedirect("LoginError.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
