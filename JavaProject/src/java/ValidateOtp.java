import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ValidateOtpServlet", urlPatterns = {"/ValidateOtp"})
public class ValidateOtp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String otp = request.getParameter("otp");
        RequestDispatcher dispatcher = null;
        Connection con = null;

        if (otp == null || otp.equals("")) {
            // Handle empty OTP error
            dispatcher = request.getRequestDispatcher("verifyOtp.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Here you can compare the user-entered OTP with the OTP stored in the database
        // If the OTP is valid, you can allow the user to reset their password
        // If the OTP is invalid, you can display an error message and redirect them back to the OTP verification page

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
            System.out.println("Connection Successful");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM user WHERE otp=?");
            pst.setString(1, otp);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Valid OTP, allow user to reset password
                dispatcher = request.getRequestDispatcher("NewPassword.jsp");
                dispatcher.forward(request, response);
            } else {
                // Invalid OTP
                request.setAttribute("message", "Invalid OTP");
                dispatcher = request.getRequestDispatcher("verifyOtp.jsp");
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
