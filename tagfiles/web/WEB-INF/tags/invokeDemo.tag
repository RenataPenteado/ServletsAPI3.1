<%@ attribute name="productDetails" fragment="true" %>
<%@ attribute name="productDetailsII" fragment="true" %>
<%@ variable name-given="productName" %>
<%@ variable name-given="description" %>
<%@ variable name-given="price" %>
<%@ variable name-given="productOrigin" %>
<%
    jspContext.setAttribute("productName", "Pelesonic DVD Player");
    jspContext.setAttribute("description", 
        "Dolby Digital output through coaxial digital-audio jack," + 
        " 500 lines horizontal resolution-image digest viewing");
    jspContext.setAttribute("price", "65");
    jspContext.setAttribute("productOrigin", "Brazil");
%>
<jsp:invoke fragment="productDetails"/>
<jsp:invoke fragment="productDetailsII"/>