<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
<script type="text/javascript">

      function checkFname()
     
     {
		var f=document.frm.fname.value;
		var reg=/^[A-Za-z]+$/;
		
		if(f=="")
			
			{
			   document.getElementById("fname").innerHTML="Please enter first name";
			}
		
		else if(!reg.test(f))
			
			{
			  document.getElementById("fname").innerHTML="Please enter only alphabets"
			}
		
		else
			
		   {
		       document.getElementById("fname").innerHTML="";
		   }	
	 }
      
      
      function checkLname()
      
      {
    	   var f=document.frm.lname.value;
    	   var reg=/^[A-Za-z]+$/;
    	  
    	   if(f=="")
    		   
    		 {
    		     document.getElementById("lname").innerHTML="Please enter last name";
    		 }
    	   
    	   else if(!reg.test(f))
    		   
    		{
    		   document.getElementById("lname").innerHTML="Please enter only alphabets"; 
    	    }
    	   
    	   else
    		   
    		 {
    		   document.getElementById("lname").innerHTML="";
    		 }
     }
      
        function checkEmail()
      
           {
    	       var f=document.frm.email.value;
    	       var reg=/^[A-Za-z0-9-_.]+@[A-Za-z]+\.[A-Za-z]{2,4}$/;
    	  
    	   if(f=="")
    		   
    		 {
    		     document.getElementById("email").innerHTML="Please enter email";
    		 }
    	   
    	   else if(!reg.test(f))
    		   
    		{
    		   document.getElementById("email").innerHTML="Please enter valid email"; 
    	    }
    	   
    	   else
    		   
    		 {
    		   document.getElementById("email").innerHTML="";
    		 }
     }
        
           function checkMobile()
        
         {
 	          var f=document.frm.mobile.value;
 	          var reg=/^[0-9]{10}$/;
 	  
 	     if(f=="")
 		   
 		   {
 		       document.getElementById("mobile").innerHTML="Please enter Mobile ";
 		   }
 	   
 	    else if(!reg.test(f))
 		   
 		  {
 		       document.getElementById("mobile").innerHTML="Please enter 10 digits only"; 
 	      }
 	   
 	    else
 		   
 		   {
 		       document.getElementById("mobile").innerHTML="";
 		   }
     }
     
              function checkPassword()
       
         {
	          var f=document.frm.password.value;
	          var reg=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
	  
	    if(f=="")
		   
		   {
		       document.getElementById("password").innerHTML="Please enter password";
		   }
	   
	    else if(!reg.test(f))
		   
		  {
		     document.getElementById("password").innerHTML="Min 1 Digit, Upper, Lower & Special(8,15)"; 
	      }
	   
	    else
		   
		  {
		     document.getElementById("password").innerHTML="";
		  }
  }
 
       
       

      
      
</script>
</head>
<body>

<form name="frm" method="post" action="">
  <table cellpadding="4px" cellspacing="6px" >
     <tr>
      
        <td>First Name</td>
        <td><input type="text" name="fname" onblur="checkFname();"></td>
        <td><span id="fname"></span></td>
        
     
     </tr>
     
     <tr>
      
        <td>Last Name</td>
        <td><input type="text" name="lname" onblur="checkLname();"></td>
        <td><span id="lname"></span></td>
     
     </tr>
     
     <tr>
      
        <td>Email</td>
        <td><input type="text" name="email" onblur="checkEmail();"></td>
        <td><span id="email"></span></td>
     
     </tr>
     
     
     <tr>
      
        <td>Mobile</td>
        <td><input type="number" name="mobile" onblur="checkMobile();"></td>
        <td><span id="mobile"></span></td>
     </tr>
     
     <tr>
      
        <td>Address</td>
        <td><textarea rows="5" cols="21" name="address"></textarea></td>
     
     </tr>
     
     <tr>
     
        <td>Gender</td>
        <td>
            <input type="radio" name="gender" value="male">Male
            <input type="radio" name="gender" value="female">Female
        </td>
        
     </tr>   
        
     <tr>
        
        <td>Hobby</td>
        <td> 
          <input type="checkbox" name="hobby" value="music">Music<br>
          <input type="checkbox" name="hobby" value="writing">Writing<br>
          <input type="checkbox" name="hobby" value="reading">Reading<br>
          <input type="checkbox" name="hobby" value="traveling">Traveling<br>
          <input type="checkbox" name="hobby" value="cricket">Cricket<br>
        </td>  
          
     </tr>
     
     <tr>
       
         <td>Education</td>
         <td>
         
            <select name="education">
            <option>-----Select Education-----</option>
            <option value="10th">10th</option>
            <option value="12th">12th</option>
            <option value="be/b.tech">BE/B.Tech</option>
            <option value="b.sc">B.SC</option>
            <option value="m.sc">M.SC</option>
            <option value="bca">BCA</option>
            <option value="mca">MCA</option>
            
            </select>
        </td> 
           
     </tr>    
     <tr>
     
         <td>Birth Date</td>
         <td><input type="Date" name="bday"></td>
      </tr>      
      <tr>
      
          <td>Resume</td>
          <td><input type="file" name="resume"></td>      
      </tr>
      <tr>
      
          <td>Password</td>
          <td><input type="password" name="password" onblur="checkPassword();"></td>  
          <td><span id="password"></span></td>    
      </tr>
      <tr>
      
          <td>Confirm Password</td>
          <td><input type="password" name="cpassword"></td>      
      </tr>
      <tr>
      
          <td colspan="2" align="center">
          
           <input type="submit" name="action" value="SUBMIT">
          </td>
                
      </tr>
         
     
     
</table>


</form>





</body>
</html>