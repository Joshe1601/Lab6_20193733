<%@ page import="Beans.Reproduccion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Reproduccion>" scope="request" id="listaRecomendados"/>
<html>
<jsp:include page="/static/head.jsp">
  <jsp:param name="title" value="Canciones Recomendadas"/>
</jsp:include>
<body>
<div class='container'>
  <jsp:include page="/includes/navbar.jsp">
    <jsp:param name="page" value="recomendados"/>
  </jsp:include>
  <div class="pb-5 pt-4 px-3 titlecolor">
    <div class="col-lg-6">
      <h1 class='text-light'>Lista de Canciones Recomendadas</h1>
    </div>
  </div>
  <div class="tabla">
    <table class="table table-dark table-transparent table-hover">
      <thead>
      <th>ID</th>
      <th>CANCIÓN</th>
      <th>BANDA</th>
      <th>Ver</th>
      </thead>
      <%
        for (Reproduccion reproduccion : listaRecomendados) {
      %>
      <tr>
        <td><%=reproduccion.getCancion_idcancion()%>
        </td>
        <td><%=reproduccion.getNombre_cancion()%>
        </td>
        <td><%=reproduccion.getIdbanda()%>
        </td>
        <td><a class="btn btn-success">Más de la banda</a>
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
