sealed class A permits B,C { //restrict the class from extending by everyone 

}

sealed class B extends A permits D{

}

final class C extends A{

}

final class D extends B{ //if d try to extend A will give error
        
}


public class SealedClasses {
    public static void main(String[] args) {
        
    }
}
//13 fucking hours completed