package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MyPack.CaptchaGenerator;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/MasterPage/Header.jsp");
    _jspx_dependants.add("/MasterPage/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/hover-min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("            }\n");
      out.write("            .top\n");
      out.write("            {\n");
      out.write("                background-image: url('images/header.png');\n");
      out.write("            }\n");
      out.write("            .topl\n");
      out.write("            {\n");
      out.write("                min-height: 70px;\n");
      out.write("            }\n");
      out.write("            .topr\n");
      out.write("            {\n");
      out.write("                min-height: 70px;\n");
      out.write("                font-family: cursive;\n");
      out.write("                text-shadow:3px 2px 3px black;\n");
      out.write("                font-size:40px;\n");
      out.write("                color: blueviolet;\n");
      out.write("                margin-top: 15px;\n");
      out.write("            }\n");
      out.write("            .head\n");
      out.write("            {\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            #SignUp\n");
      out.write("            {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("$(\"#pToggle\").click(function(){\n");
      out.write("var eye=$(\"#pToggle\").text();\n");
      out.write("//alert(eye);\n");
      out.write("if(eye===\" \")\n");
      out.write("{\n");
      out.write("$(\"#inputPassword\").prop(\"type\",\"text\");\n");
      out.write("$(\"#pToggle\").html(\"<span class='glyphicon glyphicon-eye-close'></span>\");\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("$(\"#inputPassword\").prop(\"type\",\"password\");\n");
      out.write("$(\"#pToggle\").html(\"<span class='glyphicon glyphicon-eye-open'> </span>\");\n");
      out.write("}\n");
      out.write("});\n");
      out.write("$(\"#signup\").click(function(){\n");
      out.write("    $(\"#SignIn\").css(\"display\",\"none\");\n");
      out.write("    $(\"#SignUp\").css(\"display\",\"block\");\n");
      out.write("});\n");
      out.write("$(\"#signin\").click(function(){\n");
      out.write("    $(\"#SignUp\").css(\"display\",\"none\");\n");
      out.write("    $(\"#SignIn\").css(\"display\",\"block\");\n");
      out.write("});\n");
      out.write("});\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("         <div class=\"row top\">\n");
      out.write("                <div class=\"col-sm-3 topl\">\n");
      out.write("                    <img src=\"images/logo.png\" style=\"height: 90px;\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 topr\">\n");
      out.write("                    Traveller.com\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"row\" style=\"margin-bottom: -20px;\">\n");
      out.write("                 <nav class=\"navbar navbar-default\" style=\"background-image: url('images/nav-primary.png');font-size: 16px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("        <a href=\"index.jsp\" class=\"navbar-brand head\">Traveller</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"about.jsp\">About us <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("        <li><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("        <li><a href=\"enquirey.jsp\">Enquiry</a></li>\n");
      out.write("        <li><a href=\"gallery.jsp\">Gallery</a></li>\n");
      out.write("        <li><a data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor:pointer;\">Login</a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control search\" style=\"color: buttontext;background-color: lightgrey;box-shadow: 1px 2px 3px grey inset;\"placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("                </div>\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" style=\"padding-right: 0px;\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div id=\"SignIn\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h2 class=\"modal-title\" id=\"myModalLabel\" style=\"text-align: center;font-weight: bold;font-family: cursive;color: darkblue;text-shadow:2px 2px 3px darkslategrey;\">Login Form</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("              <label for=\"inputEmail\">Email address</label>\n");
      out.write("        <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("      </div>\n");
      out.write("<br/>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"control-label\">Password</label>\n");
      out.write("  <div class=\"input-group\">\n");
      out.write("\t<input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required aria-describedby=\"pToggle\"/>\n");
      out.write("\t<span id=\"pToggle\" class=\"input-group-addon\" aria-hidden=\"true\"><span class=\"glyphicon glyphicon-eye-open\"> </span></span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      <div class=\"checkbox\">\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\"> Remember me\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-8\" style=\"margin:0px 0px 30px 30px;\"><a href=\"forgetpasswod.html\">Forget Password ?</a></div>\n");
      out.write("            <div class=\"col-sm-2\" style=\"margin-bottom: 30px;text-align: right;\"><a href=\"loginhelp.html\">Help ?</a></div>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" id=\"signup\">Sign Up</button>\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"SignUp\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h2 class=\"modal-title\" id=\"myModalLabel1\" style=\"text-align: center;font-weight: bold;font-family: cursive;color: darkblue;text-shadow:2px 2px 3px darkslategrey;\">Sign Up Form</h2>\n");
      out.write("      </div>\n");
      out.write("            <form action=\"codeSignUp\" method=\"post\">\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("              <label>Name</label>\n");
      out.write("        <input type=\"text\" name=\"fname\" class=\"form-control\" placeholder=\"Full Name\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <br/>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"inputEmail\">Email</label>\n");
      out.write("            <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"example@email.com\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <br/>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label>Mobile Number</label>\n");
      out.write("            <input type=\"number\" name=\"mobile\" class=\"form-control\" placeholder=\"Mobile Number\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <br/>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label>User Name</label>\n");
      out.write("            <input type=\"text\" name=\"userName\" class=\"form-control\" placeholder=\"Create an User Name\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <br/>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label>Create Password</label>\n");
      out.write("        <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Create Password\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <br/>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label>Confirm Password</label>\n");
      out.write("        <input type=\"password\" name=\"cpassword\" class=\"form-control\" placeholder=\"Confirm Password\" required=\"true\"/>\n");
      out.write("      </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("              <input type=\"checkbox\" name=\"staysignin\" required=\"true\"/><label>Stay Sign In</label>\n");
      out.write("          <input type=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Sign Up\"/>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("            </form>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" id=\"signin\">Login</button>\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/hover-min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url('images/reg.jpg');\n");
      out.write("                background-size:     cover;\n");
      out.write("                background-repeat:   no-repeat;\n");
      out.write("                background-position: bottom center; \n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("            .time\n");
      out.write("            {\n");
      out.write("                margin: 15px 0px 0px -15px;\n");
      out.write("                color:  whitesmoke;\n");
      out.write("                padding: 10px;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1000;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #time\n");
      out.write("            {\n");
      out.write("                 font-family: cursiv;\n");
      out.write("                 font-size: 30px;\n");
      out.write("                 text-align: center;\n");
      out.write("                 text-shadow: 0px 0px 10px blueviolet;\n");
      out.write("            }\n");
      out.write("            #date \n");
      out.write("            {\n");
      out.write("                font-family: 'Eczar', serif;\n");
      out.write("                font-size: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-shadow: 0px 0px 10px blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            window.setInterval(ut, 1000);\n");
      out.write("\n");
      out.write("            function ut() {\n");
      out.write("            var d = new Date();\n");
      out.write("            document.getElementById(\"time\").innerHTML = d.toLocaleTimeString();\n");
      out.write("            document.getElementById(\"date\").innerHTML = d.toLocaleDateString();\n");
      out.write("            }\n");
      out.write("       </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("     <div class=\"time\">\n");
      out.write("     <p id=\"time\"></p>\n");
      out.write("     <p id=\"date\"></p>\n");
      out.write("     </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("  <div class=\"modal-dialog modal-lg hvr-curl-top-left\">\n");
      out.write("      <div class=\"modal-content\" style=\"padding: 20px;\">\n");
      out.write("          <h2 style=\"margin-top: 0px;font-family: cursive;color: blueviolet; text-align: center;font-weight: bold;\">Registration Form</h2>\n");
      out.write("          <hr style=\"margin-bottom: 0px;\"/>\n");
      out.write("          <form action=\"RegistrationCode\" method=\"post\" enctype=\"mulipart/form-data\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <h4>Name</h4>\n");
      out.write("                <input type=\"text\" placeholder=\"Full Name\" name=\"name\" class=\"form-control focus input-group-lg\"/>\n");
      out.write("                <h4>Father's Name</h4>\n");
      out.write("                <input type=\"text\" placeholder=\"Father's Name\" name=\"fname\" class=\"form-control focus\"/>\n");
      out.write("                <h4>Date of Birth</h4>\n");
      out.write("                <input type=\"date\" name=\"dob\" class=\"form-control focus input-group-lg\"/>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                <h4>\n");
      out.write("                    Gender  :\n");
      out.write("                </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h4><input type=\"radio\" name=\"gender\" class=\"focus\" style=\"height:15px;width:15px;\" value=\"Male\" />&nbsp;Male</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h4><input type=\"radio\" name=\"gender\" class=\"focus\" style=\"height:15px;width:15px;\" value=\"Female\" />&nbsp;Female</h4>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"col-sm-3\"></div>\n");
      out.write("                </div>\n");
      out.write("                <h4>Mobile No </h4>\n");
      out.write("                    <input type=\"number\" name=\"mobile\" value=\"\" class=\"form-control focus\" placeholder=\"Mobile Number\"/>\n");
      out.write("                    ");

                        CaptchaGenerator cg=new CaptchaGenerator();
                        String code=cg.GetCaptchaCode();
                    
      out.write("\n");
      out.write("                    <h4>\n");
      out.write("                        Enter Captcha Code:<span style=\"font-size: 22px;text-align:right; \">");
      out.print(code);
      out.write("</span>\n");
      out.write("                    </h4>\n");
      out.write("                    <input type=\"hidden\" name=\"mCaptcha\" value=\"");
      out.print(code);
      out.write("\"/>\n");
      out.write("                    <input type=\"text\" name=\"captcha\" class=\"form-control focus\"/>\n");
      out.write("                    <h4>Email Address</h4>\n");
      out.write("                    <input type=\"email\" name=\"email\" value=\"\" class=\"form-control focus\" placeholder=\"Email Address\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <h4>Select City</h4>\n");
      out.write("                <select class=\"form-control focus\" name=\"city\">\n");
      out.write("                    <option selected=\"selected\">-Select City-</option>\n");
      out.write("                </select>\n");
      out.write("                <h4>\n");
      out.write("                Address :\n");
      out.write("                </h4>\n");
      out.write("                    <textarea name=\"address\" name=\"address\" rows=\"3\" class=\"form-control focus\" cols=\"20\">\n");
      out.write("Address Here...\n");
      out.write("                    </textarea>\n");
      out.write("            <h4>Create a password:</h4> \n");
      out.write("            <input type=\"text\" name=\"password\" placeholder=\"Enter password\" class=\"form-control focus\"/>\n");
      out.write("             <h4>Confirm password:</h4> \n");
      out.write("            <input type=\"text\" name=\"cpassword\" placeholder=\"Enter Confirm password\" class=\"form-control focus\"/>\n");
      out.write("        \n");
      out.write("            <h4>Pin Code : </h4>\n");
      out.write("                    <input type=\"number\" name=\"pin\" placeholder=\"Pin Code\" class=\"form-control focus\"/>\n");
      out.write("                    <h4>Profile Picture</h4>\n");
      out.write("                    <input type=\"file\" name=\"pic\" class=\"form-control focus\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h5 style=\"text-align: center;\">\n");
      out.write("                    <input type=\"checkbox\" name=\"info\" value=\"ON\" style=\"height:15px;width:15px;\"/>\n");
      out.write("                    Check all entry is correct.\n");
      out.write("                    </h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <input type=\"submit\" style=\"float: right;margin: 20px 10px 0px 0px;\" class=\"btn-success btn\" value=\"Register\" />\n");
      out.write("                     <input type=\"reset\" style=\"float: right;margin: 20px 40px 0px 0px;\" class=\"btn-warning btn\" value=\"Clear\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/hover-min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            .pfooter\n");
      out.write("            {\n");
      out.write("                min-height: 70px;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .pfooter h4\n");
      out.write("            {\n");
      out.write("                color: aqua;\n");
      out.write("                font-size: 17px;\n");
      out.write("                font-family: times new romen;\n");
      out.write("            }\n");
      out.write("            .pfooter ul\n");
      out.write("            {\n");
      out.write("                list-style-type:none;\n");
      out.write("            }\n");
      out.write("            .footer\n");
      out.write("            {\n");
      out.write("                min-height: 40px;\n");
      out.write("                background: black;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row pfooter\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h4>Contect Us</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Prepared By : Pawan Kumar Kushwaha</li>\n");
      out.write("                                <li>Email : pkk4499@gmail.com</li>\n");
      out.write("                                <li>Mobile No. +918853594678</li>\n");
      out.write("                                <li>Address : Softpro India, Lucknow</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h4>Guidence By</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Er. Akhilesh Kumar</li>\n");
      out.write("                                <li></li>\n");
      out.write("                                <li></li>\n");
      out.write("                                <li></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <img src=\"images/spi.png\" class=\"img-responsive img-thumbnail\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 footer\">\n");
      out.write("                    copyright &copy; 2018\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
