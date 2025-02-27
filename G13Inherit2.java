public class G13Inherit2 {
    public static void main(String args[]){
        Java12 j = new Java12();
        j.speak();
        j.run();
        j.sleep();
        j.ask();
        j.speak();
        j.run();
        j.sleep();
        j.ask();
        j.speak();
        j.run();
        j.sleep();
        j.ask();
    }
}
class Java123{
    void run(){
        System.out.println("Running");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    void ask(){
        System.out.println("Asking");
    }
}
class Java12 extends Java123{
    void speak(){
        System.out.println("Speaking");
    }
}
