<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Home</title>

<link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/jumbotron/">
<!-- 부트스트립 js/css 루트 -->
<script src="${path}/resources/js/test.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="${path}/resources/js/bootstrap.bundle.min.js"></script>


<link href="${path}/resources/css/jumbotron.css" rel="stylesheet" />
<link href="${path}/resources/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>



<body>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<a class="navbar-brand" href="#">Baskin-Robbins 31</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">공지사항
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">뉴스</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">토론</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown01"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">드롭다운</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<main role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">API 뿌릴 곳</h1>
				<p>This is a template for a simple marketing or informational
					website. It includes a large callout called a jumbotron and three
					supporting pieces of content. Use it as a starting point to create
					something more unique.</p>
				<p>
					<a class="btn btn-primary btn-lg" href="#" role="button">Learn
						more &raquo;</a>
				</p>
			</div>
		</div>
		<div class="side-menu">
			<div class="container">
				<h3>로그인</h3>
				<p>
					<a class="btn btn-secondary" href="login" role="button">임시 로그인 버튼 &raquo;</a>
				</p>
			</div>
		
		</div>

		<div class="container">
			<!-- Example row of columns -->
			<div class="row">
				<div class="col-md-4">
					<h2>BEST_뉴스</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details &raquo;</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>BEST_토론</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details &raquo;</a>
					</p>
				</div>
				<div class="col-md-4">
					<h2>BEST_팁</h2>
					<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
						in, egestas eget quam. Vestibulum id ligula porta felis euismod
						semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details &raquo;</a>
					</p>
				</div>
			</div>

			<hr>

		</div>
		<!-- /container -->
	</main>
<footer class="footer mt-auto py-3">
  <div class="container">
    <span class="text-muted">Place sticky footer content here.</span>
  </div>
</footer>

</body>
</html>
