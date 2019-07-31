<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
    <s:form action="save-product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <s:label for="name">Product Name: </s:label>
            <s:textfield name="productBean.name" type="text" id="name" tabindex="1"/>
            <!--<input type="text" id="name" name="name" tabindex="1">-->
        </p>
        <p>
            <s:label for="description">Description: </s:label>
            <s:textfield name="productBean.description" type="text" id="description" tabindex="2"/>
            <!--<input type="text" id="description" name="description" tabindex="2">-->
        </p>
        <p>
            <s:label for="price">Price: </s:label>
            <s:textfield name="productBean.price" type="text" id="price" tabindex="3"/>
            <!--<input type="text" id="price" name="price" tabindex="3">-->
        </p>
        <p id="buttons">
<!--            <input id="reset" type="reset" tabindex="4"/>
            <input id="submit" type="submit" tabindex="5" value="Add Product"/>-->
            <s:reset type="button" key="reset" tabindex="4"/>
            <s:submit id="submit" type="submit" tabindex="5" value="Add Product"/>
        </p>
    </fieldset>
</s:form>
</div>
</body>
</html>
