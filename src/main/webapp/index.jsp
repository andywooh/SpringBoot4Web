<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>   
<html>   
  <head>   
  	<title> web </title>   
  </head>   
  <body>   

     <div align="center">   
	   <form action="/demo/say-hello" method="POST">
		   <table>   
			   <tr><th colspan="3" align="center">DEMO</th></tr>
			   <tr>   
				   <td>User Name:</td><td><input type="text" name="userName"/></td>
			   </tr>
			   <tr>
			   	   <td colspan="2" align="center"><input type="submit" value="submit">  
			   	   <input type="reset" value="reset"></td>
			   </tr>   
		   </table>   
	   </form>
	   <a href="/demo/to-other-page">ToOtherPage</a>
     </div>   
  </body>   
</html>   