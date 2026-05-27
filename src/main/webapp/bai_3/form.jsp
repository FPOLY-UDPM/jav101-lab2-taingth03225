 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html>
 <head>
     <title>Bài 3 - Form Handling</title>
 </head>
 <body>
     <h2>THÔNG TIN CÁ NHÂN</h2>
    <form action="/Java_Web_Template/bai3/form" method="post">
            Họ và tên:
            <input type="text" name="fullname" value="${user.fullname}"> <br><br>

             Giới tính:
             <input type="radio" name="gender" value="true" ${user.gender ? 'checked' : ''}> Nam
             <input type="radio" name="gender" value="false" ${!user.gender ? 'checked' : ''}> Nữ <br><br>

             Quốc gia:
            <select name="country">
                 <option value="VN" ${user.country == 'VN' ? 'selected' : ''}>Việt Nam</option>
                 <option value="US" ${user.country == 'US' ? 'selected' : ''}>Mỹ</option>
                <option value="JP" ${user.country == 'JP' ? 'selected' : ''}>Nhật Bản</option>
             </select> <br><br>

             <button type="submit">Gửi thông tin</button>
         </form>

    <hr>
     <h3>Dữ liệu bạn vừa nhập:</h3>
    <ul>
             <li>Họ tên: ${user.fullname}</li>
             <li>Giới tính: ${user.gender ? 'Nam' : 'Nữ'}</li>
             <li>Quốc gia: ${user.country}</li>
    </ul>
 </body>
 </html>
