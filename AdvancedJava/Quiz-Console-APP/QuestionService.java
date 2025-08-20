import java.util.Scanner;

public class QuestionService {
    public Question[] questions = new Question[5];  //Question

    String[] selections=new String[5];

    public QuestionService(){
        this.questions[0]=new Question(1,"size of int","1", "2", "3", "4", "4");
        this.questions[1]=new Question(2,"size of double","1", "2", "3", "8", "8");
        this.questions[2]=new Question(3,"size of char","1", "2", "3", "4", "1");
        this.questions[3]=new Question(4,"size of long","1", "2", "3", "4", "8");
        this.questions[4]=new Question(5,"size of boolean","1", "2", "3", "5", "1");

    }

    public void playQuiz(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        for (Question q : questions){
            // System.out.println(q.toString());
            System.out.println("Question No.: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            // Scanner sc=new Scanner(System.in);
            selections[i]=sc.nextLine();
            i++;
            // sc.close();
        }
        for (String select : selections){
            System.out.println("Selection is: "+select);
        }
        sc.close();
    }

    public void printScore(){
        int score=0;
        for (int i=0; i < questions.length; i++){
            System.out.println("Actual Answer is: "+this.questions[i].getAnswer());
            String actualAnswer=this.questions[i].getAnswer();
            String userAnswer=selections[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is: "+score);
    }
}
