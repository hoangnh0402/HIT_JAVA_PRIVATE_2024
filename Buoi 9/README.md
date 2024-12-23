# HIT_JAVA_PRIVATE_2024
# GIỚI THIỆU MỘT CÁCH QUẢN LÝ KẾT NỐI JDBC NÂNG CAO
## Quản lý kết nối JDBC bằng Connection pooling
- Connection Pooling là một kỹ thuật được sử dụng để quản lý và tái sử dụng các kết nối đến Database
- Mục tiêu của Connection Pooling là tối ưu hóa việc quản lý kết nối, giảm thiểu tạo và đóng kết nối liên tục, cũng như cải thiện hiệu suất ứng dụng.
- Khi một ứng dụng Java tương tác với cơ sở dữ liệu thông qua JDBC, việc mở và đóng kết nối có thể gây tốn kém và làm giảm hiệu suất. Connection Pooling giải quyết vấn đề này bằng cách tạo sẵn một pool các kết nối đến cơ sở dữ liệu và cung cấp chúng cho ứng dụng khi cần. Khi ứng dụng đã sử dụng xong kết nối, nó không đóng nó mà chỉ trả lại kết nối đó vào pool để sử dụng lại.
## Áp dụng

- Xây dựng chuỗi kết nối

```java

    String user = "root";
    String password = "root";
    Stack<Connection> pools = new Stack<>();
    
    String url = "jdbc:mysql://localhost:3306/test";
    try {
      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(url, user, )password;
    } catch (Exception e) {
      e.printStackTrace();
    }

```

- Sử dụng pools quản lý chuỗi kết nối

```java 
public Connection getConnection() throws SQLException {
	if(this.pools.isEmpty()) {
		return DriverManager.getConnection(this.url, this.username, this.password);
	} else {
		return this.pools.pop();
	}
}
```

- Giải phóng kết nối và lưu vào pools
```java
public void releaseConnection(Connection con) throws SQLException {
    this.pools.push(conn);
}

```

- Dọn dẹp chương trình và đóng tất cả kết nối
```java
protected void finalize() throws Throwable{
    this.pools.clear();
    this.pools=null;
}
```