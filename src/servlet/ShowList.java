package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class ShowList
 */
@WebServlet("/ShowList")
public class ShowList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowList() {
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
		//资源列表展示页面，JSP忘得差不多了，用硬编码实现
		DBManager db = new DBManager();
		Connection conn = null;
		Statement stmt = null;
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		pw.println("<title>Sorce List</title>");
		pw.println("<link rel=\"stylesheet\"");
		pw.println("href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"");
		pw.println("integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"");
		pw.println("crossorigin=\"anonymous\">");
		pw.println("<link rel=\"stylesheet\"");
		pw.println("href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\"");
		pw.println("integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\"");
		pw.println("crossorigin=\"anonymous\">");
		pw.println("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"");
		pw.println("integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"");
		pw.println("crossorigin=\"anonymous\"></script>" + "</head>" + "<body");
		pw.println(
				"style=\"background-image: url(image/2.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover\">");
		pw.println("<div class=\"container-fluid\">" + "<div class=\"row-fluid\">" + "<div class=\"span12\">");
		pw.println("<table class=\"table table-hover table-striped\">" + "<thead>" + "<tr>" + "<th>Source List</th>"
				+ "</tr>");
		pw.println("</thead>" + "<tbody>");
		conn = db.getConnection();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sesql = "select sourceId,sourceName from source";
		ResultSet rs = db.selectSql(stmt, sesql);
		try {
			int i = 1;
			while (rs.next()) {
//				点击超链接提交表单，然后生成相应的二维码
//				采用隐藏表单实现
				pw.println("<tr><td>" + "<form name=form" + i + " action=ShowImg method=post>"
						+ "<input type=hidden name=sourceId value=" + rs.getInt(1) + " />"
						+ "<a href='javascript:document.form" + i + ".submit();'>" + rs.getString(2) + "</a>"
						+ "</form>" + "</td></tr>");
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</tbody></table></div></div></div></body></html>");
	}
}
