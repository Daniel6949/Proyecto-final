<%-- 
    Document   : formCliente
    Created on : 03-mar-2021, 18:08:01
    Author     : Santiago Mendez
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
        <h1>Ejemplo de Uso de FORMS en JSTL y JSP</h1>                
        <div class="content">
                    <form:form cssClass="navbar-form " method="post" commandName="transportista">
                        <form:errors path="*" element="div" cssClass="alert alert-danger" />
                        <div class="input-group">
                        <form:label path="id" cssClass="input-group-addon">Ingrese su identificacion: </form:label>
                        <form:input path="id" cssClass="form-control"></form:input>            
                        </div>
                        <br>
                        <br>
                        
                         <div class="input-group" >
                        <form:label path="nombre" cssClass="input-group-addon">Ingrese su Nombre: </form:label>
                        <form:input path="nombre" cssClass="form-control"></form:input>
                         </div>
                         <br>
                         <br>
                         <div class="input-group" >
                        <form:label path="apellido" cssClass="input-group-addon">Ingrese su Apellido: </form:label>
                        <form:input path="apellido" cssClass="form-control"></form:input>
                        </div>
                        <br>     
                        <br>
                        <div class="input-group" >
                        <form:label path="telefono" cssClass="input-group-addon">Ingrese su Telefono: </form:label>
                        <form:input path="telefono" cssClass="form-control"></form:input>
                        </div><br>
                <form:button name="Enviar" class="btn btn-primary btn-lg">Enviar</form:button>
                <a class="btn btn-primary btn-lg" href="index.htm" role="button" >Regresar...</a>
                        
                     </form:form>
    </body>
</html>

   