package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Order Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/bg-01.jpg') \"</div>\n");
      out.write("\n");
      out.write("            <form action=\"CreateItem\" method=\"get\">\n");
      out.write("                <h1 style=\"background-color: #ff6699;align-items: flex-start; font-size: 40px;margin-top:10px;border-radius: 10px;text-align: center;padding: 20px\" >Thông Tin Vật Phẩm </h1></br>\n");
      out.write("                \n");
      out.write("                <div width=\"700\" height=\"500\" border=\"2\" cellpaddixng=\"5\" style=\"border-radius: 10px;background-color: #ff9999;max-width: 50rem;padding:20px;margin: 10px\"></br>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Mã Món Đồ:</p><input type=\"text\" name=\"itemID\" placeholder=\"Nhập Mã Món Đồ\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Tên Món Đồ:</p><input type=\"text\" name=\"itemName\" placeholder=\"Nhập Tên Món Đồ\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Hình ảnh:</p><input type=\"file\" name=\"itemPic\" accept=\"image\" style=\"width: 700px;height: 40px;border-radius: 10px;padding-top: 5px;padding-left: 5px;margin-bottom: 10px;background-color: white\"/></br>\n");
      out.write("                        \n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Mã Khách Hàng:</p><input type=\"text\" name=\"customeID\" placeholder=\"Mã Khách Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"></br>\n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Mã Cửa Hàng:</p><input type=\"text\" name=\"storeID\" placeholder=\"Nhập Mã Cửa Hàng\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"></br>\n");
      out.write("                      \n");
      out.write("               \n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Ngày Cầm:</p><input type=\"date\" name=\"itemSendingDate\"  style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\n");
      out.write("                        <p style=\"font-size: 20px;border-radius: 10px;font-family: inherit\">Ngày Lấy:</p><input type=\"date\" name=\"itemGettingDate\" style=\"width: 700px;height: 30px;border-radius: 10px;padding: 20px\"/></br>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Tiếp\" style=\"color:green;width: 700px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px\"/>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
