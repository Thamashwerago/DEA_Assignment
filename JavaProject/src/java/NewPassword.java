

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewPasswordServlet", urlPatterns = {"/newPassword"})
public class NewPassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confPassword");
        RequestDispatcher dispatcher = null;
        Connection con = null;

        if (!password.equals(confirmPassword)) {
            // Handle password mismatch error
            request.setAttribute("message", "Passwords do not match");
            dispatcher = request.getRequestDispatcher("newPassword.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Here you can update the user's password in the database

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
            System.out.println("Connection Successful");
            PreparedStatement pst = con.prepareStatement("UPDATE user SET password=? WHERE email=?");
            pst.setString(1, password);
            // Set the email of the user for which you want to update the password
            pst.setString(2, "user@example.com");

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Password updated successfully
                dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            } else {
                // Failed to update password
                request.setAttribute("message", "Failed to update password");
                dispatcher = request.getRequestDispatcher("resetPassword.jsp");
                dispatcher.forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Handle database errors
            e.printStackTrace();
            // You can set an error message and redirect to an error page here if needed
        } finally {
            // Close database connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
