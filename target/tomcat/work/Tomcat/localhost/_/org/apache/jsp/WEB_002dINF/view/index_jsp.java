/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-15 04:10:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/site-master/footer.jsp", Long.valueOf(1568456341819L));
    _jspx_dependants.put("/WEB-INF/view/site-master/header.jsp", Long.valueOf(1568520640638L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>hey</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"../../../resources/styles/googleapis-family--verela.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../../resources/styles/googleapis-family-materialIcons.css\">\n");
      out.write("        <link href=\"../../../resources/libs/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../../resources/libs/bootstrap-3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"../../../resources/libs/jquery/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"../../../resources/libs/bootstrap-3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../../resources/styles/navbar-master.css\">\n");
      out.write("        <link href=\"../../../resources/styles/style-default.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"../../../resources/scripts/constants.js\"></script>\n");
      out.write("        <script src=\"../../../resources/scripts/script-login.js\"></script>\n");
      out.write("        <script src=\"../../../resources/scripts/toastMessageHandler.js\"></script>\n");
      out.write("        <script src=\"../../../resources/scripts/script-default.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"201405093980-siql7qs8kergiu0k3d75vjvcdgr2usb3.apps.googleusercontent.com\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            // Prevent dropdown menu from closing when click inside the form\n");
      out.write("            $(document).on(\"click\", \".navbar-right .dropdown-menu\", function(e){\n");
      out.write("                e.stopPropagation();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var session = '");
      out.print( session.getAttribute("page") );
      out.write("';\n");
      out.write("                sessionManagement(name);\n");
      out.write("\n");
      out.write("\n");
      out.write("                $('#formSignUp').find('input[type=\"text\"],input[type=\"password\"],input[type=\"email\"]').on(\"change paste keyup\", function() {\n");
      out.write("\n");
      out.write("\n");
      out.write("                    if($(this).val().length != 0){\n");
      out.write("                        $(this).removeClass('has-error');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function SignUp(event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                console.log('asdasd');\n");
      out.write("                var counter = 0;\n");
      out.write("                var controllers = CheckFormTextElementsIsEmpty('formSignUp')\n");
      out.write("\n");
      out.write("                if(controllers.length > 0){\n");
      out.write("                    jQuery.each( controllers, function( i, val ) {\n");
      out.write("                        counter++;\n");
      out.write("                        $('#'+val).addClass('has-error');\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    StartToasterMessage(MESSAGE_DANGER, REQUIRED_FIELD, 'required');\n");
      out.write("\n");
      out.write("                }else if($('#txtPassword').val() != $('#confirmPassword').val()){\n");
      out.write("                    StartToasterMessage(MESSAGE_DANGER, PASSWORD_DOESNOT_MATCH, 'Notice');\n");
      out.write("                    $('#txtPassword').addClass('has-error');\n");
      out.write("                    $('#confirmPassword').addClass('has-error');\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    //$('#testform').submit();\n");
      out.write("                    RegisterUser($('#txtEmail').val(), $('#txtPassword').val());\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function onSignIn(googleUser) {\n");
      out.write("                var profile = googleUser.getBasicProfile();\n");
      out.write("                console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.\n");
      out.write("                console.log('Name: ' + profile.getName());\n");
      out.write("                console.log('Image URL: ' + profile.getImageUrl());\n");
      out.write("                console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function signOut() {\n");
      out.write("                var auth2 = gapi.auth2.getAuthInstance();\n");
      out.write("                auth2.signOut().then(function () {\n");
      out.write("                    console.log('User signed out.');\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-expand-lg navbar-light\">\n");
      out.write("            <div class=\"navbar-header d-flex col\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Brand<b>Name</b></a>\n");
      out.write("                <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle navbar-toggler ml-auto\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("            <div id=\"navbarCollapse\" class=\"collapse navbar-collapse justify-content-start\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">About</a></li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"nav-link dropdown-toggle\" href=\"#\">Services <b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\" class=\"dropdown-item\">Web Design</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"dropdown-item\">Web Development</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"dropdown-item\">Graphic Design</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"dropdown-item\">Digital Marketing</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item active\"><a href=\"#\" class=\"nav-link\">Pricing</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Blog</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"navbar-form form-inline\">\n");
      out.write("                    <div class=\"input-group search-box\">\n");
      out.write("                        <input type=\"text\" id=\"search\" class=\"form-control\" placeholder=\"Search here...\">\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"material-icons\">&#xE8B6;</i></span>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"nav-link dropdown-toggle\" href=\"#\">Login</a>\n");
      out.write("                        <ul class=\"dropdown-menu form-wrapper\">\n");
      out.write("                            <li>\n");
      out.write("                                <form action=\"\" method=\"post\">\n");
      out.write("                                    <p class=\"hint-text\">Sign in with your social media account</p>\n");
      out.write("                                    <div class=\"form-group social-btn clearfix\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div style=\"margin-left: 10%;\" class=\"g-signin2\" data-longtitle=\"true\" data-onsuccess=\"onSignIn\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"or-seperator\"><b>or</b></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Login\">\n");
      out.write("                                    <div class=\"form-footer\">\n");
      out.write("                                        <a href=\"#\">Forgot Your password?</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"#\" data-toggle=\"dropdown\" class=\"btn btn-primary dropdown-toggle get-started-btn mt-1 mb-1\">Sign up</a>\n");
      out.write("                        <ul class=\"dropdown-menu form-wrapper\">\n");
      out.write("                            <li>\n");
      out.write("                                <form id=\"formSignUp\" action=\"login\" method=\"post\">\n");
      out.write("                                    <p class=\"hint-text\">Fill in this form to create your account!</p>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" id=\"txtEmail\" class=\"form-control\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" id=\"txtPassword\" class=\"form-control\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" id=\"confirmPassword\" class=\"form-control\" placeholder=\"Confirm Password\" required=\"required\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"button\" onclick=\"SignUp(event)\" class=\"btn btn-primary btn-block btn_sign_up\" id=\"btnSigbnUp\" value=\"Sign up\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"../../../resources/libs/jquery.toaster-master/jquery.toaster.js\"></script>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("    <div style=\"height: 100%\">\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Untitled</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .footer-basic {\n");
      out.write("                padding:40px 0;\n");
      out.write("                background-color:#ffffff;\n");
      out.write("                color:#4b4c4d;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic ul {\n");
      out.write("                padding:0;\n");
      out.write("                list-style:none;\n");
      out.write("                text-align:center;\n");
      out.write("                font-size:18px;\n");
      out.write("                line-height:1.6;\n");
      out.write("                margin-bottom:0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic li {\n");
      out.write("                padding:0 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic ul a {\n");
      out.write("                color:inherit;\n");
      out.write("                text-decoration:none;\n");
      out.write("                opacity:0.8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic ul a:hover {\n");
      out.write("                opacity:1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic .social {\n");
      out.write("                text-align:center;\n");
      out.write("                padding-bottom:25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic .social > a {\n");
      out.write("                font-size:24px;\n");
      out.write("                width:40px;\n");
      out.write("                height:40px;\n");
      out.write("                line-height:40px;\n");
      out.write("                display:inline-block;\n");
      out.write("                text-align:center;\n");
      out.write("                border-radius:50%;\n");
      out.write("                border:1px solid #ccc;\n");
      out.write("                margin:0 8px;\n");
      out.write("                color:inherit;\n");
      out.write("                opacity:0.75;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic .social > a:hover {\n");
      out.write("                opacity:0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-basic .copyright {\n");
      out.write("                margin-top:15px;\n");
      out.write("                text-align:center;\n");
      out.write("                font-size:13px;\n");
      out.write("                color:#aaa;\n");
      out.write("                margin-bottom:0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer-basic\">\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"social\"><a href=\"#\"><i class=\"icon ion-social-instagram\"></i></a><a href=\"#\"><i class=\"icon ion-social-snapchat\"></i></a><a href=\"#\"><i class=\"icon ion-social-twitter\"></i></a><a href=\"#\"><i class=\"icon ion-social-facebook\"></i></a></div>\n");
      out.write("                <ul class=\"list-inline\">\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"#\">Services</a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"#\">About</a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"#\">Terms</a></li>\n");
      out.write("                    <li class=\"list-inline-item\"><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"copyright\">Company Name Â© 2018</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
