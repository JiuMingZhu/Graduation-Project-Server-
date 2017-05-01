package servlet;

import java.io.File;
import java.io.FileOutputStream;
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
import javax.servlet.http.HttpSession;

import dao.DBManager;

@WebServlet("/ShowList_3")
public class ShowList_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowList_3() {
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
		//设置Session，禁止未登录用户访问
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("loginStatus") == null) {
			response.sendRedirect("LoginNot.jsp");
		} else {
			if (httpSession.getAttribute("loginStatus").equals("false")) {
				response.sendRedirect("LoginNot.jsp");
			} else {
				try {
					String listName = new String(request.getParameter("listName").getBytes("iso-8859-1"), "utf-8");
					System.out.println("以下是读取ShowList_3到的入参");
					System.out.println(listName);
					// 资源列表展示页面，JSP忘得差不多了，用硬编码实现
					DBManager db = new DBManager();
					db.SetPropertiesPath(
							this.getServletContext().getRealPath("").replace("\\", "/") + "WEB-INF/classes/util");
					Connection conn = null;
					Statement stmt = null;
					// TODO Auto-generated method stub
					// 生成静态的Html
					String filePath = this.getServletContext().getRealPath("").replace("\\", "/") + "List3.html";
					System.out.println("文件的路径为" + filePath);
					File file = new File(filePath);
					if (!file.exists()) {
						file.createNewFile();
					}
					FileOutputStream out = new FileOutputStream(file, false);
					StringBuffer sb = new StringBuffer();
					sb.append(
							"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
					sb.append("<html>\n");
					sb.append("<head>\n");
					sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />  \n");
					sb.append("<title>" + "三级资源列表" + "</title>\n");
					sb.append("<link rel=\"stylesheet\"\n");
					sb.append("href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\"\n");
					sb.append(
							"integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\n");
					sb.append("crossorigin=\"anonymous\">\n");
					sb.append("<link rel=\"stylesheet\"\n");
					sb.append("href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\"\n");
					sb.append(
							"integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\"\n");
					sb.append("crossorigin=\"anonymous\">\n");
					sb.append("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"\n");
					sb.append(
							"integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\n");
					sb.append("crossorigin=\"anonymous\"></script>" + "</head>" + "<body ");
					sb.append(
							"style=\"background-image: url(image/2.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover\">\n");
					sb.append("<div class=\"container-fluid\">" + "<div class=\"row-fluid\">"
							+ "<div class=\"span12\">\n");
					sb.append("<table class=\"table table-hover table-striped\">" + "<thead>" + "<tr>"
							+ "<th>资源列表</th>\n" + "</tr>\n");
					sb.append("</thead>" + "<tbody>\n");
					conn = db.getConnection();
					try {
						stmt = conn.createStatement();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// 从数据库中读取相关的信息，然后写入到html中
					conn = db.getConnection();
					try {
						stmt = conn.createStatement();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String sesql = "select sourceId,sourceName from " + listName;
					ResultSet rs = db.selectSql(stmt, sesql);
					rs = db.selectSql(stmt, sesql);
					try {
						int i = 1;
						while (rs.next()) {
							// 点击超链接提交表单，然后生成相应的二维码
							// 采用隐藏表单实现
							sb.append("<tr><td>" + "<form name=form" + i + " action=ShowList_4 method=post>"
									+ "<input type=hidden name=listName value=" + rs.getString(2) + " />"
									+ "<a href='javascript:document.form" + i + ".submit();'>" + rs.getString(2)
									+ "</a>" + "</form>" + "</td></tr>");
							i++;
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sb.append("</tbody></table></div></div></div></body></html>\n");
					out.write(sb.toString().getBytes("utf-8"));
					out.close();
					response.sendRedirect("List3.html");
				} catch (Exception e) {
					response.sendRedirect("Error.jsp");
				}
			}
		}
	}
}