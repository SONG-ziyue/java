package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems_005fend_005fbegin.release();
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
      out.write('\n');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-navigation.jsp", out, false);
      out.write("\n");
      out.write("\t<div class=\"jumbotron\" style=\"padding: 0; background-color: #c7ddef;\">\n");
      out.write("\t\t<div class=\"container\"\n");
      out.write("\t\t\tstyle=\"float: left; padding-left: 180px; max-width: 700px\">\n");
      out.write("\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide \"\n");
      out.write("\t\t\t\tdata-ride=\"carousel\" style=\"max-width: 500px;\">\n");
      out.write("\t\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\n");
      out.write("\t\t\t\t\t\tclass=\"active\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t<div class=\"carousel-inner \" role=\"listbox\">\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/1459.JPG\" width=\"500px\" height=\"300px\"\n");
      out.write("\t\t\t\t\t\t\talt=\"...\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">123</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/1493.JPG\" width=\"500px\"\n");
      out.write("\t\t\t\t\t\t\theight=\"300px\" alt=\"...\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">456</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/279759ee3d6d55fba9755ab36c224f4a21a4ddf7.jpg\" width=\"500px\"\n");
      out.write("\t\t\t\t\t\t\theight=\"300px\" alt=\"...\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-caption\">789</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Previous</span>\n");
      out.write("\t\t\t\t</a> <a class=\"right carousel-control\" href=\"#carousel-example-generic\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-slide=\"next\"> <span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Next</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\"\n");
      out.write("\t\t\tstyle=\"background-color: #DBDBDB; width: 500px; height: 280px; float: left;\">\n");
      out.write("\t\t\t<h1>在线预约</h1>\n");
      out.write("\n");
      out.write("\t\t\t<p>...</p>\n");
      out.write("\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">马上预约</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h2>找医院</h2>\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default btn-xs bottom-right\" role=\"link\"\n");
      out.write("\t\t\t\t\t\thref=\"#\">更多 &raquo;</a></li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005faction_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h2>找科室</h2>\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">城市A</a></li>\n");
      out.write("\t\t\t\t\t<li><a class=\"btn btn-default btn-xs\" role=\"button\">更多\n");
      out.write("\t\t\t\t\t\t\t&raquo;</a></li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t\t<ul class=\"list-group col-md-2\">\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">内科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">外科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">中医科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">口腔科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">针灸科</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"list-group col-md-2 \">\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">内分泌科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">肿瘤科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">妇产科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">皮肤科</li>\n");
      out.write("\t\t\t\t\t<li class=\"list-group-item\">五官科</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr />\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t<p>@CopyRight 2016</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_005faction_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:action
    org.apache.struts2.views.jsp.ActionTag _jspx_th_s_005faction_005f0 = (org.apache.struts2.views.jsp.ActionTag) _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.get(org.apache.struts2.views.jsp.ActionTag.class);
    _jspx_th_s_005faction_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005faction_005f0.setParent(null);
    // /index.jsp(98,4) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005faction_005f0.setName("findHospital");
    // /index.jsp(98,4) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005faction_005f0.setNamespace("/");
    int _jspx_eval_s_005faction_005f0 = _jspx_th_s_005faction_005f0.doStartTag();
    if (_jspx_th_s_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.reuse(_jspx_th_s_005faction_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.reuse(_jspx_th_s_005faction_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /index.jsp(100,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("hospital");
    // /index.jsp(100,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(100,5) '${hospitals }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${hospitals }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(100,5) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setBegin(0);
    // /index.jsp(100,5) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setEnd(14);
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t<tr align=\"center\" height=\"24px\"> -->\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t</tr> -->\n");
          out.write("\t\t\t\t\t\t<ul class=\"list-group col-md-4 \">\n");
          out.write("\t\t\t\t\t\t\t<li class=\"list-group-item\"><span class=\"badge\"\n");
          out.write("\t\t\t\t\t\t\t\tstyle=\"background-color: green;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span><a\n");
          out.write("\t\t\t\t\t\t\t\thref=\"hospital.jsp?hid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\n");
          out.write("\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
