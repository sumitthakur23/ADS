import java.util.LinkedList;
public class JavaKingsG13 {
    public static void main(String[] args) {
        try{
        LinkedList<Object> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add(1);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("I am outside exception");
        }
        
    }
}

