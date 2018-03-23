package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
 String context = request.getContextPath(); 
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("    <title>后台管理中心</title>  \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/pintuer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("    <script src=\"js/jquery.js\"></script>   \n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:#f2f9fd;\">\n");
      out.write("<div class=\"header bg-main\">\n");
      out.write("  <div class=\"logo margin-big-left fadein-top\">\n");
      out.write("    <h1><img src=\"images/y.jpg\" class=\"radius-circle rotate-hover\" height=\"50\" alt=\"\" />后台管理中心</h1>\n");
      out.write("  </div>\n");
      out.write("  <div class=\" margin-big-right  margin-big-top\" align=\"right\" >\n");
      out.write("  <a class=\"button button-little bg-green\" target=\"_blank\"><span class=\"icon-user\"></span>用户名:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a>\n");
      out.write("   &nbsp;&nbsp;\n");
      out.write("<!--    <a href=\"##\" class=\"button button-little bg-blue\"><span class=\"icon-wrench\"></span> 清除缓存</a> -->\n");
      out.write("    &nbsp;&nbsp;<a class=\"button button-little bg-red\" href=\"login.jsp\">\n");
      out.write("    <span class=\"icon-power-off\"></span> 退出登录</a> </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"leftnav\">\n");
      out.write("  <div class=\"leftnav-title\"><strong><span class=\"icon-list\"></span>菜单列表</strong></div>\n");
      out.write("  <h2><span class=\"icon-user\"></span>科室管理</h2>\n");
      out.write("  <ul style=\"display:block\">\n");
      out.write("   <li><a href=\"page.jsp\" target=\"right\"><span class=\"icon-caret-right\"></span>添加科室</a></li>  \n");
      out.write("  \n");
      out.write("   \n");
      out.write("    <li><a href=\"./getDepart?pageNum=1&pageSize=2\" target=\"right\"><span class=\"icon-caret-right\"></span>科室信息</a></li>   \n");
      out.write("  \n");
      out.write("  <!--   <li><a href=\"column.html\" target=\"right\"><span class=\"icon-caret-right\"></span>删除科室</a></li> -->\n");
      out.write("  </ul>   \n");
      out.write("  <h2><span class=\"icon-user\"></span>医生管理</h2>\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"./getName\" target=\"right\"><span class=\"icon-caret-right\"></span>添加医生</a></li>\n");
      out.write("  <!--   <li><a href=\"list.html\" target=\"right\"><span class=\"icon-caret-right\"></span></a></li>\n");
      out.write("    <li><a href=\"add.html\" target=\"right\"><span class=\"icon-caret-right\"></span>删除医生</a></li> -->\n");
      out.write("    <li><a href=\"./getAllDoctor?pageNum=1&pageSize=2\" target=\"right\"><span class=\"icon-caret-right\"></span>医生管理</a></li>        \n");
      out.write("  </ul>  \n");
      out.write("  <h2><span class=\"icon-pencil-square-o\"></span>缴帐管理</h2>\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"./getAllOreder?pageNum=1&pageSize=3\" target=\"right\"><span class=\"icon-caret-right\"></span>查看预约名单</a></li>\n");
      out.write("       <li><a href=\"./getCount?pageNum=1&pageSize=2\" target=\"right\"><span class=\"icon-caret-right\"></span>医生预约状态</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <h2><span class=\"icon-pencil-square-o\"></span>其他</h2>\n");
      out.write("    <ul>\n");
      out.write("   <!--   <li><a href=\"pass.html\" target=\"right\"><span class=\"icon-caret-right\"></span>修改密码</a></li> -->\n");
      out.write("    <li><a href=\"./getFeedBack?pageNum=1&pageSize=2\" target=\"right\"><span class=\"icon-caret-right\"></span>反馈管理</a></li>\n");
      out.write("      <li><a href=\"new.jsp\" target=\"right\"><span class=\"icon-caret-right\"></span>公告管理</a></li>          \n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("  $(\".leftnav h2\").click(function(){\n");
      out.write("\t  $(this).next().slideToggle(200);\t\n");
      out.write("\t  $(this).toggleClass(\"on\"); \n");
      out.write("  })\n");
      out.write("  $(\".leftnav ul li a\").click(function(){\n");
      out.write("\t    $(\"#a_leader_txt\").text($(this).text());\n");
      out.write("  \t\t$(\".leftnav ul li a\").removeClass(\"on\");\n");
      out.write("\t\t$(this).addClass(\"on\");\n");
      out.write("  })\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<ul class=\"bread\">\n");
      out.write("  <li><a href=\"./getAllNew?pageNum=1&pageSize=3\" target=\"right\" class=\"icon-home\"> 首页</a></li>\n");
      out.write("  <li><a href=\"##\" id=\"a_leader_txt\">网站信息</a></li>\n");
      out.write("  <li><b>当前语言：</b><span style=\"color:red;\">中文</php></span>\n");
      out.write(" <!--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href=\"##\">中文</a> &nbsp;&nbsp;<a href=\"##\">英文</a> </li> -->\n");
      out.write("</ul>\n");
      out.write("<div class=\"admin\">\n");
      out.write("  <iframe scrolling=\"auto\" rameborder=\"0\" src=\"./getAllNew?pageNum=1&pageSize=3\" name=\"right\" width=\"100%\" height=\"100%\"></iframe>\n");
      out.write("</div>\n");
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
