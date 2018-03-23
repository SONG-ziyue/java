package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("<title>添加医生</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/pintuer.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/pintuer.js\"></script>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/transition.js\"></script>\n");
      out.write("<script src=\"js/collapse.js\"></script>\n");
      out.write("<script src=\"js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/dropdown.js\"></script>\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        function imgPreview(fileDom) {\n");
      out.write("            //判断是否支持FileReader\n");
      out.write("            if (window.FileReader) {\n");
      out.write("                var reader = new FileReader();\n");
      out.write("            } else {\n");
      out.write("                alert(\"您的设备不支持图片预览功能，如需该功能请升级您的设备！\");\n");
      out.write("            }\n");
      out.write("            //获取文件\n");
      out.write("            var file = fileDom.files[0];\n");
      out.write("            var imageType = /^image\\//;\n");
      out.write("            //是否是图片\n");
      out.write("            if (!imageType.test(file.type)) {\n");
      out.write("                alert(\"请选择图片！\");\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            //读取完成\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                //获取图片dom\n");
      out.write("                var img = document.getElementById(\"preview\");\n");
      out.write("                //图片路径设置为读取的图片\n");
      out.write("                img.src = e.target.result;\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(file);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("\t<div class=\"panel admin-panel\">\n");
      out.write("\t\t<div class=\"panel-head\">\n");
      out.write("\t\t\t<strong><span class=\"icon-pencil-square-o\"></span> 添加医生信息</strong>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"body-content\">\n");
      out.write("\t\t\t<form method=\"post\" class=\"form-x\" action=\"addDoctor\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t<label>医生工号</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"dNumber\" style=\"width: 25%; float: left;\" class=\"input\"\n");
      out.write("\t\t\t\t\t\t\t value=\"\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t<label>医生照片</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" id=\"image\" name=\"image\" class=\"tips\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 25%; float: left;\" value=\"\" data-toggle=\"hover\"\n");
      out.write("\t\t\t\t\t\t\tdata-place=\"right\" data-image=\"\"onchange=\"imgPreview(this)\" /> \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t<label>医生姓名：</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\"  style=\"width: 25%; float: left;\" class=\"input\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t<label>初始密码：</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"dPwd\" style=\"width: 25%; float: left;\" class=\"input\"\n");
      out.write("\t\t\t\t\t\t\t value=\"\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t<label>所属科室：</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<select name=\"cNumber\"  class=\"input w50\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t<label>医生描述：</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"input\" name=\"dInfo\" style=\"width: 50%; float: left value=\"\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tips\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t<label>职称：</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input\" name=\"dResume\"  style=\"width: 25%; float: left; value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t<label>联系方式：</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"dTel\" class=\"input\" style=\"width: 25%; float: left;  value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t\t\t\t\t<label>email：</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input\" name=\"dEmail\" style=\"width: 25%; float: left; value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tipss\"><font color=\"red\">*必填项</font></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"field\" align=\"center\">\n");
      out.write("\t\t\t\t\t\t<button class=\"button bg-main icon-check-square-o\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t提交</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /info.jsp(114,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/info.jsp(114,8) '${department}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${department}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /info.jsp(114,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("department");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.cNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.dName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t");
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
