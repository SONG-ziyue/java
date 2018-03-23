package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>用户注册</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"javascript\" src=\"js/checkform.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<iframe src=\"top.jsp\" frameborder=\"0\" marginheight=\"0\" marginwidth=\"0\" width=\"100%\" height=\"50%\" scrolling=\"no\"></iframe>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"70%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"main\">\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("<td><form action=\"UserAction?method=register\" method=\"post\"  name=\"form1\" onSubmit=\"return checkregform()\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" class=\"inputTable\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"center\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" class=\"inputbox\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"17%\" class=\"inputHeader\">真实姓名：</td>\r\n");
      out.write("            <td width=\"38%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"truename\"  maxlength=\"25\">\r\n");
      out.write("            </td>\r\n");
      out.write("            <td width=\"41%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("                         <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\"></td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("            <font color=\"red\"></font>      \r\n");
      out.write("            </td>          \r\n");
      out.write("          </tr> \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">密码：</td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\"  name=\"number\"  maxlength=\"25\"  class=\"text width100\">\r\n");
      out.write("            </td>\r\n");
      out.write("            <td class=\"inputContent\"> <font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("                         <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\"></td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("            <font color=\"red\"></font>      \r\n");
      out.write("            </td>          \r\n");
      out.write("          </tr> \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">联系方法：</td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("              <input type=\"text\"  name=\"phone\"   maxlength=\"25\"  class=\"text width100\">\r\n");
      out.write("            </td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("                         <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\"></td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("            <font color=\"red\"></font>      \r\n");
      out.write("            </td>          \r\n");
      out.write("          </tr> \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">家庭地址：</td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("              <input type=\"text\"  name=\"address\"  maxlength=\"25\"  class=\"text width100\">\r\n");
      out.write("            </td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\"></td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("            <font color=\"red\"></font>      \r\n");
      out.write("            </td>          \r\n");
      out.write("          </tr> \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\"></td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("           <input type=\"submit\"  value=\"注册\" > \r\n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("          <input type=\"Reset\"  value=\"重填\" >\r\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("  \r\n");
      out.write("              <a href=\"index.jsp\">返回</a>\r\n");
      out.write("              \r\n");
      out.write("            </td>\r\n");
      out.write("            \r\n");
      out.write("          </tr> \r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </form>  \r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
