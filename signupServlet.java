import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class signupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String signupOption = request.getParameter("signupOption");
        String signupInput = request.getParameter("signupInput");
        String password = request.getParameter("password");

        // Perform your sign-up logic here
        // You can access the signupOption, signupInput, and password values and process them as needed

        // For example, you can create a new user account with the provided details
        boolean isSignupSuccessful = createUserAccount(signupOption, signupInput, password);

        if (isSignupSuccessful) {
            // Redirect to the success page or perform further actions
            response.sendRedirect("success.jsp");
        } else {
            // Redirect to the sign-up page with an error message
            response.sendRedirect("signup.jsp?error=1");
        }
    }

    private boolean createUserAccount(String signupOption, String signupInput, String password) {
        // Add your sign-up logic here
        // This is just a sample implementation to demonstrate the flow

        // You can store the user account details in a database or perform other necessary actions
        System.out.println("Creating user account...");
        System.out.println("Signup Option: " + signupOption);
        System.out.println("Signup Input: " + signupInput);
        System.out.println("Password: " + password);

        return true; // Sign-up success
    }
}


