/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 07:16:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>위시빈 ㅣ 150만개의 진짜 여행정보</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/login/new_user.css\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/font/font.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<app-root ng-version=\"13.3.12\">\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		<router-outlet></router-outlet>\r\n");
      out.write("		<app-join-lookup class=\"\">\r\n");
      out.write("		<section class=\"join_wrap write_form\">\r\n");
      out.write("			<div class=\"in_wrap\">\r\n");
      out.write("				<h1 class=\"logo\">\r\n");
      out.write("					<a href=\"/\"><img\r\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/image/logo.png\"\r\n");
      out.write("						alt=\"WishBeen\"></a>\r\n");
      out.write("				</h1>\r\n");
      out.write("				<h2 class=\"tit\">이메일 확인</h2>\r\n");
      out.write("				<p>\r\n");
      out.write("					위시빈 서비스는 사용중인 메일로 <br> 인증 후 회원가입을 실시할 수 있습니다.\r\n");
      out.write("				</p>\r\n");
      out.write("				<div>\r\n");
      out.write("					<form action=\"/join.user\">\r\n");
      out.write("						<div class=\"email_auth\">\r\n");
      out.write("							<div class=\"validation\">\r\n");
      out.write("								<div class=\"form\">\r\n");
      out.write("									<span id=\"error\"><input id=\"email\" class=\"txtbox\" \r\n");
      out.write("									type=\"text\" name=\"identification\" placeholder=\"이메일\"></span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div></div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<button id=\"wb_btn\" class=\"wb_btn disabled\">\r\n");
      out.write("									회원정보 입력</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"signup-certification \"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<app-login-footer _nghost-rrf-c83=\"\"> <footer\r\n");
      out.write("			class=\"login_footer\">\r\n");
      out.write("			<p>2022 ⓒ Better Than WishBeen.</p>\r\n");
      out.write("		</footer></app-login-footer></app-join-lookup>\r\n");
      out.write("		<!---->\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/login/newuser.js\"></script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}