## Module in Module

Khi một project build thành lib cho project khác sử dụng.

Việc lựa chọn file .class nào được xử dụng có thể được ghi đè từ chính project cần chay.

Ví dụ:

Module1 thực hiện tính toán và đưa ra một service: Calculator

Module2 cũng thực hiện tính toán và cũng muốn tận dụng lại Service của Calculator.

thì có thể tận dụng lại hoặc ghi đè lại chính Service Calculator.

