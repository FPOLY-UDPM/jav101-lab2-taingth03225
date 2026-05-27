package bai2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bai2/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Gán thông điệp chào mừng vào request attribute
        req.setAttribute("message", "Welcome to FPT Polytechnic");

        // Tạo Map chứa thông tin user
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyen gia tai");
        map.put("gender", "nam");
        map.put("country", "ho chi minh");

        // Gán map user vào request attribute
        req.setAttribute("user", map);

        // Chuyển hướng đến file JSP để hiển thị
        req.getRequestDispatcher("/bai_2/page.jsp").forward(req, resp);
    }
}
