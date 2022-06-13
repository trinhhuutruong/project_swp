<%-- 
    Document   : createbill
    Created on : Jun 6, 2022, 10:51:35 PM
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

            <form action="CreateBill" method="get">
                <h1 style="background-color: #ff9999;align-items: flex-start; font-size: 40px;margin-top:30px;border-radius: 10px;text-align: center;padding: 20px" >Thông Chi Tiết Cầm Đồ </h1></br>

                <div width="700" height="500" border="2" cellpaddixng="5" style="border-radius: 10px;background-color: #ff9999;max-width: 50rem;padding:20px;margin: 10px"></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Đơn:</p><input type="text" name="billID" placeholder="Nhập Mã Đơn" style="width: 700px;height: 30px;border-radius: 10px;border-color: #000;padding: 20px"/></br>



                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Món Đồ:</p><input type="text" name="itemID" placeholder="Nhập Mã Món Đồ" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Số Tiền Cầm:</p><input type="text" name="pawnMoney" placeholder="Nhập Số Tiền Cầm" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Số Ngày Cầm:</p><input type="text" name="numberDays" placeholder="Nhập Số Tiền Cầm" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"></br>


                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Lãi Suất:</p><input type="text" name="interestRate" placeholder="Nhập Số Lãi Suất" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Ngày tạo Bill:</p><input type="date" name="billBeginDate"  style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>
                    <p style="font-size: 20px;border-radius: 10px;font-family: inherit">Mã Nhân Viên:</p><input type="text" name="staffID" placeholder="Nhập Mã Nhân Viên" style="width: 700px;height: 30px;border-radius: 10px;padding: 20px"/></br>

                    <div>
                        <input type="submit" value="Xem Trước Hợp Đồng" style="background: white;border-radius: 10px;padding: 20px;background-color: bisque;width: 345px;margin-top: 20px;padding: 20px;font-size: 20px"/>
                        <input type="submit" name="action" value="Tạo" style="color:green;width: 345px;background-color: beige;border-radius: 10px ;text-align: center;background-color: aqua;margin-top: 20px;padding: 20px;font-size: 20px"/>
                    </div>                    
                </div>
            </form>
        </div>
    </body>
</html>



