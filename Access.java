public class Access {
    public static void main(String args[]){
        System.out.println("hii this said sandesh");
        Alpha A1=new Alpha();
        A1.name="BAckend";
        A1.changepass("Sandesh an digital ai");
    }
}

class Alpha{
    public String name;
    private String password;
    public void changepass(String pass){
        password=pass;
        System.out.println(this.password);
    }
}
