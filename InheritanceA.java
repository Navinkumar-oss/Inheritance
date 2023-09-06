// single Inheritance
class InheritanceA{
    void showA(){
        System.out.println("a class method");
        int a=30;
        int b=34;
        System.out.println("Multiple of a & b="+a*b);
    }
    public static void main(String[]args){
        InheritanceA obj1= new InheritanceA();
        obj1.showA();
        //obj1.showB();
        System.out.println("--------------------");
        B obj2=new B();
        obj2.showA();
        obj2.showB();
    }
}
class B extends InheritanceA{
    void showB(){
        System.out.println("b class method");
    }
    
}