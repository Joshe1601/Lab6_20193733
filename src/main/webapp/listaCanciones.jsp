<%@ page import="Beans.Reproduccion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Reproduccion>" scope="request" id="listaCanciones"/>
<html>
<jsp:include page="/static/head.jsp">
    <jsp:param name="title" value="Lista de Canciones por banda"/>
</jsp:include>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
               <a id="ocultar" class="btn btn-warning" href="<%=request.getContextPath()%>/listaCanciones?action=total">Mostrar todas las canciones</a>
           </div>
       </div>

    </div>
    <div class="tabla">
        <table class="table table-dark table-transparent table-hover">
            <thead>
            <th>ID</th>
            <th>CANCIÓN</th>
            <th>BANDA</th>
            <th>Añadir a favoritos</th>
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
                <td><a><span class="btn fa fa-star" style="color: yellow"></span></a>
                </td>

            </tr>
            <%
                }
            %>
        </table>
    </div>

</div>
<jsp:include page="/static/scripts.jsp"/>

</body>
</html>
