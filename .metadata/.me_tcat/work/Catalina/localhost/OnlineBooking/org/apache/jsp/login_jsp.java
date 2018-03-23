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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login Example</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("<link\n");
      out.write("\thref=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/alert.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div id=\"loginbox\" style=\"margin-top: 50px;\"\n");
      out.write("\t\t\tclass=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("\t\t\t<div class=\"panel panel-info\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">Sign In</div>\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; font-size: 80%; position: relative; top: -10px\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"\n");
      out.write("\t\t\t\t\t\t\tonclick=\"$('#signupbox').hide(); $('#forgetpasswordbox').show();$('#loginbox').hide()\">Forgot\n");
      out.write("\t\t\t\t\t\t\tpassword?</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div style=\"padding-top: 30px\" class=\"panel-body\">\n");
      out.write("\t\t\t\t\t<div style=\"display: none\" id=\"login-alert\"\n");
      out.write("\t\t\t\t\t\tclass=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("\t\t\t\t\t<form action=\"login\" method=\"post\" id=\"loginform\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-horizontal\" role=\"form\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"email\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-o fa-fw\"></i></span> <input id=\"email\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"email\" type=\"text\" placeholder=\"Enter Your Email\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control input-md\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"Password\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-key fa-fw\"></i></span> <input id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"password\" type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Your Password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control input-md\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"Submit\"></label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"checkbox col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<label><input id=\"login-remember\" type=\"checkbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"remember\" value=\"1\"> Remember me</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"Submit\" class=\"btn btn-success\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 control\">\n");
      out.write("\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-top: 1px solid #888; padding-top: 15px; font-size: 85%\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDon't have an account? <a href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonClick=\"$('#loginbox').hide();$('#forgetpasswordbox').hide(); $('#signupbox').show()\">Sign\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUp Here</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"signupbox\" style=\"display: none; margin-top: 50px\"\n");
      out.write("\t\t\tclass=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("\t\t\t<div class=\"panel panel-info\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">Sign Up</div>\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; font-size: 85%; position: relative; top: -10px\">\n");
      out.write("\t\t\t\t\t\t<a id=\"signinlink\"\n");
      out.write("\t\t\t\t\t\t\tonclick=\"$('#signupbox').hide(); $('#forgetpasswordbox').hide();$('#loginbox').show()\">Sign\n");
      out.write("\t\t\t\t\t\t\tIn</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t<form action=\"register\" method=\"post\" id=\"signupform\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-horizontal\" role=\"form\"\n");
      out.write("\t\t\t\t\t\tonSubmit=\"return checkForm('signUpEmail')\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"signUpEmail\" class=\"col-md-3 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"signupEmail\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"signupEmail\" placeholder=\"Email Address\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonblur=\"checkEmail(signupEmail)\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"col-md-3 control-label\">User\n");
      out.write("\t\t\t\t\t\t\t\tName</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"signupUsername\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"User Name\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"signupPassword\" class=\"col-md-3 control-label\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" id=\"signupPassword\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"signupPassword\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirmPassword\" class=\"col-md-3 control-label\">Confirm\n");
      out.write("\t\t\t\t\t\t\t\tPassword</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"confirm\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"confirm\" placeholder=\"Confirm Password\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"btn-signup\" type=\"submit\" class=\"btn btn-info\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Sign Up\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"forgetpasswordbox\" style=\"display: none; margin-top: 50px\"\n");
      out.write("\t\t\tclass=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("\t\t\t<div class=\"panel panel-info\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-title\">Forgot Password</div>\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; font-size: 85%; position: relative; top: -10px\">\n");
      out.write("\t\t\t\t\t\t<a id=\"signinlink\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\tonclick=\"$('#signupbox').hide();$('#forgetpasswordbox').hide();$('#loginbox').show()\">Sign\n");
      out.write("\t\t\t\t\t\t\tIn</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t<form action=\"forgotPassword\" method=\"post\" id=\"forgotPasswordForm\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-horizontal\" role=\"form\"\n");
      out.write("\t\t\t\t\t\tonSubmit=\"return checkForm('forgotPasswordEmail')\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-md-3 control-label\" for=\"email\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-o fa-fw\"></i></span> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"forgotPasswordEmail\" name=\"forgotPasswordEmail\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Enter Your Email\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control input-md\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonblur=\"checkForm('forgotPasswordEmail')\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"btn-sendEmail\" type=\"submit\" class=\"btn btn-success\"\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Send Email\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12 control\">\n");
      out.write("\t\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-top: 1px solid #888; padding-top: 15px; font-size: 85%\">\n");
      out.write("\t\t\t\t\t\t\t\t\tDon't have an account? <a href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonClick=\"$('#loginbox').hide(); $('#forgetpasswordbox').hide();$('#signupbox').show()\">Sign\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUp Here</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
