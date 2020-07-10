<jsp:directive.include file="../fragments/mason-init.jspf"/>
<m:resource>

  <m:request method="POST" item="true">
    <m:param name="name" type="TEXT" value="${mtgReq.params['name']}" max="100.0" minLen="1" />
    <m:param name="rating" type="NUMBER" value="${mtgReq.params['rating']}" max="5.0" min="1.0" />
    <c:forEach items="${mtgReq.body.films}" varStatus="loop" var="loopItem">

    <sql:update var="postResult" dataSource="${datasource}">
      INSERT INTO movie (name,rating) values (? ,? )

    <sql:param value="${loopItem.name}"/>
    <sql:param value="${loopItem.rating}"/>
    </sql:update>

      <c:set target="${output}" property="postResult_${loop.index}" value="${pageScope['postResult']}"/>
    </c:forEach>
  </m:request>

</m:resource>