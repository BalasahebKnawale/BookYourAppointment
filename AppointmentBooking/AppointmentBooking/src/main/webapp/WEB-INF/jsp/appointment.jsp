<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Appontment</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"
	type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<link href="/css/material.css" rel="stylesheet">

</head>
<body>

	<div class="container">
		<div>
			<h2 style="color: green;">${msg}</h2>
			<h2 style="color: red;">${msgfail}</h2>

		</div>
		<br>
		<div class="row">
		   <div class="col-md-6 offset-md-3">
		      <div class="card" >
		        <div class="card-header">
   					 <h2  class="card-title text-center">Add Appointment</h2>
 				 </div>
			  <div class="card-body">
			  <form name="frm" method="post" action="save" enctype="multipart/form-data" >
	
				<div class="box">
					
					<div class="form-group">
						<label for="description">Name</label>
						<input type="text" class="form-control" name="name" id=""/>
					</div>
					<div class="form-group">
						<label for="description">Age</label>
						<input type="text" class="form-control" name="age" id=""/>
					</div>
					<div class="form-group">
						<label for="description">DOB</label>
						<input type="date" class="form-control" name="dob" id=""/>
					</div>
					<div class="form-group">
						<label for="description">Blood group</label>
						<input type="text" class="form-control" name="blood" id=""/>
					</div>
					<div class="form-group">
						<label for="description">Address</label>
						<input type="text" class="form-control" name="address" id=""/>
					</div>
					<div class="form-group">
						<label for="description">Mobile</label>
						<input type="text" class="form-control" name="mobile" id=""/>
					</div>
					<div class="form-group">
						<label for="description">Email</label>
						<input type="text" class="form-control" name="email" id=""/>
					</div>
					<div class="form-group">
						<label for="description">DOA</label>
						<input type="date" class="form-control" name="doa" id=""/>
					</div>
					<div class="form-group">
						<label class="control-label " for="file">Upload File:</label> <input
							class="form-control" type="file"  name="afile" />
					</div>
					<div class="form-group">
						<button type="submit"  class="btn btn-primary">Submit</button>
					</div>
			</div>
			</form>

			  </div>
			</div>
		   
		   
			
		   </div>
		</div>
	</div>
</body>
</html>