package Inheritance;

class students {
    private String name ;

    public void setname (String name ) {
        this.name = name ;
    }

    public String getname() {
        return name ;
    }
}

public class basic1 {
    public static void main(String[] args) {
        students s = new students () ;
        s.setname("Rocket");
        System.out.println(s.getname());
    }
}
