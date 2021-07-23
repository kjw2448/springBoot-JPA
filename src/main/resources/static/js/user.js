let index = {
	init:function(){
		$("#btn-save").on("click", ()=>{ // function(){} 대신 ()=> this를 바인딩하기 위해!!
			this.save();
		});
		$("#btn-login").on("click", ()=>{ // function(){} 대신 ()=> this를 바인딩하기 위해!!
			this.login();
		});	
	},
	
	save:function(){
		//alert('user의 save 호출');
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		}
		
		// console.log(data);
		// ajax호출시 default가 비동기 호출
		// ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!
		// ajax가 통신을 성공하고 서버가 json을 티너해주면 자동으로 자바 오브젝트로 변환해준다.
		$.ajax({
			type:"POST",
			url:"/api/user",
			data:JSON.stringify(data), // http body 데이터
			contentType:"application/json; charset=utf-8", // body 데이터 타입(MIME 타입)
			dataType:"json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 json이라면) => javascript 오브젝트로 변경
		}).done(function(resp){
			alert("회원가입이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		}); // ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
	},
	
	login:function(){
		//alert('user의 save 호출');
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
		}
		
		$.ajax({
			type:"POST", //GET 방식은 주소에 로그인 정보가 남아서 위험
			url:"/api/user/login",
			data:JSON.stringify(data), // http body 데이터
			contentType:"application/json; charset=utf-8", // body 데이터 타입(MIME 타입)
			dataType:"json" // 요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열 (생긴게 json이라면) => javascript 오브젝트로 변경
		}).done(function(resp){
			alert("로그인이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		}); // ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청
	}
}

index.init();