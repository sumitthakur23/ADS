public class G13MethodOver {
    public static void main(String[] args) {
        Def d = new Def();
        d.baatein();
        d.good();
        Vinayak v = new Vinayak();
        v.baatein();    
        v.good();
    }
}

class Def {
    void baatein() {
        System.out.println("Def class baatein");
    }

    void good() {
        System.out.println("Def class good");
    }
}

class Vinayak extends Def {
    @Override
    void baatein() {
        System.out.println("Mai class mai baatein krta hu");
    }

    @Override
    void good() {
        System.out.println("good");
    }
}