<!DOCTYPE HTML>
<html>
<head>
<title>Form Values</title>
</head>
<body>
<table>
    <tr>
        <td>Name:</td>
        <td>
            ${param.name} 
            (length:${param.name.length()})
        </td>
    </tr>
    <tr>
        <td>Address:</td>
        <td>
            ${param.address} 
            (length:${param.address.length()})
        </td>
    </tr>
     <tr>
        <td>Map:</td>
        <td>
            ${paramValues.name[0]} 
            
        </td>
    </tr>
</table>
</body>
</html>