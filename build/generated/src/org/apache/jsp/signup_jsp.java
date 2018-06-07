package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MovieWale</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Pacifico|Dancing Script' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signup.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sweetalert.css\">\n");
      out.write("        <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h2>Sign Up</h2>\n");
      out.write("            <form action=\"\"  method=\"post\">\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"text\" name=\"\" required=\"\" class=\"form-control\">\n");
      out.write("                    <label>Name</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"text\" name=\"\" required=\"\" onchange=\"checkmail(this.value)\">\n");
      out.write("                    <label>Email</label>\n");
      out.write("                    <script>\n");
      out.write("                        function checkmail(id)\n");
      out.write("                    {\n");
      out.write("                        var email= /\\S+@\\S+\\.\\S+/;\n");
      out.write("                        if(email.test(id))\n");
      out.write("                        {\n");
      out.write("                           swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Email ',\n");
      out.write("                               'success'\n");
      out.write("                                      ) \n");
      out.write("                        }\n");
      out.write("                        else\n");
      out.write("                          {\n");
      out.write("                          swal(\n");
      out.write("                          'Error!',\n");
      out.write("                          'Email is not valid!',\n");
      out.write("                          'error'\n");
      out.write("                           )\n");
      out.write("                          }\n");
      out.write("                    }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"password\" name=\"\" required=\"\" onchange=\"passwordcheck(this.value)\" id=\"pass1\">\n");
      out.write("                    <label>password</label>\n");
      out.write("                    <script>\n");
      out.write("                        function passwordcheck(pass) {\n");
      out.write("                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;\n");
      out.write("                                \n");
      out.write("                                if(pass1.test(pass))\n");
      out.write("                                {\n");
      out.write("                                  swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Password ',\n");
      out.write("                               'success'\n");
      out.write("                                      )   \n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                     'Error!',\n");
      out.write("                                     'Invalid Password!,\"Password must contain at least one number,one special character and  have 6 to 16 valid characters\"',\n");
      out.write("                                      'error'\n");
      out.write("                                       )\n");
      out.write("                                       }\n");
      out.write("                                   }\n");
      out.write("                                           \n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"number\" name=\"\" required=\"\" onchange=\"CheckIndianNumber(this.value)\">\n");
      out.write("                    <label>Number</label>\n");
      out.write("                    <script>\n");
      out.write("                        function CheckIndianNumber(IndianNumber)\n");
      out.write("                         {\n");
      out.write("                      var Num = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("                       if(Num.test(IndianNumber))\n");
      out.write("                           {\n");
      out.write("                           swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Mobile Number',\n");
      out.write("                               'success'\n");
      out.write("                                      )\n");
      out.write("                                     }\n");
      out.write("                                      else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                             'Error!',\n");
      out.write("                                             'Mobile number is not valid!',\n");
      out.write("                                                 'error'\n");
      out.write("                                                       )\n");
      out.write("                                                         }\n");
      out.write("                                                 }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"password\" name=\"\" required=\"\" id=\"pass2\" onchange=\"myFunction()\">\n");
      out.write("                    <label>Confirm-password</label>\n");
      out.write("                    <script>\n");
      out.write("                         function myFunction() {\n");
      out.write("        var pass1 = document.getElementById(\"pass1\").value;\n");
      out.write("        var pass2 = document.getElementById(\"pass2\").value;\n");
      out.write("        if (pass1 != pass2) {\n");
      out.write("            //alert(\"Passwords Do not match\");\n");
      out.write("            swal('Error!',\n");
      out.write("                 ' Password may be Different! ',\n");
      out.write("                 'error')\n");
      out.write("                         \n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("           swal('Success!',\n");
      out.write("                ' Password Match! ',\n");
      out.write("                'success') \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"text\" name=\"\" required=\"\">\n");
      out.write("                    <label>City</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputBox\">\n");
      out.write("                    <input type=\"number\" name=\"\" required=\"\">\n");
      out.write("                    <label>Pin-Code</label>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" name=\"\" value=\"submit\"><br><br>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
