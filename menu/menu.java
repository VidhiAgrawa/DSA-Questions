import java.util.Scanner;

class all{
    void main(){
        System.out.println("What would you like to have sir");
        System.out.println("1.Starter \n2.Main Course \n3.Dessert \n4.Drinks");
        Scanner sc = new Scanner(System.in);
        System.out.println("ans:-");
        String ans = sc.nextLine();
        
        if( ans.compareTo("starter") == 0 ){
            System.out.println("here is the menu for starters\n");
            starter();
            main();   
        }
        if( ans.compareTo("main course") == 0 ){
            System.out.println("here is the menu for maincourse\n");
            mainCourse();
            main();
        }
        if( ans.compareTo("dessert") == 0 ){
            System.out.println("here is the menu for dessert\n");
            dessert();
            main();
        }
        if( ans.compareTo("drinks") == 0 ){
            System.out.println("here is the menu for drinks\n");
            drinks();
            main();
        }
        if( ans.compareTo("exit") == 0 ){
            return;
        }  
    }
    void starter(){;
        System.out.println("1.Manchurian \n2.Chilli paneer \n3.Chilli ptatoes \n4.Noodles \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("ans:-");
        String ans = sc.nextLine();
        System.out.println("Your order is placed for " + ans+"\n");
        System.out.println("to exit write exit "); 
    }
    void mainCourse(){
        System.out.println("1.Palak paneer \n2.Matar maithi malai \n3.Mushroom masala \n4.Butter paneer \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("ans:-");
        String ans = sc.nextLine();
        System.out.println("Your order is placed for " + ans +"\n");
        System.out.println("to exit write exit ");  
    }
    void dessert(){;
        System.out.println("1.Cakes \n2.Gulab jamun \n3.Rabdi \n4.Fruit custurd \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("ans:-");
        String ans = sc.nextLine();
        System.out.println("Your order is placed for " + ans +"\n");
        System.out.println("to exit write exit ");  
    }
    void drinks(){
        System.out.println("1.Peach ice tea \n2.Pulpy grapes \n3.Lemon mojito \n4.Blue ocean mojito \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("ans:-");
        String ans = sc.nextLine();
        System.out.println("Your order is placed for " + ans +"\n");
        System.out.println("to exit write exit ");  
    }   
}

public class menu {
    public static void main(String[] args) {  
        System.out.println("hello sir welcome to our restaurant");
        all m = new all();
        m.main();
    }
}
