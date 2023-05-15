package BasicDS.Question4;

public class ResultDeclaration {
    public static String declareResults(int a,int b,int c){
        if(a>60 && b>60 && c>60)
            return "Passed";
        else if(a<=60 && b<=60 || b<=60 && c<=60 || a<=60 && c<=60)
            return "Failed";
        else
            return "Promoted";
    }
}
