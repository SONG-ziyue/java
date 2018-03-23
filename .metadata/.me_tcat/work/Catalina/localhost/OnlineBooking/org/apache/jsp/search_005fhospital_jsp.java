package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class search_005fhospital_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/top-navigation.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems_005fend_005fbegin.release();
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
      out.write("<html lang=\"en\">\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-->\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default \" role=\"navigation\"\n");
      out.write("\tstyle=\"margin-bottom: 5px\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\n");
      out.write("\t\t\t\taria-expanded=\"false\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">J2EE</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\"\n");
      out.write("\t\t\tid=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">首页 <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"search_hospital.jsp\" target=\"_blank\">找医院</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">找科室</a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">选择城市 <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu city\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">广州</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">佛山</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">肇庆</a></li>\n");
      out.write("\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">其他</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<form class=\"navbar-form navbar-left \" role=\"search\">\n");
      out.write("\t\t\t\t<div class=\"form-group \">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control \" placeholder=\"搜索医院/科室\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">搜索</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t<!-- user login state logic-->\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right nav-login\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.navbar-collapse -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /.container-fluid -->\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--nav-sort-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<table class=\"table table-striped table-bordered \"\n");
      out.write("\t\t\tstyle=\"table-layout: fixed\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t<colgroup>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t\t<col width='10%'>\n");
      out.write("\t\t\t</colgroup>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th class=\"\">性质：</th>\n");
      out.write("\t\t\t\t\t<th class=\"\">公立医院</th>\n");
      out.write("\t\t\t\t\t<th class=\"\">私立医院</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>区域：</th>\n");
      out.write("\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>级别:</th>\n");
      out.write("\t\t\t\t\t<th>特等医院</th>\n");
      out.write("\t\t\t\t\t<th>三甲医院</th>\n");
      out.write("\t\t\t\t\t<th>三级医院</th>\n");
      out.write("\t\t\t\t\t<th>二级医院</th>\n");
      out.write("\t\t\t\t\t<th>一级医院</th>\n");
      out.write("\t\t\t\t\t<th>其他</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>类型：</th>\n");
      out.write("\t\t\t\t\t<th>血管瘤专科医院</th>\n");
      out.write("\t\t\t\t\t<th>中医医院</th>\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"overflow: hidden; white-space: nowrap; text-overflow: ellipsis;\">耳鼻咽喉专科医院</th>\n");
      out.write("\t\t\t\t\t<th>精神心理科医院</th>\n");
      out.write("\t\t\t\t\t<th>胃肠专科医院</th>\n");
      out.write("\t\t\t\t\t<th>职业病防治医院</th>\n");
      out.write("\t\t\t\t\t<th>慢性病防治医院</th>\n");
      out.write("\t\t\t\t\t<th>更多</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<ul class=\"list-group\">\n");
      out.write("\t\t\t<!--for each output-->\n");
      out.write("\t\t\t<li class=\"search_item\" id=\"search_item\">");
      if (_jspx_meth_s_005faction_005f0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul class=\"pagination\">\n");
      out.write("\t\t\t\t<li><a href=\"#\" aria-label=\"Previous\"> <span\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&laquo;</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t<li id=\"page2\"><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" aria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- TODO:pagination -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t</script>\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /top-navigation.jsp(48,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- Single dropdown for user setting -->\n");
        out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
        out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\taria-expanded=\"false\">");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<span class=\"caret\"></span></a>\n");
        out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu user-setting\">\n");
        out.write("\t\t\t\t\t\t\t\t<li ><a href=\"userinfo.jsp\">个人信息</a></li>\n");
        out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">退出登录</a></li>\n");
        out.write("\t\t\t\t\t\t\t</ul></li>\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /top-navigation.jsp(52,29) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#session.user.email");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\">登录</a></li>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005faction_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:action
    org.apache.struts2.views.jsp.ActionTag _jspx_th_s_005faction_005f0 = (org.apache.struts2.views.jsp.ActionTag) _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname_005fnobody.get(org.apache.struts2.views.jsp.ActionTag.class);
    _jspx_th_s_005faction_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005faction_005f0.setParent(null);
    // /search_hospital.jsp(85,44) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005faction_005f0.setName("findHospital");
    // /search_hospital.jsp(85,44) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /search_hospital.jsp(86,51) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("hospital");
    // /search_hospital.jsp(86,51) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/search_hospital.jsp(86,51) '${hospitals }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${hospitals }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /search_hospital.jsp(86,51) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setBegin(0);
    // /search_hospital.jsp(86,51) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setEnd(9);
    // /search_hospital.jsp(86,51) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('\n');
          out.write('\n');
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"left_img_big col-md-2\">\n");
          out.write("\t\t\t\t\t\t<a href=\"http://www.91160.com/unit/show/uid-318.html\"> <img\n");
          out.write("\t\t\t\t\t\t\toncontextmenu=\"return(false);\"\n");
          out.write("\t\t\t\t\t\t\tsrc=\"http://images.91160.com/cache/20151125/142x100/upload/2918/unit/3/unit_318.jpg\"></a>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div style=\"float: left;\">\n");
          out.write("\t\t\t\t\t\t<h2 style=\"margin-top: 0px\">\n");
          out.write("\t\t\t\t\t\t\t<a href=\"hospital.jsp?hid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a><span>[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]\n");
          out.write("\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t</h2>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"hospital_info layout\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<p>地址：");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</p>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<p>电话： ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hospital.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</p>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<hr style=\"width: 100%\" />\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
