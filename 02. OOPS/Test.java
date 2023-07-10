class A{
    void show(){
        System.out.println("A");
    }

    void showA(){
        System.out.println(" show-A");
    }
}

class B extends A{
    void show(){
        System.out.println("B");
    }

    void showB(){
        System.out.println(" show-B");
    }
}

class C extends B{
     void show(){
        System.out.println("C");
    }

    void showC(){
        System.out.println(" show-C");
    }

    void showViaSuper (){
        super.show();
    }
    
}



class Re{
    // e means error 
    public static void main(String[] args) {
        A aa=new A();
        aa.show();  //A
        aa.showA();   // show-A
        // aa.showB();  e
        // aa.showC();  e

        A ab=new B();
        ab.show(); //B
        ab.showA(); //show-A
        // ab.showB();   e
        // ab.showC();    e

        // B ba=new A();
        // Type mismatch: cannot convert from A to B
        B bc=new C(); 
        bc.show();  // C
        bc.showA();  //  show-A

        bc.showB();  //  show-B
        // bc.showC();   e 

        C cc=new C();
        cc.showA();  // show-A
        cc.showB();   // show-B
        cc.showC();   //  show-C
        cc.showViaSuper();  // B

        A ac=new C();

        ac.showA();
        // ac.showB(); //e
        ac.show();

      
    }
}


  






