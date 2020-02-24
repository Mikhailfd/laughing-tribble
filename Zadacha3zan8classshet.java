package home.lesson8;

public class Schet {
    final int a1= 0;
    final int a2= 2;
    final int a3 = 3;
    final int b1= 0;
    final int b2= 2;
    final String St = "\0";
    private String exp;
    private int explds;
    private String leksem;
    private int leksemT;
    public String toString(){
        return String.format("Exp = {0}\nexplds = {1}\nleksem= {2}\n
        if(isDelim(exp.charAt(explds))){
            token += exp.charAt(explds);
            explds++;
            tokType = DELIMITER;
        }= {3}", exp.toString(), explds,
                leksem.toString(), 
        if(isDelim(exp.charAt(explds))){
            token += exp.charAt(explds);
            explds++;
            tokType = DELIMITER;
        });
    }

    private void getLeksem(){
        lesksimT = a1;
        leksem= "";

        if(explds == exp.length()){
            leksem= St;
            return;
        }

        while(explds < exp.length() && Character.isWhitespace(exp.charAt(explds)))
            ++ explds;
        if(explds == exp.length()){
            leksem= St;
            return;
        }
        else if(Character.isLetter(exp.charAt(explds))){
            while(!isDelim(exp.charAt(explds))){
                leksem+= exp.charAt(explds);
                explds++;
                if(explds >= exp.length())
                    break;
            }
            tokType = a2;
        }
        else if (Character.isDigit(exp.charAt(explds))){
            while(!isDelim(exp.charAt(explds))){
                leksem+= exp.charAt(explds);
                explds++;
                if(explds >= exp.length())
                    break;
            }
            leksemT= a3;
        }
        else {
            leksem = St;
            return;
        }
    }

    private boolean isDelim(char charAt) {
        if((" +-/*%^=()".indexOf(charAt)) != -1)
            return true;
        return false;
    }

    public double evaluate(String expstr) throws ParserException{

        double res;

        exp = expstr;
        explds = 0;
        getLeksem();

        res= evalExp2();
        if(!leksem.equals(St))
            handleErr(b1);
        return res;
    }

    private double evalExp2() throws ParserException{

        char op;
        double res;
        double partialRes;
        res = evalExp3();
        while((op = leksem.charAt(0)) == '+' ||
                op == '-'){
            get.Leksem();
            partialRes= evalExp3();
            switch(op){
                case '-':
                    res-= partialRes;
                    break;
                case '+':
                    res += partialRes;
                    break;
            }
        }
        return res;
    }

    private double evalExp3() throws ParserException{
        double res;

        if(leksem.equals("(")){
            getLeksem();
            res= evalExp2();
            if(!leksem.equals(")"))
                handleErr(b2);
            getLeksem();
        }
        else
            res= atom();
        return res;
    }

    private double atom()   throws ParserException{

        double res= 0.0;
        switch(leksemT){
            case a3:
                try{
                    res = Double.parseDouble(leksem);
                }
                catch(NumberFormatException exc){
                    handleErr(b1);
                }
                getLeksem();

                break;
            default:
                handleErr(b1);
                break;
        }
        return res;
    }
    private void handleErr(int nOEXP2) throws ParserException{

        String[] err  = {
                "Sint err",
                "Neverno rast skobki"
                "Division by zero"
        };
        throw new ParserException(err[nOEXP2]);
    }

}
