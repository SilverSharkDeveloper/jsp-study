/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-06-09 08:16:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.templates.board_002ddetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trip_002dboard_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/web_1900_HES/traverse/workspace/project-travelers/WebContent/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1682164404140L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fescapeXml_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fescapeXml_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fescapeXml_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>여행기 상세 페이지</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/font/font.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/board-detail/trip-board-detail.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<app-root _nghost-phe-c68 ng-version=\"13.3.12\">\r\n");
      out.write("	\r\n");
      out.write("	<div _ngcontent-phe-c68 id=\"wrap\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/templates/mypage/mypage-modal.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<app-travel-note-detail _nghost-phe-c90=\"\" class=\"ng-star-inserted\">\r\n");
      out.write("		<div _ngcontent-phe-c90=\"\" id=\"content\">\r\n");
      out.write("			<div _ngcontent-phe-c90=\"\" class=\"in_wrap\">\r\n");
      out.write("				<section _ngcontent-phe-c90=\"\" class=\"board_wrap\">\r\n");
      out.write("					<div _ngcontent-phe-c90=\"\" class=\"board_view trip_view pdt50\">\r\n");
      out.write("						<div _ngcontent-phe-c90=\"\" class=\"tit_wrap\">\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("								<span _ngcontent-phe-c90=\"\" class=\"schedule_date\"><span\r\n");
      out.write("									_ngcontent-phe-c90=\"\">TRAVEL</span> ·");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.startDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('~');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.endDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span><span\r\n");
      out.write("									_ngcontent-phe-c90=\"\" class=\"city\">사이판</span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("								<h1 _ngcontent-phe-c90=\"\" class=\"tit\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\" class=\"di_flex\">\r\n");
      out.write("								<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("									<span _ngcontent-phe-c90=\"\" class=\"nick\"> by ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span><span\r\n");
      out.write("										_ngcontent-phe-c90=\"\" class=\"date\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.registerDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("									<ul _ngcontent-phe-c90=\"\" class=\"ico_wrap\">\r\n");
      out.write("										<li _ngcontent-phe-c90=\"\"><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("											class=\"ico_spot\"></span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.viewedCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("										<li _ngcontent-phe-c90=\"\"><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("											class=\"ico_like\"></span> 1</li>\r\n");
      out.write("										<li _ngcontent-phe-c90=\"\"><a _ngcontent-phe-c90=\"\"\r\n");
      out.write("											class=\"btn_share\"><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("												class=\"ico_share\"></span> 공유하기 </a> <!----></li>\r\n");
      out.write("\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div _ngcontent-phe-c90=\"\" class=\"cont_wrap\">\r\n");
      out.write("							<aside class=\"side_bar\">\r\n");
      out.write("								<span _ngcontent-oma-c66=\"\" class=\"btn_top_scroll\"></span>\r\n");
      out.write("								<span _ngcontent-oma-c66=\"\" class=\"btn_write_board\"><a style =\"height : 100% ;width : 100%; display : block\" href =\"/templates/board-form/trip-board-form.jsp\"></a></span>\r\n");
      out.write("								<span _ngcontent-oma-c66=\"\" class=\"btn_heart\">\r\n");
      out.write("										<span>\r\n");
      out.write("											\r\n");
      out.write("										</span>\r\n");
      out.write("								</span>\r\n");
      out.write("							</aside>\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\" id=\"editorjs\" style=\"margin-top: 4rem;\">\r\n");
      out.write("								<div class=\"codex-editor\">\r\n");
      out.write("									<div class=\"codex-editor__redactor\"\r\n");
      out.write("										style=\"padding-bottom: 300px;\">\r\n");
      out.write("										");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("										\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"codex-editor-overlay\">\r\n");
      out.write("										<div class=\"codex-editor-overlay__container\">\r\n");
      out.write("											<div class=\"codex-editor-overlay__rectangle\"\r\n");
      out.write("												style=\"display: none;\"></div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div _ngcontent-phe-c90=\"\" class=\"tag_wrap\">\r\n");
      out.write("							<span _ngcontent-phe-c90=\"\" class=\"tag ng-star-inserted\">\r\n");
      out.write("								#결혼기념일여행 </span><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("								class=\"tag ng-star-inserted\"> #사이판3박4일 </span><span\r\n");
      out.write("								_ngcontent-phe-c90=\"\" class=\"tag ng-star-inserted\">\r\n");
      out.write("								#사이판렌트카투어 </span><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("								class=\"tag ng-star-inserted\"> #사이판맛집 </span><span\r\n");
      out.write("								_ngcontent-phe-c90=\"\" class=\"tag ng-star-inserted\">\r\n");
      out.write("								#사이판숙소 </span><span _ngcontent-phe-c90=\"\" class=\"tag ng-star-inserted\">\r\n");
      out.write("								#사이판여행일정 </span><span _ngcontent-phe-c90=\"\"\r\n");
      out.write("								class=\"tag ng-star-inserted\"> #사이판좋아요 </span>\r\n");
      out.write("							<!---->\r\n");
      out.write("						</div>\r\n");
      out.write("		\r\n");
      out.write("						<div _ngcontent-phe-c90=\"\" class=\"attr_wrap\">\r\n");
      out.write("							<a _ngcontent-phe-c90=\"\" class=\"attr_tag ng-star-inserted btn_location\">\r\n");
      out.write("								사이판 </a>\r\n");
      out.write("							<!---->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<section _ngcontent-phe-c90=\"\" class=\"comment_wrap\">\r\n");
      out.write("						<dl _ngcontent-phe-c90=\"\" class=\"comment_form\">\r\n");
      out.write("							<dt _ngcontent-phe-c90=\"\">\r\n");
      out.write("								<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("									댓글 <span _ngcontent-phe-c90=\"\" class=\"count\">0</span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("									<a _ngcontent-phe-c90=\"\"><img _ngcontent-phe-c90=\"\"\r\n");
      out.write("										src=\"https://www.wishbeen.co.kr/assets/images/svg/refresh.svg\"\r\n");
      out.write("										alt=\"새로고침\"></a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</dt>\r\n");
      out.write("							<dd _ngcontent-phe-c90=\"\">\r\n");
      out.write("								<input _ngcontent-phe-c90=\"\" type=\"text\" maxlength=\"500\"\r\n");
      out.write("									class=\"txtbox\" placeholder=\"\">\r\n");
      out.write("								<button _ngcontent-phe-c90=\"\" type=\"button\" class=\"btn_register\">\r\n");
      out.write("									등록</button>\r\n");
      out.write("								<span _ngcontent-phe-c90=\"\" class=\"desc\">0 / 500</span>\r\n");
      out.write("							</dd>\r\n");
      out.write("						</dl>\r\n");
      out.write("						<div _ngcontent-oma-c90=\"\" class=\"comment_list\">\r\n");
      out.write("							<!-- <div _ngcontent-oma-c90=\"\" class=\"inner ng-star-inserted\"\r\n");
      out.write("								id=\"reply_113312\">\r\n");
      out.write("								<ul _ngcontent-oma-c90=\"\" class=\"di_flex\">\r\n");
      out.write("									<li _ngcontent-oma-c90=\"\" class=\"left_wrap\"><div\r\n");
      out.write("											_ngcontent-oma-c90=\"\">\r\n");
      out.write("											<span _ngcontent-oma-c90=\"\" class=\"img\"><img\r\n");
      out.write("												_ngcontent-oma-c90=\"\" alt=\"img\"\r\n");
      out.write("												src=\"https://www.wishbeen.co.kr/assets/images/svg/wb_symbol.svg\"></span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div _ngcontent-oma-c90=\"\">\r\n");
      out.write("											<span _ngcontent-oma-c90=\"\" class=\"nick ng-star-inserted\">\r\n");
      out.write("												유저명 </span>\r\n");
      out.write("											\r\n");
      out.write("											\r\n");
      out.write("											\r\n");
      out.write("											<p _ngcontent-oma-c90=\"\" class=\"txt\">내용</p>\r\n");
      out.write("										</div></li>\r\n");
      out.write("									<li _ngcontent-oma-c90=\"\" class=\"right_wrap\"><div\r\n");
      out.write("											_ngcontent-oma-c90=\"\" class=\"ng-star-inserted\">\r\n");
      out.write("											<span _ngcontent-oma-c90=\"\" class=\"date\"> 시간 </span>\r\n");
      out.write("											\r\n");
      out.write("										</div>\r\n");
      out.write("								</ul>\r\n");
      out.write("								\r\n");
      out.write("							</div> -->\r\n");
      out.write("							<!---->\r\n");
      out.write("						</div>\r\n");
      out.write("						<!---->\r\n");
      out.write("						<ul _ngcontent-oma-c90=\"\"\r\n");
      out.write("							class=\"pagination pc ng-star-inserted\">\r\n");
      out.write("							<li _ngcontent-oma-c90=\"\"><a _ngcontent-oma-c90=\"\"><img\r\n");
      out.write("									_ngcontent-oma-c90=\"\"\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/chevron_double_left.svg\" alt=\"처음\"></a></li>\r\n");
      out.write("							<li _ngcontent-oma-c90=\"\"><a _ngcontent-oma-c90=\"\"><img\r\n");
      out.write("									_ngcontent-oma-c90=\"\"\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/chevron_left.svg\" alt=\"이전\"></a></li>\r\n");
      out.write("							<li _ngcontent-oma-c90=\"\"><a _ngcontent-oma-c90=\"\"\r\n");
      out.write("								class=\"active ng-star-inserted\"> 1 </a>\r\n");
      out.write("							<!----></li>\r\n");
      out.write("							<li _ngcontent-oma-c90=\"\"><a _ngcontent-oma-c90=\"\"><img\r\n");
      out.write("									_ngcontent-oma-c90=\"\"\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/chevron_right.svg\" alt=\"다음\"></a></li>\r\n");
      out.write("							<li _ngcontent-oma-c90=\"\"><a _ngcontent-oma-c90=\"\"><img\r\n");
      out.write("									_ngcontent-oma-c90=\"\"\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/chevron_double_right.svg\" alt=\"마지막\"></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div _ngcontent-phe-c90=\"\" class=\"list_btn mo ng-star-inserted\">\r\n");
      out.write("							<a _ngcontent-phe-c90=\"\" class=\"btn_st0 more\">더보기</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!---->\r\n");
      out.write("					</section>\r\n");
      out.write("				</section>\r\n");
      out.write("				<div _ngcontent-phe-c90=\"\" class=\"user_info_wrap\">\r\n");
      out.write("					<a _ngcontent-phe-c90=\"\"\r\n");
      out.write("						href=\"/member/45c758e682d55342aa87ba0aa1ac7991\"><div\r\n");
      out.write("							_ngcontent-phe-c90=\"\" class=\"in_wrap\">\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\">\r\n");
      out.write("								<span _ngcontent-phe-c90=\"\" class=\"img\"><img\r\n");
      out.write("									_ngcontent-phe-c90=\"\" alt=\"userimg\"\r\n");
      out.write("									src=\"https://www.wishbeen.co.kr/assets/images/svg/wb_symbol.svg\"></span>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div _ngcontent-phe-c90=\"\" class=\"txt_wrap\">\r\n");
      out.write("								<ul _ngcontent-phe-c90=\"\">\r\n");
      out.write("									<li _ngcontent-phe-c90=\"\" class=\"nick\">IMMMI</li>\r\n");
      out.write("									<li _ngcontent-phe-c90=\"\" class=\"desc\">등록된 한줄 소개가 없습니다.\r\n");
      out.write("										마이페이지에서 [예쁜 소개글]을 작성해주세요.</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<section _ngcontent-phe-c90=\"\" class=\"banner_wrap ng-star-inserted\">\r\n");
      out.write("				<div _ngcontent-phe-c90=\"\" class=\"in_wrap\">\r\n");
      out.write("					<div _ngcontent-phe-c90=\"\" class=\"img pc\" style=\"cursor: pointer;\">\r\n");
      out.write("						<img _ngcontent-phe-c90=\"\"\r\n");
      out.write("							src=\"https://test-resize-image.wishbeen.co.kr/8d6a301bd7625ece8f6bfd75c6366083.jpg\"\r\n");
      out.write("							alt=\"밀크T 여행기 배너\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div _ngcontent-phe-c90=\"\" class=\"img mo\" style=\"cursor: pointer;\">\r\n");
      out.write("						<img _ngcontent-phe-c90=\"\"\r\n");
      out.write("							src=\"https://test-resize-image.wishbeen.co.kr/4ccd3592be6257dc9632b012ea0b3274.jpg\"\r\n");
      out.write("							alt=\"밀크T 여행기 배너\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("			<!---->\r\n");
      out.write("		</div>\r\n");
      out.write("		</app-travel-note-detail>\r\n");
      out.write("\r\n");
      out.write("	");
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
      out.write("/static/js/aside/aside-icons.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fescapeXml_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /templates/board-detail/trip-board-detail.jsp(69,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.content}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /templates/board-detail/trip-board-detail.jsp(69,10) name = escapeXml type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setEscapeXml(false);
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fescapeXml_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
