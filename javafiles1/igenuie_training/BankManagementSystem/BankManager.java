package BankManagementSystem;

public class BankManager {
    private static User[] users = new User[5];
    public static void adduser(User user){
    if(User.userCount <=5){
        users[User.userCount - 1] = user;
    }
}
public static User getaccountno(int accno){
    for(User user : users){
        if(user.getAccountNumber() == accno){
            return user;
        }
    }
    return null;
}
}