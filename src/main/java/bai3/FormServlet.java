package bai3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bai3/form")
    public class FormServlet extends HttpServlet {

    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                // Tạo dữ liệu mặc định để hiển thị lên form
                Map<String, Object> map = new HashMap<>();
                map.put("fullname", "Nguyen Gia Tai");
                map.put("gender", true); // true là Nam
                map.put("country", "VN");
                req.setAttribute("user", map);
                 req.setAttribute("isEdit", true); // Cho phép sửa
                 req.getRequestDispatcher("/bai_3/form.jsp").forward(req, resp);
             }
             @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                 // Nhận dữ liệu từ form gửi lên
                 req.setCharacterEncoding("UTF-8"); // Để không bị lỗi font tiếng Việt
                 String fullname = req.getParameter("fullname");
                 String gender = req.getParameter("gender");
                 String country = req.getParameter("country");

                // In ra console để kiểm tra
                 System.out.println("Fullname: " + fullname);
                 System.out.println("Gender: " + gender);
                 System.out.println("Country: " + country);

                 // Gửi lại dữ liệu vừa nhận để hiển thị lên form sau khi nhấn Submit
                Map<String, Object> map = new HashMap<>();
                map.put("fullname", fullname);
                map.put("gender", gender.equals("true"));
                map.put("country", country);

                req.setAttribute("user", map);
                req.getRequestDispatcher("/bai_3/form.jsp").forward(req, resp);
             }
    }
