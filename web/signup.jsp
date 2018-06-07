<%-- 
    Document   : signup
    Created on : 26 Feb, 2018, 6:50:34 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MovieWale</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href='http://fonts.googleapis.com/css?family=Pacifico|Dancing Script' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/signup.css" type="text/css">
        <link rel="stylesheet" href="css/sweetalert.css">
        <script src="js/sweetalert.min.js"></script>
    </head>
    <body>
        <div class="box">
            <h2>Sign Up</h2>
            <form action=""  method="post">
                <div class="inputBox">
                    <input type="text" name="" required="" class="form-control">
                    <label>Name</label>
                </div>
                <div class="inputBox">
                    <input type="text" name="" required="" onchange="checkmail(this.value)">
                    <label>Email</label>
                    <script>
                        function checkmail(id)
                    {
                        var email= /\S+@\S+\.\S+/;
                        if(email.test(id))
                        {
                           swal(
                              'Success!',
                             'Valid Email ',
                               'success'
                                      ) 
                        }
                        else
                          {
                          swal(
                          'Error!',
                          'Email is not valid!',
                          'error'
                           )
                          }
                    }
                    </script>
                </div>
                <div class="inputBox">
                    <input type="password" name="" required="" onchange="passwordcheck(this.value)" id="pass1">
                    <label>password</label>
                    <script>
                        function passwordcheck(pass) {
                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
                                
                                if(pass1.test(pass))
                                {
                                  swal(
                              'Success!',
                             'Valid Password ',
                               'success'
                                      )   
                                }
                                else
                                     {
                                     swal(
                                     'Error!',
                                     'Invalid Password!,"Password must contain at least one number,one special character and  have 6 to 16 valid characters"',
                                      'error'
                                       )
                                       }
                                   }
                                           
                    </script>
                </div>
                <div class="inputBox">
                    <input type="password" name="" required="" id="pass2" onchange="myFunction()">
                    <label>Confirm-password</label>
                    <script>
                         function myFunction() {
        var pass1 = document.getElementById("pass1").value;
        var pass2 = document.getElementById("pass2").value;
        if (pass1 != pass2) {
            //alert("Passwords Do not match");
            swal('Error!',
                 ' Password may be Different! ',
                 'error')
                         
        }
        else {
           swal('Success!',
                ' Password Match! ',
                'success') 
        }
    }
                    </script>
                </div>
                <div class="inputBox">
                    <input type="number" name="" required="" onchange="CheckIndianNumber(this.value)">
                    <label>Number</label>
                    <script>
                        function CheckIndianNumber(IndianNumber)
                         {
                      var Num = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
                       if(Num.test(IndianNumber))
                           {
                           swal(
                              'Success!',
                             'Valid Mobile Number',
                               'success'
                                      )
                                     }
                                      else
                                     {
                                     swal(
                                             'Error!',
                                             'Mobile number is not valid!',
                                                 'error'
                                                       )
                                                         }
                                                 }
                    </script>
                </div>
                
                <div class="inputBox">
                    <input type="text" name="" required="">
                    <label>City</label>
                </div>
                <div class="inputBox">
                    <input type="number" name="" required="">
                    <label>Pin-Code</label>
                </div>
                <input type="submit" name="" value="submit"><br><br>
                
                 
                
                    
            </form>
        
        </div>
    </body>
</html>
