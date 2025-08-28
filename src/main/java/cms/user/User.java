package cms.user;

public abstract class User {
    private int Id;
    private String Nome;
    private String Email;
    private String Password;

    public User(int Id,String Nome,String Email, String Password){
        this.Id = Id;
        this.Nome = Nome;
        this.Email = Email;
        this.Password = Password;

    }
    public int getId(){
        return Id;
    }
    public String Nome(){
        return Nome;
    }
    public String Email(){
        return Email;
    }
    public String Password(){
        return Password;
    }
    public boolean checkpassword(String senha){
        return this.Password.equals(senha);
    }
}
