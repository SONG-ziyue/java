package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>医院网上挂号系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"javascript\" src=\"js/checkform.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<iframe src=\"top.jsp\" frameborder=\"0\" marginheight=\"0\" marginwidth=\"0\" width=\"100%\" height=\"50%\" scrolling=\"no\"></iframe>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"70%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"main\">\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("<td><form action=\"UserAction?method=login\" method=\"post\" name=\"form1\" onSubmit=\"return checkloginform()\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"inputTable\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    \r\n");
      out.write("      <td align=\"center\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td class=\"inputHeader\">\r\n");
      out.write("\t   <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"inputbox\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"7%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"25%\" align=\"center\" class=\"inputHeader\">真实姓名：</td>\r\n");
      out.write("            <td width=\"23%\" align=\"center\" class=\"inputContent\"><input type=\"Text\" class=\"text width100\" name=\"username\" onFocus=\"nextfield='name'\" value=\"\" maxlength=\"25\"></td>\r\n");
      out.write("            <td width=\"25%\" align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            <td width=\"20%\" align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t       <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td align=\"center\" class=\"inputContent\"><font color=\"red\"></font>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\"><label></label></td>\r\n");
      out.write("            <td align=\"center\" class=\"inputHeader\">密码：</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\"><input type=\"password\" class=\"text width100\" name=\"password\"  maxlength=\"25\"></td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td align=\"center\" class=\"inputContent\"><font color=\"red\"></font>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">\r\n");
      out.write("             <input type=\"submit\"  value=\"登录\">\t&nbsp;&nbsp;            &nbsp;&nbsp;\r\n");
      out.write("             <input type=\"Reset\"  value=\"重填\">\r\n");
      out.write("\r\n");
      out.write("           \t\t</td>\r\n");
      out.write("            <td class=\"inputContent\"><a href=\"UserAction?method=register\">注册</a></td>\r\n");
      out.write("            <td align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td colspan=\"2\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td colspan=\"3\" align=\"center\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("\t  </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("  </table>\r\n");
      out.write("  </form>  \r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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
