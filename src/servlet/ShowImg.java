package servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.GetProperties;

/**
 * Servlet implementation class ShowImg
 */
@WebServlet("/ShowImg")
public class ShowImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowImg() {
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
		String url = "";
		String sourceId = new String(request.getParameter("sourceId").getBytes("iso-8859-1"), "utf-8");
		System.out.println("取得的sourceId值为：" + sourceId);
		String sourceName = new String(request.getParameter("sourceName").getBytes("iso-8859-1"), "utf-8");
		System.out.println("取得的sourceName值为：" + sourceName);
		String propertiesPath = this.getServletContext().getRealPath("").replace("\\", "/") + "WEB-INF/classes/util"
				+ "/Ip.properties";
		String ip = GetProperties.GetValueByKey(propertiesPath, "Ip");
		System.out.println("取得的ip值为：" + ip);
		url = "rtmp://" + ip + "/oflaDemo/" + sourceId + ".mp4";
		String content = url;
		String imgType = "png";
		Integer version = 5;
		int pixel = 5;// 模块像素值
		String imgPath = this.getServletContext().getRealPath("").replace("\\", "/") + "/image/" + sourceName + ".png";
		System.out.println();
		// 实现二维码
		CreateImg demo = new CreateImg();
		demo.createQrcode(content, imgType, version, pixel, imgPath);
		System.out.println("二维码生成完毕");
		String filePath = this.getServletContext().getRealPath("").replace("\\", "/") + "ShowImg.html";
		System.out.println("ShowImg.html文件的路径为" + filePath);
		File file = new File(filePath);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream out = new FileOutputStream(file, false);
		StringBuffer sb = new StringBuffer();
		sb.append(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		sb.append("<title>欢迎使用自助教学系统</title>");
		sb.append("</head>");
		sb.append("<body "
				+ "style=\"background-image: url(image/2.jpg); background-repeat: no-repeat; background-attachment: fixed; background-size: cover\" >");
		sb.append("<div style=\"text-align:center\">");
		sb.append("<p>扫描下方二维码即可访问教学视频资源</p>");
		sb.append("</div><div style=\"text-align:center\">");
		sb.append("<img src=\"./image/" + sourceName + ".png\"/>");
		sb.append("</div>");
		sb.append("</body>");
		sb.append("</html>");
		response.sendRedirect("ShowImg.html");
		out.write(sb.toString().getBytes("utf-8"));
		out.close();
	}

}
