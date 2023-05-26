<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f4e8; /* Creamy yellow background */
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            width: 400px;
            height: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            position: relative;
            overflow: hidden; /* Added to hide overflowing corners */
        }

        .container:before,
        .container:after {
            content: "";
            position: absolute;
            top: -10px;
            width: 20px;
            height: 20px;
            background-color: #fff; /* Changed to match the background color */
            border-radius: 10px; /* Changed to match the border radius */
        }

        .container:before {
            left: -10px;
        }

        .container:after {
            right: -10px;
        }

        h2 {
            text-align: center;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        select,
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box; /* Added to include padding and border in width */
        }

        input[type="submit"] {
            width: 100%;
            padding: 8px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 16px; /* Added margin to create a gap below other elements */
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
    <script>
        function handleSelection() {
            var signupInput = document.getElementById("signupInput");
            var signupLabel = document.getElementById("signupLabel");
            var signupOption = document.getElementById("signupOption").value;

            if (signupOption === "email") {
                signupLabel.innerText = "Enter your email:";
                signupInput.placeholder = "example@example.com";
                signupInput.pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
                signupInput.title = "Enter a valid email address";
                signupInput.type = "email";
            } else if (signupOption === "phone") {
                signupLabel.innerText = "Enter your phone number:";
                signupInput.placeholder = "123-456-7890";
                signupInput.pattern = "[0-9]{10}";
                signupInput.title = "Enter a 10-digit phone number";
                signupInput.type = "tel";
            }
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>Sign Up</h2>
        <form action="SignupServlet" method="post">
            <label for="signupOption">Sign Up Option:</label>
            <select id="signupOption" name="signupOption" onchange="handleSelection()">
                <option value="email" selected>Email</option>
                <option value="phone">Phone Number</option>
            </select><br><br>

            <label id="signupLabel" for="signupInput">Enter your email or phone number:</label>
            <input type="text" id="signupInput" name="signupInput" required><br><br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>

            <input type="submit" value="Sign Up">
        </form>
    </div>
</body>
</html>

