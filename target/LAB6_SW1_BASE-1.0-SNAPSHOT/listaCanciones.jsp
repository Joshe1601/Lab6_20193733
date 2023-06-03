<%@ page import="Beans.Reproduccion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Reproduccion>" scope="request" id="listaCanciones"/>
<html>
<jsp:include page="/static/head.jsp">
    <jsp:param name="title" value="Lista de Canciones por banda"/>
</jsp:include>
<body>
<div class='container'>
    <jsp:include page="/includes/navbar.jsp">
        <jsp:param name="page" value="canciones"/>
    </jsp:include>
    <div class="pb-5 pt-4 px-3 titlecolor">

       <div class="row">
           <div class="col-lg-6">
           <h1 class='text-light'>Lista de Canciones por banda</h1>
       </div>
           <div class="col-lg-6 text-right" >
               <a id="cancionesCompletas" class="btn btn-warning">Mostrar todas las canciones</a>
           </div>
       </div>

    </div>
    <div class="tabla">
        <table class="table table-dark table-transparent table-hover">
            <thead>
            <th>ID</th>
            <th>CANCIÓN</th>
            <th>BANDA</th>
            </thead>
            <%
                for (Reproduccion reproduccion : listaCanciones) {
            %>
            <tr>
                <td><%=reproduccion.getCancion_idcancion()%>
                </td>
                <td><%=reproduccion.getNombre_cancion()%>
                </td>
                <td><%=reproduccion.getIdbanda()%>
                </td>

            </tr>
            <%
                }
            %>
        </table>
    </div>

</div>
<jsp:include page="/static/scripts.jsp"/>

<script>
    document.getElementById('cancionesCompletas').addEventListener('click', function() {
        this.style.display = 'none';
        window.location.href = 'listaCanciones.jsp?button=accion';
    });
</script>

</body>
</html>
