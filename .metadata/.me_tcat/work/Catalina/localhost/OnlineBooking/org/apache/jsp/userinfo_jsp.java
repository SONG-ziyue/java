package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(' ');
      out.write(' ');
      out.write('\n');
session.setAttribute("user.userid", "#{user.userid}"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n");
      out.write("<title></title>\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script src=\"js/jquery_1.11.3_jquery.js\"></script>\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"css/userinfo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- top nav -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-navigation.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<!--title-->\n");
      out.write("\t<div class=\"container \">\n");
      out.write("\t\t<div class=\"page-header\" style=\"margin: 0px auto\">\n");
      out.write("\t\t\t<h2 style=\"font-weight: bold\">个人信息</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--end title-->\n");
      out.write("\n");
      out.write("\t<!--content-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<!-- left menu-->\n");
      out.write("\t\t\t<div class=\"sidebar-menu col-md-3\"\n");
      out.write("\t\t\t\tstyle=\"padding-left: 0px; padding-right: 0px\">\n");
      out.write("\t\t\t\t<div class=\"user-info-layout\"\n");
      out.write("\t\t\t\t\tstyle=\"height: 100px; background-color: #2aabd2;\">\n");
      out.write("\t\t\t\t\t<div class=\"user-img fl\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/icon/default_icon.jpg\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"user-name fl\">\n");
      out.write("\t\t\t\t\t\t<h3>188141XXXXX</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a class=\"nav-header menu-first collapsed\" data-toggle=\"collapse\"><i\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></i> 我的预约</a>\n");
      out.write("\t\t\t\t<ul id=\"orederMenu\" class=\"nav nav-list menu-second \"\n");
      out.write("\t\t\t\t\tstyle=\"height: auto;\">\n");
      out.write("\t\t\t\t\t<li id=\"not-expired-order\"><a href=\"#\"><i class=\"\"></i>\n");
      out.write("\t\t\t\t\t\t\t未过期预约</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"expired-order\"><a href=\"#\"><i class=\"\"></i> 已过期预约</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<hr />\n");
      out.write("\t\t\t\t<a class=\"nav-header menu-first collapsed\" data-toggle=\"collapse\"><i\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-user gly\"></i> 我的账户</a>\n");
      out.write("\t\t\t\t<ul id=\"userInfoMenu\" class=\"nav nav-list menu-second \"\n");
      out.write("\t\t\t\t\tstyle=\"height: auto;\">\n");
      out.write("\t\t\t\t\t<li id=\"account-setting\"><a href=\"#\"><i class=\"\"></i>\n");
      out.write("\t\t\t\t\t\t\t账户设置</a></li>\n");
      out.write("\t\t\t\t\t<li id=\"wallet\"><a href=\"#\"><i class=\"\"></i> 我的钱包</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end left menu-->\n");
      out.write("\n");
      out.write("\t\t\t<!-- right area-->\n");
      out.write("\t\t\t<div class=\"right-area col-md-9\"\n");
      out.write("\t\t\t\tstyle=\"background-color: whitesmoke;\">\n");
      out.write("\t\t\t\t<!-- 16:9 aspect ratio -->\n");
      out.write("\t\t\t\t<div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("\t\t\t\t\t<iframe id=\"iframe\" class=\"embed-responsive-item\"\n");
      out.write("\t\t\t\t\t\tsrc=\"not_expired_order.jsp\"></iframe>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end right area-->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--end content-->\n");
      out.write("\n");
      out.write("\t<!--account-->\n");
      out.write("\t<script>\n");
      out.write("    <!-- click listener about right area-->\n");
      out.write("    $(\"#not-expired-order\").click(function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#iframe\").attr('src',\"not_expired_order.jsp\");\n");
      out.write("    });\n");
      out.write("    $(\"#expired-order\").click(function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#iframe\").attr('src',\"expired_order.jsp\");\n");
      out.write("    });\n");
      out.write("    $(\"#account-setting\").click(function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#iframe\").attr('src',\"account.html\");\n");
      out.write("    });\n");
      out.write("    $(\"#wallet\").click(function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        $(\"#iframe\").attr('src',\"wallet.jsp\");\n");
      out.write("    });\n");
      out.write("</script>\n");
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
