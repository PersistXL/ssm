package cn.persistXL.ssm.entity;

/**
 * @author persistXL
 * @data 2018/8/7 18:28
 */
public class UserBase {
    private int id;
    private String username;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "UserBase{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
