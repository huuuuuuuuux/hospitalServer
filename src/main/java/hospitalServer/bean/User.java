package hospitalServer.bean;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/

public class User {
    private String userId;
    private String userPwd;
    private String userName;
    private int userAge;
    private boolean userSex;

    public User() {
    }

    public User(String userId, String userPwd, String userName, int userAge, boolean userSex) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex=" + userSex +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public boolean isUserSex() {
        return userSex;
    }

    public void setUserSex(boolean userSex) {
        this.userSex = userSex;
    }
}