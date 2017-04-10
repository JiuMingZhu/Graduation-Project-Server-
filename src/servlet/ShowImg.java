package servlet;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="";
		String sourceId=request.getParameter("sourceId");
		System.out.println("ȡ�õ�sourceIdֵΪ��"+sourceId);
		String propertiesPath = "f:/GitHub/Graduation-Project-Server-/src/util/Ip.properties";
		String ip=GetProperties.GetValueByKey(propertiesPath, "Ip");
		System.out.println("ȡ�õ�ipֵΪ��"+ip);
		url="rtmp://"+ip+"/oflaDemo/"+sourceId+".mp4";
		String content = url;
		String imgType = "png";
		Integer version = 5;
		int pixel=5;//ģ������ֵ
		String imgPath = "F:/GitHub/Graduation-Project-Server-/WebContent/image/a.png";
		//ʵ�ֶ�ά��
		CreateImg demo = new CreateImg();
		demo.createQrcode(content, imgType, version, pixel, imgPath);
		System.out.println("��ά���������");
		response.sendRedirect("ShowImg.jsp");
	}

}
