package accounts;
public class UserAccount implements Account{
    accounttype="user";
    private String username;
    private String password;
    private checkingAccount c;
    private savingAccount s;
    

    UserAccount(String username, String password){
        
        this.username=username;
        this.password=password;
        c=new chechkingAccount();
        s=new savingAccount(); 
    }
    public String getUserName(){
        return username;
    }
    public void changeUserName(String newname){
        username=newname;
    }
    public boolean changePassword(String password, String newPassword){
        if(this.password.equals(password)){
            password=newPassword;
            return true;
        }
        return false;  
    }
}