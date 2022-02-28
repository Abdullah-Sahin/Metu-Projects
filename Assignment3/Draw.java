import java.util.*;
/**
 A draw application class
 */
public class Draw
{
    private ArrayList<Reader> participants = new ArrayList<Reader>();
    private ArrayList<Reader> correctAnswerGivers = new ArrayList<Reader>();
    private ArrayList<Reader> winners = new ArrayList<Reader>();
    private final String drawID;
    private final String correctAnswer;
    
    Scanner in = new Scanner(System.in);
   
    /**
     Constructor of instance of class Draw
     @param drawID the name of draw
     @param correctAnswer the correct answer
     */
    public Draw(String drawId, String correctAnswer)
    {
        this.drawID = drawId;
        this.correctAnswer = correctAnswer;
    }
    
    /**
     Forms instances of class Reader with given parameters and collect them in list
     draw-participants list
     @param name Name of draw participant
     @param TCID ID of draw participant
     @param answer answer of draw participant
     */
    public void addParticipant(String name, String TCID, String answer)
    {
        Reader reader = new Reader(name, TCID, answer);
        participants.add(reader);
    }
    
    /**
     Finds the participants who answered correctly to draw question 
     and make a list of them
     @return The list of correct answer givers
     */
    public ArrayList<Reader> findCorrectAnswerGivers()
    {
        for(int i =0; i<participants.size(); i++)
        {
            if (participants.get(i).getAnswer().equals(correctAnswer))
            {
                correctAnswerGivers.add(participants.get(i));
            }
        }
        return correctAnswerGivers;
    }
    
    /**
     Chooses 2 winners from those who answered correctly, if exists
     @param correctAnswerGivers those who answered quesiton correctly
     @return The list of winners
     */
    public ArrayList<Reader> makeDraw(ArrayList<Reader> correctAnswerGivers)
    {
        Random r = new Random();
        if(correctAnswerGivers.size()==0)
        {
            System.out.println("No reader has given correct answer");
        }
        else if(correctAnswerGivers.size()==1)
        {
            System.out.println("There is only 1 correct answer.");
            Reader winner1 = correctAnswerGivers.get(r.nextInt(correctAnswerGivers.size()));
            winners.add(winner1);
        }
        else
        {
            Reader winner1 = correctAnswerGivers.get(r.nextInt(correctAnswerGivers.size()));
            correctAnswerGivers.remove(winner1);
            Reader winner2 = correctAnswerGivers.get(r.nextInt(correctAnswerGivers.size()));
            winners.add(winner1);
            winners.add(winner2);
        }
        return winners;
        
    }
    
    /**
     Displays the winners and their IDs if exists.
     @param winners the winners
     */
    public void displayWinners(ArrayList<Reader> winners)
    {
        if(winners.size()==0)
        {
            System.out.println("************NO WINNER************");
        }
        else
        {
            for(Reader winner : winners)
            {
                System.out.printf(winner.getName() + "\t" + winner.getTCID());
                System.out.println();
            }
        }
    }
    
    /**
     Starts the draw application for user
     */
    public void q3()
    {
        System.out.print("Please type the draw number: ");
        String id = in.nextLine();
        System.out.print("Please type the correct answer: ");
        String correctAnswer = in.nextLine();
        Draw draw = new Draw(id, correctAnswer);
        String next;
        do{
            System.out.print("Please enter participant's name: ");
            String name = in.nextLine();
            System.out.print("Please enter participant's TCID: ");
            String TCID = in.nextLine();
            System.out.print("Please enter participant's answer: ");
            String answer = in.nextLine();
            draw.addParticipant(name,TCID,answer);
            int i = 0;
            do
            {
                if(i == 0)
                {
                    System.out.print("Is there any other participants? ( Y / N )");
                }
                else
                {
                    System.out.println("***INCORRECT INPUT***\n"
                                      +"Is there any other participants?\n"
                                      +"Type valid character ( Y / N)");
                }
                next = in.nextLine();
                i++;
            }while(!(next.equals("Y") || next.equals("y")|| next.equals("N")|| next.equals("n")));
        }while(next.equals("Y") || next.equals("y"));
        draw.displayWinners(draw.makeDraw(draw.findCorrectAnswerGivers()));
    }
}
