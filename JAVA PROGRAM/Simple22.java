class A{

public int data;

 A(){System.out.println("Hello java"); data=40;}

}

class Simple22{

public static void main(String args[]){

A obj=new A();

System.out.println(obj.data);

obj.A();

}

}