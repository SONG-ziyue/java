package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<link href=\"../css/z_style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"770\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"pagetop\" >\r\n");
      out.write("<tr>\r\n");
      out.write("<td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"pagetopLine\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td style=\"width: 532px; \"><img src=\"../picture/space.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"pagetop\">\r\n");
      out.write(" \r\n");
      out.write("<tr>\t\r\n");
      out.write("<td width=\"124\"></td>\r\n");
      out.write("<td align=\"right\" valign=\"top\" class=\"help\">管理员 已登录</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"25\" class=\"menuMain\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"menuMain1\"><table width=\"560\" height=\"16\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr align=\"center\">\r\n");
      out.write("                \r\n");
      out.write("                 <td width=\"81\" class=\"menuLinkbg\"><a href=\"../DoctorAction?method=doctorShow\" class=\"menuLink\" target=\"_parent\">医生信息管理</a></td>\r\n");
      out.write("               <td width=\"2\"><img src=\"../picture/menu_l.gif\" width=\"2\" height=\"23\"></td>\r\n");
      out.write("       \r\n");
      out.write("                <td width=\"85\" class=\"menuLinkbg\"><a href=\"../UserAction?method=userShow\" class=\"menuLink\" target=\"_parent\">用户信息管理</a></td>\r\n");
      out.write("                <td width=\"2\"><img src=\"../picture/menu_l.gif\" width=\"2\" height=\"23\"></td>\r\n");
      out.write("\t\t\t\t <td width=\"85\" class=\"menuLinkbg\"><a href=\"../OrderAction?method=orderShow\" class=\"menuLink\" target=\"_parent\">挂号信息管理</a></td>\r\n");
      out.write("\t\t\t\t <td width=\"2\"><img src=\"../picture/menu_l.gif\" width=\"2\" height=\"23\"></td>\r\n");
      out.write("               \r\n");
      out.write("                 <td width=\"82\" align=\"left\" class=\"menuLinkbg\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            \r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\r\n");
      out.write("  </table><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"3\" background=\"../picture/whole_line.gif\"><img src=\"../pictures/space.gif\" width=\"1\" height=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("  </table></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
