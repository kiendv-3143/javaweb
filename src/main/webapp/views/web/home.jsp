<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
<div class="row">
    <div class="col-lg-3">
    </div>
    <!-- /.col-lg-3 -->
    <div class="col-lg-9">
        <div class="row">
			<c:forEach var="item" items="${items}">
			<div class="col-lg-4 col-md-6 mb-4">
				<div class="card h-100">
					<img class="card-img-top" src="<c:url value='/template/web/images/' />${item.image}" alt="">
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">${item.name}</a>
						</h4>
						<h5>$${item.price}</h5>
						<p class="card-text">${item.description}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
					</div>
				</div>
			</div>
			</c:forEach>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.col-lg-9 -->
</div>
<!-- /.row -->
</body>