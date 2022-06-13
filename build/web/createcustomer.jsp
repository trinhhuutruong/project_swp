<%-- 
    Document   : createcustomer
    Created on : Jun 6, 2022, 10:52:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
    </head>
    <body>
        <div>
            <div class="container-login100" style="background-image: url('images/bg-01.jpg') "</div>

            <form action="CreateCustomer" method="get">
                <h1 style="background-color: #ff6699;align-items: flex-start; font-size: 40px;margin-top:30px;border-radius: 10px;text-align: center;padding: 20px" >Tạo Mới Thông Tin Khách Hàng </h1></br>
                
                <div width="700" height="500" border="2" cellpaddixng="5" style="border-radius: 10px;background-color: #ff9999;max-width: 50rem;padding:20px;margin: 10px"></br>
                    
                        
                        <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Khách Hàng:</p><input type="text" name="customerID" placeholder="Nhập Mã Món Đồ" style="width: 700px;height: 30px;border-radius: 10px;border-color: #000;padding: 20px"/></br>
                        
                    
                   
                        <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Họ Và Tên:</p><input type="text" name="fullName" placeholder="Nhập Tên Món Đồ" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>
                    
                        
                        <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Số Điện Thoại:</p><input type="text" name="phoneNumber" placeholder="Nhập Số Điện Thoại" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                        <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Địa Chỉ:</p><input type="text" name="address" placeholder="Nhập Mã Cửa Hàng" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                        <input type="submit" name="action" value="Tiếp" style="color:green;width: 700px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px"/>
                    
                </div>
            </form>
        </div>
    </body>
</html>
