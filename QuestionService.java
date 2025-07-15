import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[]= new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[2] = new Question(3, "What is the largest planet?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
        questions[3] = new Question(4, "What is the national animal of India?", "Lion", "Tiger", "Elephant", "Peacock", "Tiger");
        questions[4] = new Question(5, "Who wrote '1984'?", "George Orwell", "Aldous Huxley", "Ray Bradbury", "Mark Twain", "George Orwell");
    }
    public void playQuiz()
    {
        int i=0;
        int score=0;
        for(Question q:questions)
        {
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOp1());
            System.out.println("2. " + q.getOp2());
            System.out.println("3. " + q.getOp3());
            System.out.println("4. " + q.getOp4());
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            selection[i] = scanner.nextLine(); // Read user input
            if(selection[i].equalsIgnoreCase(questions[i].getAnswer()))
            {
                System.out.println("Correct!");
                score++;
            } else
            {
                System.out.println("Wrong! The correct answer is: " + questions[i].getAnswer());
            }
            System.out.println("");
            // Here you can add code to get user input and check the answer
            i++;
        }

        System.out.println("Your Answers:");
        for(String  ans:selection)
        {
            System.out.println(ans);
        }
        System.out.println("Total score: " + score + "/" + questions.length);
    }

    

}

