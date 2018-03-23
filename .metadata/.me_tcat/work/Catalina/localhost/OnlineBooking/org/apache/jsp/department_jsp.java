package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class department_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname.release();
    _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE>\n");
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
      out.write("<!-- <link href=\"css/department.css\" type=\"text/css\" rel=\"stylesheet\"> -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- top nav -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top-navigation.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- department info-->\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- action to find all doctors by hid and depId -->\n");
      out.write("\t");
      if (_jspx_meth_s_005faction_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- doctor schedule information -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<table class=\"table table-bordered table-hover\"\n");
      out.write("\t\t\tstyle=\"table-layout: fixed\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t<colgroup>\n");
      out.write("\t\t\t\t<col width='20%'>\n");
      out.write("\t\t\t\t<col width='20%'>\n");
      out.write("\t\t\t\t<col width='15%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t\t<col width='5%'>\n");
      out.write("\t\t\t</colgroup>\n");
      out.write("\t\t\t<tr class=\"table-head\">\n");
      out.write("\t\t\t\t<th>科室专家</th>\n");
      out.write("\t\t\t\t<th>擅长</th>\n");
      out.write("\t\t\t\t<th>医生服务</th>\n");
      out.write("\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Left Align\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</th>\n");
      out.write("\t\t\t\t<th id=\"day\" data-day-offset=\"0\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"1\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"2\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"3\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"4\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"5\"></th>\n");
      out.write("\t\t\t\t<th data-day-offset=\"6\"></th>\n");
      out.write("\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Left Align\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t    <!-- set days of table  -->\n");
      out.write("\t\t\t\tfunction setOrderDate() {\n");
      out.write("\t\t\t\t\t$('.table-head').find('th').each(function() {\n");
      out.write("\t\t\t\t\t\tvar _this = $(this);\n");
      out.write("\t\t\t\t\t\tif (_this.attr('data-day-offset')) {\n");
      out.write("\t\t\t\t\t\t\tvar time=new Date();\n");
      out.write("\t\t\t\t\t\t\t//must transform _this.attr('data-day-offset') to Number type\n");
      out.write("\t\t\t\t\t\t\ttime.setDate(time.getDate()+(Number)(_this.attr('data-day-offset')));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t//month\n");
      out.write("\t\t\t\t\t\t\t\tvar month=time.getMonth()+1;\n");
      out.write("\t\t\t\t\t\t\t\tmonth=month<10?(\"0\"+month):month;//add prefix zero\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t//day\n");
      out.write("\t\t\t \t\t\t\t\tvar day=time.getDate();\n");
      out.write("\t\t\t \t\t\t\t\tday=day<10?(\"0\"+day):day;//add prefix zero\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t//day of week\n");
      out.write("\t\t\t \t\t\t\t\tvar dayOfWeek_index=time.getDay();\n");
      out.write("\t\t\t                   //(0,1,2,3,4,5,6)-->(\"周日\",\"周一\",\"周二\",\"周三\",\"周四\",\"周五\",\"周六\")\n");
      out.write("\t\t\t \t\t\t\t\tvar dayOfWeek =new Array(\"周日\",\"周一\",\"周二\",\"周三\",\"周四\",\"周五\",\"周六\");\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t_this.text(month+\"/\"+day+\" \"+dayOfWeek[dayOfWeek_index]);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\tsetOrderDate();\t\t\t\t\t\t\n");
      out.write("\t\t\t    </script>\n");
      out.write("\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"text-center\" colspan=\"12\"\n");
      out.write("\t\t\t\t\t\tstyle=\"color: #dd1144; font-size: small\"><marquee>号源更新可能会有延迟，请选择该医生具体排班日期查看实时动态！</marquee>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t\t<!-- TODO:pagination -->\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul class=\"pagination pagination-lg\">\n");
      out.write("\t\t\t\t<li><a href=\"#\" aria-label=\"Previous\"> <span\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&laquo;</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" aria-label=\"Next\"> <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<!-- Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title \" id=\"myModalLabel\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-weight: bold\">选择预约时间段</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<!-- TODO: solve action path-->\n");
      out.write("\t\t\t\t\t\t\t<form method=\"get\" class=\"form-group\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t\t\t<!--show doctor info; current date; morning or afternoon -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"order_pre_info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label id=\"docId\" class=\"hidden\"></label> <span class=\"\">医生：</span><label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"doc_name\" class=\"text-info\"></label><br /> <span>预约日期：</span><label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"visitTime\" class=\"text-info\"></label><br /> <span>挂号费：</span><label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"doc_fee\" class=\"text-info\"></label><span>元</span><br /> <span>时间：</span><label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"am_or_pm\" class=\"text-info\"></label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group-vertical \" role=\"radiogroup\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"isAM\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"\">上午</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"inlineRadioOptions\" id=\"inlineRadio1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"09:00-10:00\"> 9:00-10:00 剩余<span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"radio-period1\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"inlineRadioOptions\" id=\"inlineRadio2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"10:00-11:00\"> 10:00-11:00 剩余<span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"radio-period2\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"inlineRadioOptions\" id=\"inlineRadio3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"11:00-12:00\"> 11:00-12:00 剩余<span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"radio-period3\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr />\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"isPM\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>下午</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"radio-inline\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"inlineRadioOptions\" id=\"inlineRadio4\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"14:00-15:00\"> 14:00-15:00 剩余<span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"radio-period4\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"radio-inline\"> <input type=\"radio\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"inlineRadioOptions\" id=\"inlineRadio5\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"15:00-16:00\"> 15:00-16:00 剩余<span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"radio-period5\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"submit-order\">确定</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- script to toggle order dialog -->\n");
      out.write("\t<script>\n");
      out.write("\t\t//backdrop:static时,空白处不关闭.\n");
      out.write("\t\t//keyboard:false时,esc键盘不关闭.\n");
      out.write("\t\tvar options = {\n");
      out.write("\t\t\tbackdrop : 'static',\n");
      out.write("\t\t\tkeyboard : false\n");
      out.write("\t\t};\n");
      out.write("\t\t$(document)\n");
      out.write("\t\t\t\t.ready(\n");
      out.write("\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t$(\".order-time\")\n");
      out.write("\t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//get doctor fee\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar docId = $(this).parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\"data-doc-id\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"docId\").innerHTML = docId;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//get doctor fee\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar doc_fee = $(this).parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\"data-doc-fee\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"doc_fee\").innerHTML = doc_fee;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//get doctor name\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar doc_name = $(this).parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\"data-doc-name\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getElementById(\"doc_name\").innerHTML = doc_name;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//get am or pm\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar am_pm = $(this).parent()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.parent().attr(\"class\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getElementById(\"am_or_pm\").innerHTML = am_pm == \"am\" ? \"上午\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t: \"下午\";\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tif(am_pm==\"am\"){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#isAM\").css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#isPM\").css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif($(this).attr('t09:00-10:00')!=null){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"radio-period1\").innerHTML=$(this).attr('t09:00-10:00');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('input[id=inlineRadio1]').parent().css(\"display\",\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif($(this).attr('t10:00-11:00')!=null){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"radio-period2\").innerHTML=$(this).attr('t10:00-11:00');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('input[id=inlineRadio2]').parent().css(\"display\",\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif($(this).attr('t11:00-12:00')!=null){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"radio-period3\").innerHTML=$(this).attr('t11:00-12:00');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('input[id=inlineRadio3]').parent().css(\"display\",\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#isPM\").css(\"display\", \"block\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#isAM\").css(\"display\", \"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif($(this).attr('t14:00-15:00')!=null){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"radio-period4\").innerHTML=$(this).attr('t14:00-15:00');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('input[id=inlineRadio4]').parent().css(\"display\",\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif($(this).attr('t15:00-16:00')!=null){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"radio-period5\").innerHTML=$(this).attr('t15:00-16:00');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$('input[id=inlineRadio5]').parent().css(\"display\",\"none\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//get date\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar data_x = $(this).attr(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"data-x\");\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction getOrderDate(index) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar ths = [];\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$('.table-head')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.find('th')\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.each(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar _this = $(this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (_this\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr('data-day-offset')) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tths\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.push(_this);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn ths[index].text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar date = getOrderDate(data_x);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar fullYear = new Date().getFullYear();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdate = fullYear + \"/\" + date;\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"visitTime\").innerHTML = date;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//show modal\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#myModal\").modal(options);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write(" \t\t\t\t\t\t\t$(\"#submit-order\")\n");
      out.write(" \t\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("                                                var docId=$(\"#docId\").text();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar time = $(\".radio-inline input:radio:checked\").val();\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\tvar visitTime = $(\"#visitTime\").text()+\" \"+time;\n");
      out.write("\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t/* alert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"+docId+\"\\n\"+visitTime); */  \t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"){\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\tvar turnForm = document.createElement(\"form\");   \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t //一定要加入到body中！！   \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t document.body.appendChild(turnForm);\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t turnForm.method = 'get';\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t turnForm.action = 'confirmOrder'; \t\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t /*  turnForm.target = '_blank'; */\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t //创建隐藏表单\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\tvar userIdArea = document.createElement(\"input\");\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t    userIdArea.setAttribute(\"name\",\"userId\");\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t    userIdArea.setAttribute(\"id\",\"userId\");\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t    userIdArea.setAttribute(\"type\",\"hidden\");\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t    userIdArea.setAttribute(\"value\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t        turnForm.appendChild(userIdArea);\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t        \n");
      out.write(" \t \t\t\t\t\t\t\t\t\t\t\tvar docIdArea = document.createElement(\"input\");\n");
      out.write("\t \t \t\t\t\t\t\t\t\t\t\t\tdocIdArea.setAttribute(\"id\",\"docId\");\n");
      out.write("\t \t \t\t\t\t\t\t\t\t\t\t\tdocIdArea.setAttribute(\"name\",\"docId\");\n");
      out.write("\t \t \t\t\t\t\t\t\t\t\t\t\tdocIdArea.setAttribute(\"type\",\"hidden\");\n");
      out.write("\t \t \t\t\t\t\t\t\t\t\t\t\tdocIdArea.setAttribute(\"value\",docId);\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t        turnForm.appendChild(docIdArea);\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t        \n");
      out.write("\t \t \t\t\t\t\t\t\t\t\t\tvar visitTimeArea = document.createElement(\"input\");\n");
      out.write("\t\t \t \t\t\t\t\t\t\t\t\t\tvisitTimeArea.setAttribute(\"id\",\"visitTime\");\n");
      out.write("\t\t \t \t\t\t\t\t\t\t\t\t\tvisitTimeArea.setAttribute(\"name\",\"visitTime\");\n");
      out.write("\t\t \t \t\t\t\t\t\t\t\t\t\tvisitTimeArea.setAttribute(\"type\",\"hidden\");\n");
      out.write("\t\t \t \t\t\t\t\t\t\t\t\t\tvisitTimeArea.setAttribute(\"value\",visitTime);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        turnForm.appendChild(visitTimeArea);\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t\t        \t\t\t\t\t\t\t\t\t\t\t\t   \t\t\t\t\t\t\t\t\t\t\t\t \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t    turnForm.submit();\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t   \t\t\t\t\t\t\t\t\t\t\t\t     \t\t\t\t\t\t\t\t\t\t\t\t    \n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("                                                       //jump to login.jsp\n");
      out.write(" \t \t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t\t//hide modal\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t    $('#myModal').modal('hide');\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t\t\t\t\t\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t }); \n");
      out.write("\t\t\t\t\t\t});\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /department.jsp(26,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("department");
    // /department.jsp(26,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/department.jsp(26,1) '${departments }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${departments }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('\n');
          out.write('	');
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /department.jsp(27,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.id == param.depId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<!--jumbotron-->\n");
        out.write("\t\t\t<div class=\"container \">\n");
        out.write("\t\t\t\t<div class=\"page-header\">\n");
        out.write("\t\t\t\t\t<h3 style=\"color: #4094c7; font-weight: bold\">\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" <small style=\"color: #4094c7\">[");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department.level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("]</small>\n");
        out.write("\t\t\t\t\t</h3>\n");
        out.write("\t\t\t\t\t<h2 style=\"font-weight: bold\">\n");
        out.write("\t\t\t\t\t\t科室排班 <small style=\"color: gray; font-size: medium\">(放号时间和可预约天数，请以医院为准)</small>\n");
        out.write("\t\t\t\t\t</h2>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005faction_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:action
    org.apache.struts2.views.jsp.ActionTag _jspx_th_s_005faction_005f0 = (org.apache.struts2.views.jsp.ActionTag) _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname.get(org.apache.struts2.views.jsp.ActionTag.class);
    _jspx_th_s_005faction_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005faction_005f0.setParent(null);
    // /department.jsp(44,1) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005faction_005f0.setName("findDoctor");
    // /department.jsp(44,1) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005faction_005f0.setNamespace("/");
    int _jspx_eval_s_005faction_005f0 = _jspx_th_s_005faction_005f0.doStartTag();
    if (_jspx_eval_s_005faction_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005faction_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005faction_005f0.doInitBody();
      }
      do {
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fparam_005f0(_jspx_th_s_005faction_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_s_005fparam_005f1(_jspx_th_s_005faction_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_s_005faction_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005faction_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname.reuse(_jspx_th_s_005faction_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005faction_005fnamespace_005fname.reuse(_jspx_th_s_005faction_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005faction_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f0 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005faction_005f0);
    // /department.jsp(45,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setName("hid");
    // /department.jsp(45,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setValue("#{param.hid}");
    int _jspx_eval_s_005fparam_005f0 = _jspx_th_s_005fparam_005f0.doStartTag();
    if (_jspx_th_s_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005faction_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f1 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005faction_005f0);
    // /department.jsp(46,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f1.setName("depId");
    // /department.jsp(46,2) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f1.setValue("#{param.depId}");
    int _jspx_eval_s_005fparam_005f1 = _jspx_th_s_005fparam_005f1.doStartTag();
    if (_jspx_th_s_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /department.jsp(131,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("doctor");
    // /department.jsp(131,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/department.jsp(131,4) '${doctors }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${doctors }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t<!--TODO:delete this test string  -->\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("  \n");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"am\" data-doc-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\tdata-doc-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-doc-fee=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<td rowspan=\"2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td rowspan=\"2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.introduction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td rowspan=\"2\"></td>\n");
          out.write("\t\t\t\t\t\t<td>上午</td>\n");
          out.write("\t\t\t\t\t\t<!-- onmouseover=\"showScheduleTime('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.scheduling}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\" -->\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"0\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"1\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"2\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"3\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"4\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"5\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"6\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr class=\"pm\" data-doc-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\tdata-doc-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-doc-fee=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.fee}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<td>下午</td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"0\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"1\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"2\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"3\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"4\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"5\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td><a href=\"#\" class=\"order-time\" data-x=\"6\"></a></td>\n");
          out.write("\t\t\t\t\t\t<td></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<script>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t//compare time segment,for example: 12:90 vs 12:00\n");
          out.write("                    function compareTimeSegment(timePart){\n");
          out.write("\t\t\t\t\t\t var curTime=new Date();\n");
          out.write("\t\t\t\t\t\t var hour=curTime.getHours()<10?\"0\"+curTime.getHours():curTime.getHours();\n");
          out.write("\t\t\t\t\t\t var minute=curTime.getMinutes()<10?\"0\"+curTime.getMinutes():curTime.getMinutes();\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t var timeSeg=timePart.split(\"-\")[1];\n");
          out.write("\t\t\t\t\t\t var timeSeg_hour=timeSeg.split(\":\")[0];\n");
          out.write("\t\t\t\t\t\t var timeSeg_minute=timeSeg.split(\":\")[1];\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t return timeSeg_hour > hour;\n");
          out.write("                        }\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t//find the index of dayOfWeek\n");
          out.write("\t\t\t\t\tfunction getDayOfWeekIndex(dayOfWeek){\n");
          out.write("\t\t\t\t\t\tvar idx = 0;\n");
          out.write("\t\t\t\t\t\t$('.table-head')\n");
          out.write("\t\t\t\t\t\t\t\t.find('th')\n");
          out.write("\t\t\t\t\t\t\t\t.each(function() {\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tvar _this = $(this);\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tif(_this.attr('data-day-offset')){\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar dayValue= $(_this).text().split(\" \")[1];\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\tif (dayValue==dayOfWeek) {\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn false;//jump out all loop\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t}else{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tidx++;\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn true;//jump out current loop,enter next loop\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t\treturn idx;\n");
          out.write("\t\t\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t\t\t//set order link\n");
          out.write("\t\t\t\t\tfunction setSchedule(timePart,ticket,dayOfWeek){\n");
          out.write("\t\t\t\t\t\tconsole.log(timePart+\" \"+ticket+\" \"+dayOfWeek);\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t \n");
          out.write("\t\t\t\t\t\t//confirm timePart is am or pm\n");
          out.write("\t\t\t\t\t\tif(timePart.substr(0, 2)<=11){//am\n");
          out.write("\t\t\t\t\t\t\tconsole.log(\"timePart: am\");\n");
          out.write("\t\t\t\t\t\t\t//console.log(compareTimeSegment(timePart));\n");
          out.write("\t\t\t\t\t\t\tif(ticket>0){//has ticket\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t//TODO:add judge timePart logic on current day to decide whether is isOverdue \n");
          out.write("\t\t\t\t\t\t\t\tconsole.log(\"ticket: \"+ticket);\n");
          out.write("\t\t\t\t\t\t\t\t var data_x=getDayOfWeekIndex(dayOfWeek);\n");
          out.write("\t\t\t\t\t\t\t\t var hrefEle=$(\"tr[class='am'][data-doc-id='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("']\").find('.order-time[data-x='+data_x+']');\n");
          out.write("\t\t\t\t\t\t\t\t if(hrefEle.text().trim()==\"\"){\n");
          out.write("\t\t\t\t\t\t\t\t\t //show order link\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle.text(\"预约\");\n");
          out.write("\t\t\t\t\t\t\t\t\t }\n");
          out.write("\t\t\t\t\t\t\t\t switch(timePart){\n");
          out.write("\t\t\t\t\t\t\t\t case '09:00-10:00':\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle.attr(\"t09:00-10:00\",ticket);\n");
          out.write("\t\t\t\t\t\t\t\t\t break;\n");
          out.write("\t\t\t\t\t\t\t\t case '10:00-11:00':\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle.attr(\"t10:00-11:00\",ticket);\n");
          out.write("\t\t\t\t\t\t\t\t\t break;\n");
          out.write("\t\t\t\t\t\t\t\t case '11:00-12:00':\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle.attr(\"t11:00-12:00\",ticket);\n");
          out.write("\t\t\t\t\t\t\t\t\t break;\n");
          out.write("\t\t\t\t\t\t\t\t }\n");
          out.write("\t\t\t\t\t\t\t\t \t\t\t\t\t\t\t \t\n");
          out.write("// \t\t\t\t\t\t\t\tvar tips[0][0]+=timePart+\":剩\"+ticket+\"张票\"+\"\\r\\n\";\n");
          out.write("\t\t\t\t\t\t\t\t}else{\n");
          out.write("\t\t\t\t\t\t\t\t\t//no ticket,don't show order link\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t}else{//pm\n");
          out.write("\t\t\t\t\t\t\tconsole.log(\"timePart: pm\");\n");
          out.write("\t\t\t\t\t\t\t//console.log(compareTimeSegment(timePart));\n");
          out.write("\t\t\t\t\t\t\tif(ticket>0){//has remaining ticket\n");
          out.write("\t\t\t\t\t\t\t\tconsole.log(\"ticket: \"+ticket);\n");
          out.write("\t\t\t\t\t\t\t\tvar data_x=getDayOfWeekIndex(dayOfWeek);\n");
          out.write("\t\t\t\t\t\t\t\tvar hrefEle2=$(\"tr[class='pm'][data-doc-id='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("']\").find('.order-time[data-x='+data_x+']');\n");
          out.write("\t\t\t\t\t\t\t\tif(hrefEle2.text().trim()==\"\"){\n");
          out.write("\t\t\t\t\t\t\t\t\t//show order link\n");
          out.write("\t\t\t\t\t\t\t\t\threfEle2.text(\"预约\");\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\tswitch(timePart){\n");
          out.write("\t\t\t\t\t\t\t\t case '14:00-15:00':\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle2.attr(\"t14:00-15:00\",ticket);\n");
          out.write("\t\t\t\t\t\t\t\t\t break;\n");
          out.write("\t\t\t\t\t\t\t\t case '15:00-16:00':\n");
          out.write("\t\t\t\t\t\t\t\t\t hrefEle2.attr(\"t15:00-16:00\",ticket);\n");
          out.write("\t\t\t\t\t\t\t\t\t break;\n");
          out.write("\t\t\t\t\t\t\t\t }\n");
          out.write("// \t\t\t\t\t\t\t\threfEle2.attr(timePart+\"\",ticket+\"\");\t\n");
          out.write("// \t\t\t\t\t\t\t\t hrefEle2.attr(\"data-time-periods\",'{\"'+timePart+'\":\"'+ticket+'\"}');\t\t\t\t\t\t\t\t\t\n");
          out.write("// \t\t\t\t\t\t\t\tvar tips[1][0]+=timePart+\":剩\"+ticket+\"张票\"+\"\\r\\n\";\n");
          out.write("\t\t\t\t\t\t\t\t}else{\n");
          out.write("\t\t\t\t\t\t\t\t\t//no remaining ticket，don't show order link\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t};\n");
          out.write("\t\t\t\t\t\t};\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\tfunction showOrder(scheduling){\n");
          out.write("// \t\t\t\t\t\talert(scheduling);\n");
          out.write("\t\t\t\t \t\tvar part=scheduling.split(\",\");\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t \t\t// a array to save order tips string\n");
          out.write("\t\t\t\t        for(var i=0;i<part.length;i++){\n");
          out.write("\t\t\t\t \t\t\tvar arr=part[i].split(\" \");\n");
          out.write("\t\t\t\t \t\t\tvar dayOfWeek=arr[0];\n");
          out.write("\t\t\t\t \t\t\tvar timePart=arr[1];\n");
          out.write("\t\t\t\t\t\t\tvar ticket=arr[2];\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\tsetSchedule(timePart,ticket,dayOfWeek);\n");
          out.write("\t\t\t\t\t        }                      \n");
          out.write("\t\t\t\t \t\t};\n");
          out.write("\t\t\t \t\t\n");
          out.write("\t\t\t\t\tshowOrder('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.scheduling}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\n");
          out.write("\t\t\t\t\t</script>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /department.jsp(134,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${doctor.scheduling}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
