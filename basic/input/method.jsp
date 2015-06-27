<%@page contentType="text/html; charset=UTF-8"%>

<HTML>
  <HEAD>
    <TITLE>MethodServleの入力</TITLE>
  </HEAD>
  <BODY>
  	<H2>MethodServleの入力</H2>
  	<A HREF="../servlet/input.MethodServlet?message=こんにちわ">リンクでGET送信</A>

    <FORM ACTION="../servlet/input.MethodServlet" METHOD="get">
      <INPUT TYPE="TYPE" NAME="message">
      <INPUT TYPE="SUBMIT" value="フォームGET送信">
    </FORM>

    <FORM ACTION="../servlet/input.MethodServlet" METHOD="post">
      <INPUT TYPE="TYPE" NAME="message">
      <INPUT TYPE="SUBMIT" value="フォームPOST送信">
    </FORM>

  </BODY>
</HTML>
