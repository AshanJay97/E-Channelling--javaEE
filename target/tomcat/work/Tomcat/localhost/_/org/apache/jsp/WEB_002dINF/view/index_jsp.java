/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-10 06:33:00 UTC
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
    _jspx_dependants.put("/WEB-INF/view/site-master/footer.jsp", Long.valueOf(1565408884151L));
    _jspx_dependants.put("/WEB-INF/view/site-master/header.jsp", Long.valueOf(1565408785266L));
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"../../../resources/libs/jquery/jquery-3.4.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"../../../resources/libs/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"../../../resources/libs/MDB/js/popper.min.js\"></script>\n");
      out.write("        <link href=\"../../../resources/libs/MDB/css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"../../../resources/libs/bootstrap-4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"../../../resources/libs/bootstrap-4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"../../../resources/styles/navbar-master.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-icon-top navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-home\"></i>\n");
      out.write("                            Home\n");
      out.write("                            <span class=\"sr-only\">(current)</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-envelope-o\">\n");
      out.write("                                <span class=\"badge badge-danger\">11</span>\n");
      out.write("                            </i>\n");
      out.write("                            Link\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-envelope-o\">\n");
      out.write("                                <span class=\"badge badge-warning\">11</span>\n");
      out.write("                            </i>\n");
      out.write("                            Disabled\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-envelope-o\">\n");
      out.write("                                <span class=\"badge badge-primary\">11</span>\n");
      out.write("                            </i>\n");
      out.write("                            Dropdown\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav \">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-bell\">\n");
      out.write("                                <span class=\"badge badge-info\">11</span>\n");
      out.write("                            </i>\n");
      out.write("                            Test\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-globe\">\n");
      out.write("                                <span class=\"badge badge-success\">11</span>\n");
      out.write("                            </i>\n");
      out.write("                            Test\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"page-footer font-small blue pt-4\">\n");
      out.write("\n");
      out.write("            <!-- Footer Links -->\n");
      out.write("            <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("\n");
      out.write("                <!-- Grid row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-6 mt-md-0 mt-3\">\n");
      out.write("\n");
      out.write("                        <!-- Content -->\n");
      out.write("                        <h5 class=\"text-uppercase\">Footer Content</h5>\n");
      out.write("                        <p>Here you can use rows and columns to organize your footer content.</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none pb-3\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                        <!-- Links -->\n");
      out.write("                        <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 3</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 4</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("\n");
      out.write("                        <!-- Links -->\n");
      out.write("                        <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 3</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#!\">Link 4</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid row -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer Links -->\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("            <div class=\"footer-copyright text-center py-3\">Â© 2018 Copyright:\n");
      out.write("                <a href=\"https://mdbootstrap.com/education/bootstrap/\"> MDBootstrap.com</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Copyright -->\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
