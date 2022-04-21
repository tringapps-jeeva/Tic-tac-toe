package com.example;

public class TicTacToe {
      
       public static Evaluation evaluateBoard(String board)
       {
           String lower= board.toLowerCase();

           if(board.length() !=9)
           {
               return Evaluation.InvalidInput;
           }
       
    int countx=0;
    int counto=0;

      for(int  i=0;i<lower.length();i++)
      {
         if(lower.charAt(i)=='x'){
         countx++;
         }
         if(lower.charAt(i)=='o'){
         counto++;
         }
      }
      if(Math.abs(counto - countx)>=2){
        return Evaluation.UnreachableState;
    }
    Boolean xwins = win('x',lower);
    Boolean owins = win('o',lower);
    if((xwins)&&(owins))
    {
      return Evaluation.UnreachableState;
    }
    else if(xwins)
    {
      return Evaluation.Xwins;
    }
    else if(owins)
    {
      return Evaluation.Owins;
    }
    else
    {
      return Evaluation.NoWinner;
    }
  }
   public static boolean win(char checker, String lower)
   {
     if(lower.charAt(0)==checker && lower.charAt(1)==checker && lower.charAt(2)==checker)
    {
      return true;
    }
    if(lower.charAt(3)==checker && lower.charAt(4)==checker && lower.charAt(5)==checker)
    {
      return true;
    }
    if(lower.charAt(6)==checker && lower.charAt(7)==checker && lower.charAt(8)==checker)
    {
      return true;
    }
    if(lower.charAt(0)==checker && lower.charAt(3)==checker && lower.charAt(6)==checker)
    {
      return true;
    }
    if(lower.charAt(2)==checker &&lower.charAt(9)==checker &&lower.charAt(5)==checker)
    {
      return true;
    }
    if(lower.charAt(2)==checker &&lower.charAt(5)==checker &&lower.charAt(8)==checker)
    {
      return true;
    }
    if(lower.charAt(0)==checker &&lower.charAt(4)==checker &&lower.charAt(8)==checker)
    {
      return true;
    }
    return(lower.charAt(2)==checker &&lower.charAt(4)==checker &&lower.charAt(6)==checker);
   }
   public static void main(String args[]){
   System.out.println(evaluateBoard("O...X.X.."));

    System.out.println(evaluateBoard("XXX...oo."));
    System.out.println(evaluateBoard("...Xxx.oo"));
    System.out.println(evaluateBoard("oo....xxx"));
    System.out.println(evaluateBoard("x..x..xoo"));
    System.out.println(evaluateBoard(".x..xoox."));
    System.out.println(evaluateBoard("..xoox..x"));
    System.out.println(evaluateBoard("x...x.oox"));
    System.out.println(evaluateBoard("..x.x.xoo"));
    System.out.println(evaluateBoard("O.."));
    System.out.println(evaluateBoard("O...X.X...."));
    System.out.println(evaluateBoard("Oooxxx..."));
    System.out.println(evaluateBoard("oxooxooxo"));
   }
}

