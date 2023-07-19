import java.util.Scanner;
class Test{
    Scanner sc=new Scanner(System.in);
    String name;
    Character ans;
    int choice,marks=0;
    //this startquiz method is the starting function.
    public void startquiz(){
        System.out.println("Welcome To QuizoMania");
        System.out.println("Enter your name : ");
        name=sc.nextLine();
    }
    //this method is for second portion
    public void choicequiz(){
        System.out.println("Press 1 to Start Quiz.");
        System.out.println("Press 2 to Quit.");
        System.out.println("Enter your choice = ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                start();
                quiz();
                break;
            case 2:
                System.out.println("Thank you.");
                System.exit(0);
                break;
            default:
                choicequiz();
                break;
        }
    }
    //this is the third part
    public void quiz(){
        System.out.println("Who is the Prime Minister of India ? "+"\n"+"a.Narendra Modi."+"\t"+"b.Mamata Banerjee.");
        ans=sc.next().charAt(0);
        if(ans.equals('a')){
            marks+=2;
        }
        else{
            marks-=1;
        }
        System.out.println("Who is the Chief Minister of India ? "+"\n"+"a.Narendra Modi."+"\t"+"b.Mamata Banerjee.");
        ans=sc.next().charAt(0);
        if(ans.equals('b')){
            marks+=2;
        }
        else{
            marks-=1;
        }
        System.out.println("What is the base of Binary Number System ? "+"\n"+"a.10."+"\t"+"b.2.");
        ans=ans=sc.next().charAt(0);
        if(ans.equals('b')){
            marks+=2;
        }
        else{
            marks-=1;
        }
        System.out.println("Which is universal gate ? "+"\n"+"a.NAND."+"\t"+"b.AND.");
        ans=ans=sc.next().charAt(0);
        if(ans.equals('a')){
            marks+=2;
        }
        else{
            marks-=1;
        }
        System.out.println("Who counted 'jata mat yata path' ? "+"\n"+"a.Shri Ramkrishna."+"\t"+"b.Swami Viveekananda.");
        ans=ans=sc.next().charAt(0);
        if(ans.equals('a')){
            marks+=2;
        }
        else{
            marks-=1;
        }
    }
    //here is the timer of 10 seconds to complete the quiz.i used here lambda expression.
    public void start(){
        new Thread(
            ()->{
                try{
                    Thread.sleep(10000);
                }
                catch(Exception e){}
                System.out.println("Times UP !!!");
                System.out.println("Your Result = "+marks);
            }
        ).start();
    }
    public static void main(String args[])throws Exception{
        Test obj=new Test();
        obj.startquiz();
        obj.choicequiz();
    }
}