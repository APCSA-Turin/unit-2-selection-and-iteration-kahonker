package org.example.u2t1.Lab2;

public class SelectionMadness {

    // no instance variables //

    public SelectionMadness() { }

    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        int randInt = (int) (Math.random() * 5) + 1;
        if (randInt == 1) {
            return "Your tarot representing the present is the Fool";
        }
        else if (randInt == 2){
            return "The Star of Change is burning bright";
        }
        else if (randInt == 3){
            return  "My spirit vision shows that something is wrong with your health";
        }
        else if (randInt == 4) {
            return "Make sure to spend some time for yourself, lest you lose yourself";
        }
        return "Your Strings of Fate have been cut, I can't tell you your fortune";
    }

    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       if (num1 > num2){
           if (num1 > num3){
               return num1;
           }
           return num3;
       }
       if (num2 > num3) return num2;
       return num3;
    }

}
