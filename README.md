# ỨNG DỤNG JOB FINDER
### Hỗ trợ tìm kiếm việc làm và tuyển dụng

---

**Lớp học phần:** 420300362101  
**Giảng viên hướng dẫn:** Võ Văn Hải  
**Sinh viên thực hiện:** Huỳnh Hoàng Phúc  
**MSSV:** 21036541
---
# Job Finder

Job Finder là một ứng dụng web được phát triển nhằm kết nối hiệu quả giữa ứng viên và nhà tuyển dụng. Hệ thống cung cấp các chức năng quản lý thông tin, tìm kiếm, gợi ý và hỗ trợ các bên liên quan, giúp tối ưu hóa quy trình tuyển dụng.

---

## 🎯 Mục Tiêu
- Tạo nền tảng giúp ứng viên và nhà tuyển dụng dễ dàng kết nối.
- Cung cấp các tính năng quản lý thông tin, gợi ý kỹ năng, tìm kiếm ứng viên và công việc.
- Hỗ trợ gửi thông báo qua email, nâng cao trải nghiệm người dùng.

---

## 💻 Công Nghệ Sử Dụng

- **Ngôn ngữ lập trình**: Java, HTML, CSS, JavaScript.
- **Backend Framework**: Spring Boot (Java).
- **Template Engine**: Thymeleaf.
- **Cơ sở dữ liệu**: MariaDB.
- **ORM**: JPA/Hibernate.
- **Giao diện**: Bootstrap.
- **Gửi email**: JavaMail.
- **Quản lý phụ thuộc**: Maven hoặc Gradle.
- **Quản lý phiên bản**: Git.

---

## 🔑 Chức Năng Chính

### 1. Quản lý ứng viên (Candidate)
- **Thêm, sửa, xem thông tin ứng viên**: Tên, ngày sinh, địa chỉ, kỹ năng, v.v.
- **Gợi ý kỹ năng**: Đưa ra kỹ năng cần cải thiện dựa trên hồ sơ.
- **Tìm kiếm ứng viên**: Lọc ứng viên dựa trên tên, kỹ năng, địa chỉ, v.v.

### 2. Quản lý công việc (Jobs)
- **Thêm, sửa, xem thông tin công việc**: Tên công việc, yêu cầu, mức lương, v.v.
- **Tìm kiếm công việc**: Dựa trên kỹ năng, từ khóa, công ty.

### 3. Quản lý công ty (Company)
- **Thêm, sửa, xem thông tin công ty**: Tên, địa chỉ, mô tả, danh sách công việc.
- **Gợi ý ứng viên phù hợp**: Phân tích yêu cầu và gợi ý ứng viên.
- **Gửi email**: Thông báo cơ hội việc làm.

### 4. Tìm kiếm và gợi ý
- **Tìm kiếm**: Ứng viên và công việc dựa trên các tiêu chí cụ thể.
- **Gợi ý**: Công việc phù hợp cho ứng viên và ứng viên phù hợp cho nhà tuyển dụng.

### 5. Gửi email
- **Thông báo cơ hội việc làm**: Tùy chỉnh nội dung email để gửi đến ứng viên.

---

## 🚀 Giao Diện Ứng Dụng
# 🏠 **Trang chủ**
**- **Giao diện chính**:** Hiển thị thông tin tổng quan về hệ thống và các chức năng chính.

![img_1.png](img_1.png)

# 🧑‍💼 **Candidates**
**🖥️ Giao diện chính Candidates**
- Đây là giao diện quản lý danh sách ứng viên, hiển thị toàn bộ thông tin cơ bản của các ứng viên.

![img_2.png](img_2.png)![img_3.png](img_3.png)

**🔍 Giao diện tìm kiếm thông tin Candidates**

- Giao diện cho phép tìm kiếm ứng viên dựa trên các tiêu chí như tên, kỹ năng, địa chỉ hoặc thông tin liên lạc.
- Kết quả tìm kiếm sẽ được hiển thị ngay sau khi nhấn nút `Search`.
- Nút `Clear` giúp xóa bộ lọc và hiển thị lại toàn bộ danh sách ứng viên.

![img_4.png](img_4.png)

**➕ Giao diện thêm mới một ứng viên**

- Người dùng có thể thêm thông tin ứng viên mới bao gồm name, date of birth, phone, email, address, skills
- Nhấn nút `Add Candidate` để lưu thông tin mới.
- Nút `Back to List` để quay lại danh sách ứng viên.
- Sau khi thêm mới, hệ thống sẽ tự động chuyển về trang danh sách ứng viên.

![img_6.png](img_6.png)
Hình 6: 📋 Giao diện các kỹ năng được đề xuất của một ứng viên

Giải thích: Hiển thị danh sách các kỹ năng mà hệ thống đề xuất để ứng viên cải thiện hoặc bổ sung.

Hình 7: ✏️ Giao diện cập nhật thông tin của một ứng viên

Giải thích: Người dùng có thể chỉnh sửa các thông tin đã lưu của ứng viên, đảm bảo dữ liệu luôn chính xác.

Hình 8: 📄 Giao diện thông tin chi tiết của một ứng viên

Giải thích: Hiển thị chi tiết toàn bộ thông tin của ứng viên, bao gồm kỹ năng, kinh nghiệm, và thông tin cá nhân.

Hình 9: 💼 Giao diện đề xuất công việc dựa vào kỹ năng của một ứng viên

Giải thích: Cung cấp danh sách các công việc phù hợp với kỹ năng và hồ sơ của ứng viên.

3.3. Giao diện Jobs
Hình 10: 🖥️ Giao diện chính Jobs

Giải thích: Hiển thị danh sách công việc đang tuyển dụng với các thông tin cơ bản như tên công việc, yêu cầu và mức lương.

Hình 11: ➕ Giao diện thêm thông tin của một công việc

Giải thích: Nhà tuyển dụng có thể nhập chi tiết thông tin công việc mới bao gồm mô tả, yêu cầu kỹ năng, và mức lương.

Hình 12: 🔍 Giao diện tìm kiếm thông tin Jobs

Giải thích: Cho phép tìm kiếm công việc dựa trên từ khóa, kỹ năng, hoặc công ty liên quan.

Hình 13: 📄 Giao diện thông tin chi tiết của một công việc

Giải thích: Hiển thị đầy đủ thông tin chi tiết của công việc như yêu cầu, địa điểm và chế độ đãi ngộ.

Hình 14: ✏️ Giao diện cập nhật thông tin của một công việc

Giải thích: Nhà tuyển dụng có thể chỉnh sửa thông tin của công việc đã đăng để phù hợp với nhu cầu thực tế.

Hình 15: 📊 Giao diện các công việc đang tuyển với một kỹ năng nào đó

Giải thích: Hiển thị danh sách công việc phù hợp với kỹ năng được chọn.

Hình 16: 🧑‍💼 Giao diện gợi ý ứng cử viên phù hợp với công việc đang tuyển

Giải thích: Danh sách ứng viên phù hợp được hệ thống gợi ý dựa trên yêu cầu của công việc.


## 📌 Định Hướng Phát Triển

- Phát triển ứng dụng di động cho Android/iOS.
- Tích hợp trí tuệ nhân tạo (AI) để gợi ý thông minh hơn.
- Nâng cấp giao diện bằng React hoặc Vue.js.
- Hỗ trợ đa ngôn ngữ.
- Tối ưu hiệu suất hệ thống.

---

**🌟 Job Finder - Kết nối cơ hội, nâng tầm sự nghiệp!**