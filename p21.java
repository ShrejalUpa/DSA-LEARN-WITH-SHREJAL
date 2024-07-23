// PRECEDENCE AND ASSOCIATIVITY
//PRCEDENCE MEANS  POWER OF OPERATORS
//ASSOCATIVITY MEANS L TO R AND R TO L FOR SAME PRECEDENCE


//Ques:- Let say we have a 4 variables of type int: p, q , r , s 
// s = p-++r-++q
// s equivalent to?


// Solution:-   let's take p = 4 , q = 3 , r = 2
//              s = p - ( ++r ) - ( ++q )
//              s = 4 - (3) - (4)
//              s = 1 - 4
//              s = -3



//Ques:- What is the result of the following code fragment?
//Boolean p = false;
//Boolean q = false;
//Boolean r = true;
//System.out.println(p==q==r)


public class p21 {
    public static void main(String args[]){
        Boolean p = false;
        Boolean q = false;
        Boolean r = true;
        System.out.println(p==q==r);
    }
}
