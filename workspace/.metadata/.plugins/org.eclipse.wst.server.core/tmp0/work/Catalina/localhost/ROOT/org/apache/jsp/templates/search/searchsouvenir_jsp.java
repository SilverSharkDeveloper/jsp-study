/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-03 08:32:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchsouvenir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/search/searchtriproute.css\" type=\"text/css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/font/font.css\" type=\"text/css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/search/searchsouvenir.css\" type=\"text/css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<app-root>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/mypage/mypage-modal.jsp", out, false);
      out.write("\r\n");
      out.write("		<app-city-main class=\"ng-star-inserted\">\r\n");
      out.write("		<main id=\"content\">\r\n");
      out.write("			<section class=\"m_visual\">\r\n");
      out.write("				<div class=\"in_wrap\">\r\n");
      out.write("					<div class=\"txt_wrap\">\r\n");
      out.write("						<p class=\"txt\">\r\n");
      out.write("							<span class=\"d_block st1\">세상의 모든 여행</span><span\r\n");
      out.write("								class=\"d_block st2\"><span>Travelers</span></span>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p class=\"sch\">\r\n");
      out.write("							<input type=\"text\" placeholder=\"도시나 키워드를 검색해보세요.\">\r\n");
      out.write("							<button type=\"button\">\r\n");
      out.write("								<img\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/search_w.svg\"\r\n");
      out.write("									alt=\"검색\"><span class=\"pc\">검색</span>\r\n");
      out.write("							</button>\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"in_wrap reposition\">\r\n");
      out.write("				<nav class=\"tab_sub_wrap withTopBanner\">\r\n");
      out.write("					<ul class=\"tab_nav\">\r\n");
      out.write("						<li><a routerlink=\"home\" routerlinkactive=\"active\"\r\n");
      out.write("							href=\"/templates/search/home.jsp\"> 홈 </a></li>\r\n");
      out.write("						<li><a routerlink=\"travelogues\" routerlinkactive=\"active\"\r\n");
      out.write("							href=\"/listOk.tripBoard\" > 여행기 </a></li>\r\n");
      out.write("						<li><a routerlink=\"schedules\" routerlinkactive=\"active\"\r\n");
      out.write("							href=\"#\"> 추천루트 </a></li>\r\n");
      out.write("						<li><a routerlink=\"places\" class=\"active\" routerlinkactive=\"active\"\r\n");
      out.write("							href=\"/listOk.itemBoard\"> 기념품 목록 </a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("				<router-outlet></router-outlet>\r\n");
      out.write("				<app-city-travel-plan class=\"ng-star-inserted\">\r\n");
      out.write("				<section class=\"board_wrap\">\r\n");
      out.write("					<div class=\"board_header di_flex\">\r\n");
      out.write("						<h2 class=\"hide\">기념품 목록</h2>\r\n");
      out.write("						<div>\r\n");
      out.write("							<ul class=\"sel_wrap\">\r\n");
      out.write("								<li><select class=\"selbox\">\r\n");
      out.write("										<option value>여행기간</option>\r\n");
      out.write("										<option value=\"1\">1월</option>\r\n");
      out.write("										<option value=\"2\">2월</option>\r\n");
      out.write("										<option value=\"3\">3월</option>\r\n");
      out.write("										<option value=\"4\">4월</option>\r\n");
      out.write("										<option value=\"5\">5월</option>\r\n");
      out.write("										<option value=\"6\">6월</option>\r\n");
      out.write("										<option value=\"7\">7월</option>\r\n");
      out.write("										<option value=\"8\">8월</option>\r\n");
      out.write("										<option value=\"9\">9월</option>\r\n");
      out.write("										<option value=\"10\">10월</option>\r\n");
      out.write("										<option value=\"11\">11월</option>\r\n");
      out.write("										<option value=\"12\">12월</option>\r\n");
      out.write("								</select></li>\r\n");
      out.write("								<li><select class=\"selbox\">\r\n");
      out.write("										<option value=\"during_start__desc\">여행 시작일 순</option>\r\n");
      out.write("										<option value=\"createdatdesc\">최신순</option>\r\n");
      out.write("										<option value=\"popularitydesc\">인기순</option>\r\n");
      out.write("								</select></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"search_form\">\r\n");
      out.write("							<input placeholder=\"검색어를 입력하세요\" type=\"search\"\r\n");
      out.write("								class=\"txtbox ng-untouched ng-pristine ng-valid\">\r\n");
      out.write("							<button type=\"button\">\r\n");
      out.write("								<img\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/search.svg\"\r\n");
      out.write("									alt=\"검색\">\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<ul class=\"trip_list2\">\r\n");
      out.write("					</ul>\r\n");
      out.write("					<div class=\"list_btn ng-star-inserted\">\r\n");
      out.write("						<a class=\"btn_st1 more\">더보기</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</section>\r\n");
      out.write("				</app-city-travel-plan>\r\n");
      out.write("			</div>\r\n");
      out.write("		</main>\r\n");
      out.write("		<section class=\"banner_wrap ng-star-inserted\">\r\n");
      out.write("			<div class=\"in_wrap\">\r\n");
      out.write("				<div class=\"img pc\" style=\"cursor: pointer;\">\r\n");
      out.write("					<img\r\n");
      out.write("						src=\"https://test-resize-image.wishbeen.co.kr/3492c78225055badb4d41427678bae9f.png\"\r\n");
      out.write("						alt=\"노랑풍선 - 북유럽\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"img mo\" style=\"cursor: pointer;\">\r\n");
      out.write("					<img\r\n");
      out.write("						src=\"https://test-resize-image.wishbeen.co.kr/6b06058f965e5351ab21bf56d21bb65b.png\"\r\n");
      out.write("						alt=\"노랑풍선 - 북유럽\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		</app-city-main>\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/header-footer/footer.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	</app-root>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	let boards = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boards}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("	let contextPath = `");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("	console.log(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boards}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/tripboard/item_list.js\"></script>\r\n");
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
