<%-- 
    Document   : actCliente
    Created on : 03-mar-2021, 18:07:09
    Author     : Santiago Mendez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="cabecera.jsp" %>
        <div class="content">
            <div class="card border-info">
                <div class="card header bg-info">
                    <h1>Modificar Transportista</h1>                    
                </div>
                <form:form cssClass="navbar-form" method="post" commandName="cliente">
                          <form:errors path="*"></form:errors><br><br>
                    <form:label path="Id" cssClass="input-group-addon">Digite su identificacion: </form:label>
                        <form:input path="Id" cssClass="form-control"></form:input>
                        <BR>
                         <form:label path="placa" cssClass="input-group-addon">Digite placa del vehiculo: </form:label>
                        <form:input path="placa" cssClass="form-control"></form:input>
                        <BR>
                        <form:label path="nombre" cssClass="input-group-addon">Digite el Nombre: </form:label>
                        <form:input path="nombre" cssClass="form-control"></form:input>
                        <BR>
                        <form:label path="apellido" cssClass="input-group-addon">Digite el Apellido </form:label>
                        <form:input path="apellido" cssClass="form-control"></form:input>
                        <BR>
                        <form:label path="telefono" cssClass="input-group-addon">Digite el Teléfono: </form:label>
                        <form:input path="telefono" cssClass="form-control"></form:input>
                        <form:button value="Enviar_datos" class="btn btn-primary btn-md">
                            Enviar Datos
                        </form:button>
                            <input type="reset" value="Limpiar..." class="btn btn-primary btn-md"/>
                            <a href="formCliente.htm" class="btn btn-primary btn-md">Regresar<a/>
                    </form:form>
                
                
                </div>
            </div>
        </div>
    </div>
    </body>
</html>

<!--<div class="carb body">
                    <form action="" method="post">
                        <form:errors path="*"></form:errors><br><br>
                        <label  Class="input-group-addon">Digite el Id: </label>
                        <input type="text" name="Id" Class="form-control"
                               value='<c:out value="${cli[0].Id}"></c:out>' />
                        <label  Class="input-group-addon">Digite la Placa: </label>
                        <input type="text" name="Placa" Class="form-control" 
                               value='<c:out value="${cli[0].Placa}"></c:out>' />

                        <label  Class="input-group-addon">Digite el Nombre: </label>
                        <input type="text" name="Nombre" Class="form-control"
                               value='<c:out value="${cli[0].Nombre}"></c:out>' />
                       
                        
                        <label name="correo" Class="input-group-addon">Digite el Apellido: </label>
                        <input type="text" name="Apellido" Class="form-control"
                               value="<c:out value="${cli[0].Apellido}"></c:out>" />
                        
                        <label name="telefono" Class="input-group-addon">Digite el Teléfono: </label>
                        <input type="text" name="Telefono" Class="form-control"
                               value="<c:out value="${cli[0].Telefono}"></c:out>" />
                        
                        <input type="submit" name="btnEnviar" value="Actualizar_datos" class="btn btn-primary btn-md" />
                        <input type="reset" value="Limpiar..." class="btn btn-primary btn-md"/>
                        <a href="formCliente.htm" class="btn btn-primary btn-md">Regresar<a/>
                    </form>



