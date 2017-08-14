<template>
	<div>
		<div style="min-width: 700px;" >
		  <img src="../assets/booking_logo.png" alt="book" class="book"/>
      <div class="div" >
        <form name="myForm">
        	<!-- NAME -->
        	<div class="form-group" v-bind:class="{ 'form-group--error': $v.name.$error }">
	        	<label class="date" >Your name</label>
	        	<input class="tbox" onclick="validations()" v-model.trim="name" @input="$v.name.$touch()">
		 			</div>
		 			<span class="form-group__message" v-if="!$v.name.minLength">Name must have at least {{$v.name.$params.minLength.min}} letters.</span>	 				
	 					 <!-- EMAIL -->
	 				<div class="form-group" v-bind:class="{ 'form-group--error': $v.email.$error }">
	          <label class="date"> Email address </label>
	          <input class="tbox" type="email" v-model.trim="email" @input="$v.email.$touch()">
	 			  </div>
	 			  <span class="form-group__message" v-if="!$v.email.minLength">Email must have at least {{$v.email.$params.minLength.min}} letters.</span>	
	 			  <span class="form-group__message" v-if="!$v.email.email">Format: [your_email]@[domain_email].[domain]</span>		
	         <!-- <input type="email" name="emailaddres" class="tbox" v-model="email"/> -->
	         <!-- PASS -->
	         <div class="form-group" v-bind:class="{ 'form-group--error': $v.password.$error }">
	           <label class="date">Password</label>
	           <input class="tbox" type="password" v-model.trim="password" @input="$v.password.$touch()">
	 				 </div>
	 				 <!--<span class="form-group__message" v-if="!$v.password.required">Field is required</span>-->
	 				 <span class="form-group__message" v-if="!$v.password.minLength">Password must have at least {{$v.password.$params.minLength.min}} letters.</span>
	 				 <!-- BUTTON -->
	 				<div class="form-group" v-bind:class="{ 'form-group--error': $v.password.$error }">
	          <b-btn  onclick="myFunction()" type="submit" class="book_btn" v-b-modal.modal1>REGISTER</b-btn>
	          <a class="text" href="/login2">You already have an account?</a>
          </div>
        </form>
      </div>
	</div>
	</div>
</template>
<script>
	import { required, minLength, email } from 'vuelidate/lib/validators'
	export default {
	  name: 'login',
	  data () {
	    return {
	      name: '',
	      email: '',
	      password: ''
	    }
	  },
	//<methods: {
		validations: {
	      name: {
	        required,
	        minLength: minLength(5)
	      },
	      email: {
	      	required,
	      	minLength: minLength(6), email
	   		 },
	      password: {
	        required,
	        minLength: minLength(8)
	      }
	  }
	}

</script>

<style>
	

	/*intrebarea*/
	a.text{

	    text-align: center;
	    font-size: 20px;
	    margin-top: 20px;

	}
	.book_btn{
	    text-decoration:none;
	    font-size: 20px;
	    width: 405px;
	    height: 50px;
	    vertical-align: middle;
	    background-color: #c97ce5;
	    color: white;
	    border: none;
	    border-radius: 3px;
	    margin-top: 33px;

	}
	/* nume email si pass*/
	.date{

	    font-size:20px;
	    margin-bottom: 3px;
	    height: 30px;
	    float: left;
	    margin-top: 2px;



	}
	/*box*/
	.tbox{

	    font-family: Open Sans, sans-serif;
	    width: 400px;
	    height: 50px;
	    border-radius: 3px;
	    border: 1px solid #B3B3B3;
	    font-size: 25px;



	}
	/*divul mare*/
	.div{

	    font-family: 'Open Sans', sans-serif;
	    width: 405px;
	    margin: 0 auto;
	    position: relative;
	    top :60px;



	}
	.book{
    height:270px;
    width:500px;
    margin: 0 auto;
  	margin-top: 60px;

	}
	div{
		text-align: center;
	}

	.submit_button {
		cursor: pointer;
	}
	.form-group__message{

		color: #e52626;
		

	}
</style>

