package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <title>登录界面</title>  \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/pintuer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("    <script src=\"js/jquery.js\"></script>  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"bg\"></div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"line bouncein\">\n");
      out.write("        <div class=\"xs6 xm4 xs3-move xm4-move\">\n");
      out.write("            <div style=\"height:150px;\"></div>\n");
      out.write("            <div class=\"media media-y margin-big-bottom\">           \n");
      out.write("            </div>         \n");
      out.write("            <form action=\"index\" method=\"post\">\n");
      out.write("            <div class=\"panel loginbox\">\n");
      out.write("                <div class=\"text-center margin-big padding-big-top\"><h1>后台管理中心</h1></div>\n");
      out.write("                <div class=\"panel-body\" style=\"padding:30px; padding-bottom:10px; padding-top:10px;\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"field field-icon-right\">\n");
      out.write("                            <input type=\"text\" class=\"input input-big\" name=\"name\" placeholder=\"登录账号\" data-validate=\"required:请填写账号\" />\n");
      out.write("                            <span class=\"icon icon-user margin-small\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"field field-icon-right\">\n");
      out.write("                            <input type=\"password\" class=\"input input-big\" name=\"pwd\" placeholder=\"登录密码\" data-validate=\"required:请填写密码\" />\n");
      out.write("                            <span class=\"icon icon-key margin-small\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--  <div class=\"form-group\">\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <input type=\"text\" class=\"input input-big\" name=\"code\" placeholder=\"填写右侧的验证码\" data-validate=\"required:请填写右侧的验证码\" />\n");
      out.write("                           <img src=\"images/passcode.jpg\" alt=\"\" width=\"100\" height=\"32\" class=\"passcode\" style=\"height:43px;cursor:pointer;\" onclick=\"this.src=this.src+'?'\">  \n");
      out.write("                                                   \n");
      out.write("                        </div>\n");
      out.write("                    </div>  -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\t<label> <input type=\"checkbox\" value=\"remember-me\">\n");
      out.write("\t\t\t\t\t\tRemember me\n");
      out.write("\t\t\t\t\t\t</label>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t <label> <input type=\"radio\" name=\"status\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t管理员\n");
      out.write("\t\t\t\t\t\t</label> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t<label> <input type=\"radio\" name=\"status\" value=\"2\">\n");
      out.write("\t\t\t\t\t\t医生\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div style=\"padding:30px;\"><input type=\"submit\" class=\"button button-block bg-main text-big input-big\" value=\"登录\"></div>\n");
      out.write("            </div>\n");
      out.write("            </form>          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
