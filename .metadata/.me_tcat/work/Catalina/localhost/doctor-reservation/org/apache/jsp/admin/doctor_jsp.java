package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class doctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>医院挂号网</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<link href=\"css/z_style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"javascript\" src=\"js/checkform.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
      out.write("<iframe src=\"admin/top.jsp\" frameborder=\"0\" marginheight=\"0\" marginwidth=\"0\" width=\"63%\" height=\"50\" scrolling=\"no\"></iframe>\r\n");
      out.write("<table width=\"100%\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" class=\"yrh\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"10\"><font size=\"4\">医生信息列表</font></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"770\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" class=\"main\">\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("<td>\r\n");
      out.write("  <table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" class=\"inputTable\">\r\n");
      out.write(" \r\n");
      out.write("    <tr>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("            <td width=\"10%\" align=\"center\" class=\"inputHeader\">姓名</td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\" class=\"inputHeader\">科室</td>\r\n");
      out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">年龄</td>\r\n");
      out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">性别</td>\r\n");
      out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">特长</td>\r\n");
      out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">地址</td>\r\n");
      out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">头衔</td>\r\n");
      out.write("\t\t\t<td width=\"20%\" align=\"center\" class=\"inputHeader\">联系方式</td>\r\n");
      out.write("            <td width=\"10%\" align=\"center\" class=\"inputContent\">操作</td>           \r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("      </table>\r\n");
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td class=\"inputTitle\"><font size=\"3\" color=\"#CC0000\">&nbsp;&nbsp;添加医生信息</font></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("      <form action=\"DoctorAction?method=addDoctor\" method=\"post\" name=\"form1\"  onSubmit=\"return teamform()\">\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" class=\"inputbox\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\">医生姓名：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"name\" onFocus=\"nextfield='password'\" maxlength=\"25\">            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           <td width=\"11%\" class=\"inputHeader\">科室：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("             <select name=\"type\">\r\n");
      out.write("<option value=\"选择\">- - - - 请选择一种科室- - - - </option>\r\n");
      out.write("           <option>妇科</option>\r\n");
      out.write("           <option>外科</option>\r\n");
      out.write("           <option>内科</option>\r\n");
      out.write("           <option>神经科</option>\r\n");
      out.write("           <option>五官科</option>\r\n");
      out.write("           <option>牙科</option>\r\n");
      out.write("           <option>整形科</option>\r\n");
      out.write("</select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\t\r\n");
      out.write("           <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           <td width=\"11%\" class=\"inputHeader\">性别：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("             <select name=\"sex\">\r\n");
      out.write("<option value=\"选择\">- - - - - - - - </option>\r\n");
      out.write("           <option>男</option>\r\n");
      out.write("           <option>女</option>\r\n");
      out.write("          >\r\n");
      out.write("</select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\t\r\n");
      out.write("          \r\n");
      out.write("           <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("           <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           <td width=\"11%\" class=\"inputHeader\">头衔：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("             <select name=\"title\">\r\n");
      out.write("<option value=\"选择\">- - - - - - - - </option>\r\n");
      out.write("           <option>医生</option>\r\n");
      out.write("           <option>主任医生</option>\r\n");
      out.write("           <option>专家</option>\r\n");
      out.write("          >\r\n");
      out.write("</select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\t\r\n");
      out.write("           <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("<tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\">联系方式：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"phone\" onFocus=\"nextfield='password'\" maxlength=\"25\">            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("<tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         \r\n");
      out.write("<tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\">地址：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"address\" onFocus=\"nextfield='password'\" maxlength=\"25\">            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("<tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\">特长：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"specialty\" onFocus=\"nextfield='password'\" maxlength=\"25\">            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("<tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>                  \r\n");
      out.write(" <tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\">年龄：</td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("              <input type=\"Text\" class=\"text width100\" name=\"age\" onFocus=\"nextfield='password'\" maxlength=\"25\">            </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;<font color=\"#CC0000\"></font></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("<tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>           \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">医生简介：</td>\r\n");
      out.write("            <td class=\"inputContent\">\r\n");
      out.write("              <textarea name=\"introduction\" rows=\"6\" cols=\"50\"></textarea>           </td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("           \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td width=\"4%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"11%\" class=\"inputHeader\"> </td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">\r\n");
      out.write("            <input type=\"submit\" class=\"bt2\" name=\"button2\" value=\"添加\">&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"Reset\" class=\"bt2\" name=\"button1\" value=\"重填\" onClick=\"clear()\"> </td>\r\n");
      out.write("            <td width=\"45%\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("         \r\n");
      out.write("         </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t   <tr>\r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            \r\n");
      out.write("            <td class=\"inputHeader\">&nbsp;</td>            \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            \r\n");
      out.write("            <td class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table>\r\n");
      out.write("        </form>\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"4%\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("            <td width=\"17%\" class=\"inputHeader\">&nbsp;</td>\r\n");
      out.write("            <td width=\"39%\" class=\"inputContent\">\r\n");
      out.write("         </td>\r\n");
      out.write("            <td width=\"40%\" class=\"inputContent\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"770\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"main\">\r\n");
      out.write("<tr valign=\"top\">\r\n");
      out.write("<td> \r\n");
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
    // /admin/doctor.jsp(44,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/doctor.jsp(44,8) '${list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /admin/doctor.jsp(44,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("list");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("         \r\n");
          out.write("            <td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.specialty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td width=\"10%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("        <td width=\"20%\" align=\"center\" class=\"inputHeader\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td width=\"10%\" align=\"center\" class=\"inputContent\"><p><a href=\"DoctorAction?method=editDoctor&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><img src=\"picture/edit.gif\" alt=\"修改\" width=\"45\" height=\"17\" border=\"0\"></a>&nbsp;&nbsp;<a href=\"DoctorAction?method=deleteDoctor&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onClick=\"window.confirm('确定删除？')\"><img src=\"picture/delete_item.gif\" alt=\"删除\" width=\"45\" height=\"17\" border=\"0\"></a></p></td>\r\n");
          out.write("            \r\n");
          out.write("        </tr>\r\n");
          out.write("        ");
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
