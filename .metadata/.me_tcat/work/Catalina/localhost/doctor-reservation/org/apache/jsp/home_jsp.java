package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
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
      out.write("<iframe src=\"top2.jsp\" frameborder=\"0\" marginheight=\"0\" marginwidth=\"0\" width=\"100%\" height=\"60%\" scrolling=\"no\"></iframe>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"70%\" height=\"120%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"main\">\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("<td><form action=\"DoctorAction?method=select\" method=\"post\" name=\"form1\" onSubmit=\"return checkuser()\">\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" class=\"inputTable\">\r\n");
      out.write("    <tr>\r\n");
      out.write("    \r\n");
      out.write("      <td align=\"center\"><font color=\"red\">(*输入医生姓名或者科室*)</font><input   type=\"text\" name=\"infor\"/><input type=\"submit\" value=\"点击查询\">&nbsp;&nbsp;&nbsp;<a href=\"DoctorAction?method=allDoctor\">全部医生信息</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td class=\"inputHeader\">\r\n");
      out.write("\t   <table width=\"100%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"1\" class=\"inputbox\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"15%\" align=\"center\" class=\"inputHeader\">医生姓名</td>\r\n");
      out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">科室</td>\r\n");
      out.write("           <td width=\"15%\" align=\"center\" class=\"inputContent\">专长</td>\r\n");
      out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">头衔</td>\r\n");
      out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">性别</td>\r\n");
      out.write("           <td width=\"15%\" align=\"center\" class=\"inputContent\">操作</td>        \r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /home.jsp(43,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/home.jsp(43,10) '${list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /home.jsp(43,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t     <tr>\r\n");
          out.write("           <td width=\"15%\" align=\"center\" class=\"inputHeader\"><a href=\"DoctorAction?method=infor&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.specialty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td width=\"15%\" align=\"center\" class=\"inputContent\"><a href=\"DoctorAction?method=order&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">预约</a></td>        \r\n");
          out.write("          </tr>  \r\n");
          out.write("          ");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
