
interface i{
    void add();
    void sub();
}

interface j{
    void mul();
    void div();
}

interface k extends i,j{
    //multiple inheritance yes ----> marker interface (will not have any methods) but extends methods will have
}

interface x{
     abstract void abc();//it must contain only one abstract method
 // void xyz();
}


public class feature2 {

    //3 types of inheritance 
    //1) Normal Interface : can have any no of abstract methods
    //2)functional : will on only single abstract methods (SAM ): runnable
    //3)marker  : will not have any abstract methods  (no abstract methods)
    
}
