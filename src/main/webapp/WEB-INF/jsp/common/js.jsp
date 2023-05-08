<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
 var historyBack = '${historyBack}' == 'true';
 var msg = '${msg}'.trim();
 if(msg){
	 alert(msg);
 }
 if(historyBack){
	 history.Back();
 }
 var replaceUri = '${replaceUri}'.trim();
 if(replaceUri){
	 location.replaceUri(replaceUri);
 }

</script>