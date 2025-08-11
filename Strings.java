

// public class Strings {

//     public static void main(String[] args) {
//         boolean isPalindrome=true;
      
//          String str=new String("Sandesh");
//         System.out.println("Entered String : ");
       

//         // Check characters from both ends using a for loop
//         for (int i = 0; i < str.length ()/ 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 isPalindrome = false;
//                 break;
//             }
//         }

//         if (isPalindrome) {
//             System.out.println(str+ " is a palindrome.");
//         } else {
//             System.out.println(str+ " is not a palindrome.");
//         }

        
//     }
// }


// public class Strings{
//     public static float printshortestroot(String path){
//         int x=0,y=0;
//         for(int i=0;i<path.length();i++){
//             char alpha=path.charAt(i);
//         if(alpha=='N'){
//             y++;
//         }
//         else if(alpha=='S'){
//             y--;
//         }
//         else if(alpha=='W'){
//             x--;
//         }
//         else if( alpha=='E'){
//             x++;
//         }


//     } 
//     int X=x*x;
//     int Y=y*y;
//         return (float)Math.sqrt(X+Y);
//     }
//     public static void main(String args[]){
//         String path="NS";
//         System.out.print( printshortestroot(path));
//         String name="sandesh";
//         System.out.println(name.toUpperCase( ));
//         System.out.println(name.replace( "n"," "));
//     }
// }


// largest of string


// public class Strings{
   

//     public static void main(String args[]){
//         String fruits[]={" Apple"," Banana"," Mango"," Lemon"};

//         String largest=fruits[0];
//         for(int i=0;i<fruits.length;i++){
//             if(largest.compareTo(fruits[i])<0){
//               largest=fruits[i];
//             }
//         }
//         System.out.println(largest);


//     }
// }


// public class Strings{

//     public static String First(String str){
//         StringBuilder name=new StringBuilder("");
        
//             char ch=Character.toUpperCase(str.charAt(0));
//             name.append(ch);
//             for(int i=0;i<str.length();i++){
//                 if( str.charAt(i)== ' '&& i<str.length()-1){
//                     name.append(str.charAt(i));
//                     i++;
//                     name.append(Character.toUpperCase(str.charAt(i)));
//                 }
//                 else{
//                     name.append(str.charAt(i));
//                 }
                

//         }
//         return name.toString();
//     }
//     public static void main(String args[]){
//         String str=" hi my name is sandesh";
//         First(str);
//         System.out.println(First(str));
        

//     }
// }



// public class Strings{

//     public static void Compresion(String str){
//         StringBuilder sc=new StringBuilder("");
        
//         for(int i=1;i<str.length();i++){
//             int count=1;
            
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//                  count++;
//                  i++;
                
//             }  
//             sc.append(str.charAt(i));
        
//             if(count>1){
               
//                 sc.append(count);
                  
//             }
           
                 

//         }
//          System.out.println(sc.toString()); 
        
       
//     }
//     public static void main(String args[]){
//         String str="aaabbcccddeff";
//         Compresion(str);
//     }
// }

// public class Strings{

//     public static void compression(String str){
//         StringBuilder sc=new StringBuilder("");
        
//         for(int i=1;i<str.length();i++){
//             int count=1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;

//             }
//              sc.append(str.charAt(i));
//             if(count>1){
//                 sc.append(count);
//             }
//         }
//         System.out.println(sc.toString());

//     }
//     public static void main(String args[]){
//         String str=" aaaaaavbbbggfddee";
//         compression(str);
//     }
// }


class vehical{
    void speed(){
        System.out.println("The speed of top most car is more than your thinking");
    }

}

class car extends vehical{
    void speed(){
        System.out.println("speed is in our range");
    }
}
public class Strings{
    public static void main(String args[]){
        vehical obj1=new car();
        obj1.speed();
        vehical obj2=new vehical();
        obj2.speed();
        
    }
}