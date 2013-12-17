<%@ page contentType="application/json"%>

<%@page import="net.daw.helper.Contexto"%>
<%@page import="net.daw.bean.UsuarioBean"%>
<%
    Contexto oContexto = (Contexto) request.getAttribute("contexto");
%>
<%=(String) oContexto.getParametro()%>
    
