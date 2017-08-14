<template>
	<div >
		<div >
		  <img src="../assets/booking_logo.png" alt="book" class="book"/>
      <div class="div">
        <form>
          <div class="form-group" v-bind:class="{ 'form-group--error': $v.email.$error }">
	          <label class="date"> Email address </label>
	          <input class="tbox" type="email" v-model.trim="email" @input="$v.email.$touch()">
	 			  </div>
	 			  <span class="form-group__message" v-if="!$v.email.minLength">Email must have at least {{$v.email.$params.minLength.min}} letters.</span>	
	 			  <span class="form-group__message" v-if="!$v.email.email">Format: [your_name]@[domain_name].[domain]</span>		
	         <!-- <input type="email" name="emailaddres" class="tbox" v-model="email"/> -->
	         <!-- PASS -->
	         <div class="form-group" v-bind:class="{ 'form-group--error': $v.password.$error }">
	           <label class="date">Password</label>
	           <input class="tbox" type="password" v-model.trim="password" @input="$v.password.$touch()">
	 				 </div>
	 				 <!--<span class="form-group__message" v-if="!$v.password.required">Field is required</span>-->
	 				 <span class="form-group__message" v-if="!$v.password.minLength">Password must have at least {{$v.password.$params.minLength.min}} letters.</span>
          <b-btn type="submit" class="book_btn" v-b-modal.modal1>LOGARE</b-btn>
          <a class="text" href="/login3"> Recover password</a>
        </form>
      </div>
	</div>
	</div>
</template>

<script>
	import { required, minLength, email } from 'vuelidate/lib/validators'
	export default {
	  name: 'login2',
	  data () {
	    return {
	      email:'',
	      password: ''
	    }
	  },
	  validations: {
	      email: {
	      	required,
	      	minLength: minLength(6), 
	      	email
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
	    margin-top: 2px;
	    margin-bottom: 3px;
	    float: left;
	    height: 30px;


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
	    top :90px;

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