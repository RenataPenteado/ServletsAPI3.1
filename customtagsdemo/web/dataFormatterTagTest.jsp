<%@ taglib uri="/WEB-INF/mytags.tld" prefix="easy"%>
<!DOCTYPE html>
<html>
<head>
    <title>Testing DataFormatterTag</title>
</head>
<body>
<easy:dataFormatter header="States" 
    items="Alabama,Alaska,Georgia,Florida"
/>

<br/>
<easy:dataFormatter header="Countries">
    <jsp:attribute name="items">
        US,UK,Canada,France
    </jsp:attribute>
</easy:dataFormatter>
</body>
</html>