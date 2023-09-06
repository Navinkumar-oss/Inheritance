// Hierarchical Inheritance
class InheritanceC{
    void showA(){
        System.out.println("a class method");
        int a=30;
        int b=34;
        System.out.println("Multiple of a & b="+a*b);
    }
    public static void main(String[]args){
        InheritanceC obj1= new InheritanceC();
        obj1.showA();
        //obj1.showB();
        System.out.println("--------------------");
        B obj2=new B();
        obj2.showA();
        obj2.showB();
        System.out.println("--------------------");
        C obj3=new C();
        obj3.showA();
        //obj3.showB();
        obj3.showC();
    }
}
class B extends InheritanceC{
    void showB(){
        System.out.println("b class method");
    }
    
}
class C extends InheritanceC{
    void showC(){
        System.out.println("c class method");
        int a=89;
        int b=46;
        System.out.println(a+b);
    }
    
}