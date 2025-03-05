import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class quizz{
    public static void main(String[] args) {
        try {
            int total = 0;
            FileWriter fff = new FileWriter("./result.txt");
            fff.write("");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Your Name:-");
            String name = scan.nextLine();
            
            for (int i = 1; i < 11; i++) {
                File myFile = new File("./que" + i + ".txt");
                myFile.createNewFile();
                FileReader read = new FileReader("./que" + i + ".txt");
                Scanner sc = new Scanner(read);
                while ( sc.hasNextLine() ) {
                    String ans = sc.nextLine();
                    if( !ans.startsWith("   - *Correct") ){
                        System.out.println(ans);
                    }
                    else{
                        System.out.println("Ans :-");
                        Scanner sc1 = new Scanner(System.in);
                        String a = sc1.nextLine();
                        // System.out.println((ans.split(": ")[1]).split("")[0]);
                        
                        String correct = "is Your Correct Answer";
                        String wrong = "is Your Wrong Answer";
                        try(FileWriter write = new FileWriter("./result.txt", true);
                        BufferedWriter bw = new BufferedWriter(write)){
                            if( i == 1 ){
                                bw.write(name);
                            }
                            if( a.compareTo((ans.split(": ")[1]).split("")[0]) == 0 ){
                                bw.write( "Question Num " + i + "\n");
                                bw.write(a + " " + correct + "\n");
                                total = total+1;
                            }
                            else{
                                bw.write( "Question Num " + i + "\n");
                                bw.write(a + " " + wrong + "\n");
                            }
                            if( i == 10 ){
                                bw.write( "Your total score is :- " + total );
                            }
                        }
                        catch (Exception e) {
                            System.out.println("error");
                        } 
                    }
                }
            }        
        } 
        
        catch (Exception e) {
            System.out.println("error");
        }
    }
}