import javax.swing.*;

public class Math_gameV2 {
    public static void main(String[]args){

        int x = (int)(10 * Math.random());
        int y = (int)(10 * Math.random());

        int answer = x*y;
        while (true){
            try {

                String guessx=  JOptionPane.showInputDialog(null,x + "*" + y,"Solve the equation:",JOptionPane.QUESTION_MESSAGE);
                int guess=Integer.parseInt(guessx);

                if(answer == guess){
                    JOptionPane.showMessageDialog(null,"Nice","great",JOptionPane.INFORMATION_MESSAGE);
                    break;

                }else{
                    JOptionPane.showMessageDialog(null,"Try again","Wrong answer",JOptionPane.ERROR_MESSAGE);}
                if (guess < answer){JOptionPane.showMessageDialog(null,"More","Hint",JOptionPane.INFORMATION_MESSAGE);}
                else {JOptionPane.showMessageDialog(null,"Less","Hint",JOptionPane.INFORMATION_MESSAGE);}
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Wrong value","Error",JOptionPane.ERROR_MESSAGE);break;
            }
        }
    }
}



