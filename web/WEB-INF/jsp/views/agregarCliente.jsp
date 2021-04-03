<%-- 
    Document   : agregarCliente
    Created on : 03-mar-2021, 18:07:20
    Author     : Santiago Mendez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="cabecera.jsp" %>
        <div class="content">
            <div class="card border-info">
                <div class="card header bg-info">
                    <h1>Agregar Transportista....</h1>                    
                </div>
                <div class="carb body">
                    <form:form commandName="transportista" method="post">
                          <form:errors path="*"></form:errors><br><br>
                    
                         <form:label path="placa" cssClass="input-group-addon">Digite placa del vehiculo: </form:label>
                        <form:input path="placa" cssClass="form-control"></form:input>
                        <form:label path="nombre" cssClass="input-group-addon">Digite el Nombre: </form:label>
                        <form:input path="nombre" cssClass="form-control"></form:input>
                        <form:label path="apellido" cssClass="input-group-addon">Digite el Apellido </form:label>
                        <form:input path="apellido" cssClass="form-control"></form:input>
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


