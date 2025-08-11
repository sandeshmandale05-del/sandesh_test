package OOPS;
// import java.util.Scanner;

// public class Objects{
//     public static void main(String args[]){
//       Animal a1=new Animal();
//       a1.setname("Sandesh");
//       System.out.println(a1.getname());

//       a1.settype("omnivorus");
//       System.out.println(a1.gettype());
//     }
// }

// class Animal{
//      private String name;
//      private String type;

//      void setname(String newname){
//         this.name=newname;
//     } 

//     String getname(){
//         return this.name;
//     }

//     void settype(String type){
//         this.type=type;
//     }

//     String gettype(){
//         return this.type;
//     }
// }


// public class Objects{
//     public static  void main(String args[]){
//         Son s1=new Son();
//         s1.Char();
//     }
// }

// class Generation{
//     String grandfather;

//     String character;

//     String child;

//     void Name(){
//         System.out.println("the name of grandfather is You:  ");
//     }

//      void Char(){
//          System.out.println("The sons are sunky more than the Grandfather :");
//      }

//      void Nano(){
//         System.out.println("Sandesh is More inteligent");

//      }
// }

// class Son extends Generation{

//     String name;

//     void behave(){
//         System.out.println("Son is honest more than his father");
//     }
// }


// public class Objects{
//     public static void main(String args[]){
//        Prakhar My=new Prakhar();
//        System.out.println(My);
//     }
// }

// abstract class Animal{
//      String sound;
//     Animal(){
//         sound="Sweet";
//     }
// void eat(){
//     System.out.println("Animals are the most dengerous in the world");
// }

// abstract void walk();
// }

// class Tiger extends Animal{

//     void newsound(){
//         System.out.println("Peacefull");
//     }
//     void walk(){
//         System.out.println("Siddhant is gandu");
//     }
// }

// class Prakhar extends Tiger{

//     void newsound(){
//         System.out.println("Singer sound");
//     }
//     void walk(){
//         System.out.println("walk on two legs");
//     }
// }


public class Objects{
    public static void main(String args[]){
      Beer ff=new Beer();
      ff.Eat();
      ff.food();

    }
}

interface Herbivore{
    void Eat();
}

interface carnivore{
    void food();
}

class Beer implements Herbivore,carnivore {
    public void Eat(){
        System.out.println("now i will ignore all the things");
    }

    public void food(){
        System.out.println("destroy your self");
    }
} 