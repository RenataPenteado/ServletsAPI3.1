<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head><title>Testing doBody</title></head>
<body>
Your referer header: ${header.referer}
<br/>
<tags:doBodyDemo>
  hi:  ${"bala de coco"}
</tags:doBodyDemo>
<a href="viewReferer.jsp">View</a> the referer as a Session attribute.
</body>
</html>