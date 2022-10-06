# **Đề Bài:** 
    Cho một mảng các số nguyên, trả về các chỉ số của hai số có tổng bằng một mục tiêu đã cho.

**PHƯƠNG PHÁP 1. Sử dụng hai vòng lặp for**

    Cách tiếp cận đơn giản là chỉ sử dụng hai vòng lặp for lồng nhau 
    và kiểm tra xem tổng của hai phần tử bất kỳ trong mảng có bằng với mục tiêu đã cho hay không.

**PHƯƠNG PHÁP 2. Sử dụng HashMap (Hiệu quả nhất)**

    Khởi tạo một HashMap trống.
    Lặp lại các phần tử của mảng.
    Đối với mọi phần tử trong mảng 
        Nếu phần tử tồn tại trong Bản đồ, thì hãy kiểm tra xem phần tử đó có target - elementtồn tại trong Bản đồ hay không. Nếu phần bổ sung tồn tại thì trả về các chỉ số của phần tử hiện tại và phần bổ sung.
        Nếu không, hãy đưa phần tử vào Bản đồ và chuyển sang lần lặp tiếp theo.

**PHƯƠNG PHÁP 3. Sử dụng Sắp xếp cùng với cách tiếp cận hai con trỏ**

    Sắp xếp mảng.
    Khởi tạo hai biến, một biến trỏ đến đầu mảng ( left) và một biến khác trỏ đến cuối mảng ( right).
    Lặp lại cho đến khi left < rightvà cho mỗi lần lặp lại
        nếu arr[left] + arr[right] == target, sau đó trả về các chỉ số.
        nếu arr[left] + arr[right] < target, tăng chỉ số bên trái.
        khác, giảm chỉ số bên phải.