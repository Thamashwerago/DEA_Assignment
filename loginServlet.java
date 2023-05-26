package com.example.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class loginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String loginOption = request.getParameter("loginOption");
        String loginInput = request.getParameter("loginInput");
        String password = request.getParameter("password");

        // Perform your login authentication logic here
        // You can access the loginOption, loginInput, and password values and process them as needed

        // For example, you can check if the loginInput and password are valid
        boolean isValidLogin = validateLogin(loginOption, loginInput, password);

        if (isValidLogin) {
            // Redirect to the success page or perform further actions
            response.sendRedirect("success.jsp");
        } else {
            // Redirect to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
    }

    private boolean validateLogin(String loginOption, String loginInput, String password) {
        // Add your login validation logic here
        // This is just a sample implementation to demonstrate the flow

        if (loginOption.equals("email") && loginInput.equals("example@example.com") && password.equals("password")) {
            return true;
        } else if (loginOption.equals("phone") && loginInput.equals("123-456-7890") && password.equals("password")) {
            return true;
        }

        return false;
    }
}
