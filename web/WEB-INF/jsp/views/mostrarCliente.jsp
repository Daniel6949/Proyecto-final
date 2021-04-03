<%-- 
    Document   : mostrarCliente
    Created on : 03-mar-2021, 18:08:11
    Author     : Santiago Mendez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/dataTables.bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap.min.css"/>

<script>
    $(document).ready( function () {
    $('#listadoTransportista').DataTable({
        "info": true,
        "paging": true,
        "buttons": true,
        "lengthMenu":[[5,10,25,50,-1],[5,10,25,50,"All"]],
           "language":{"url": "https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"},
        "paginate": true,
        
    });


} );
</script>

            <h1>Coneccion a Bases de Datos MYSql</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregarCliente.htm" class="btn btn-primary">Agregar Transportista</a>
                </div>
                <div class="card-body ">
                    <table class="table table-bordered table-striped table-hover" id="listadoTransportista">
                        <thead>
                            <th>id</th>
                            <th>placa</th>
                            <th>nombre</th>
                            <th>apellido</th>
                            <th>Telefono</th>
                        </thead>
                        <tbody>
                            <c:forEach items="${transportista}" var="dato">
                            <tr>
                                <td><c:out value="${dato.Id}"></c:out></td>
                                <td><c:out value="${dato.Placa}"></c:out></td>
                                <td><c:out value="${dato.Nombre}"></c:out></td>
                                <td><c:out value="${dato.Apellido}"></c:out></td>
                                <td><c:out value="${dato.telefono}"></c:out></td>
                                <td>
                                    <a href="actCliente.htm?id=${dato.Id}" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>
                                    <!-- <a href="actCliente.htm?id=${dato.Id}" class="btn btn-warning">Editar</a> --> 
                                    <a href="borrarCliente.htm?id=${dato.Id}" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                           
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        

    </body>
</html>
