public class G13Inheri {
    public static void main(String args[]) {
        Child c = new Child();
        c.setName("Java");
        c.setEmail("java@gmail.com");
        System.out.println(c.getName());
        System.out.println(c.getEmail());
    }
}
class Parent {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Child extends Parent {

}