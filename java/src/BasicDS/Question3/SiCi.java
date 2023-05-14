package BasicDS.Question3;

public class SiCi {
    public static double simpleInterest(double pricipalAmount,int time,double rate){
        return ((pricipalAmount*time*rate)/100);
    }
    public static double compoundInterest(double principalAmount,int time,double rate){
        double num1 = principalAmount*Math.pow((1+rate),time);
        num1=num1-principalAmount;
        return num1;
    }
}
