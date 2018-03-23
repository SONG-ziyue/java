package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("<title></title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/pintuer.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/pintuer.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"panel admin-panel\">\n");
      out.write("  <div class=\"panel-head\"><strong><span class=\"icon-pencil-square-o\"></span> 添加科室信息</strong></div>\n");
      out.write("  <div class=\"body-content\">\n");
      out.write("    <form method=\"post\" class=\"form-x\" action=\"addDepart\">      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"label\">\n");
      out.write("          <label>科室编号：</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <input type=\"text\" name=\"cNumber\" class=\"input\" style=\"width: 25%; float: left; value=\"\" />\n");
      out.write("          <div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"label\">\n");
      out.write("          <label>科室名字：</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("         <input type=\"text\" class=\"input\"  name=\"dName\" style=\"width: 25%; float: left; value=\"\" />\n");
      out.write("          <div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"label\">\n");
      out.write("          <label>科室描述内容：</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("         <textarea name=\"dDec\"  style=\"width: 50%; float: left; class=\"input\"></textarea>\n");
      out.write("          <div class=\"tips\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"label\">\n");
      out.write("          <label></label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"submit\"> 提交</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body></html>");
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
