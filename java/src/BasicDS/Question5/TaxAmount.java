package BasicDS.Question5;

class TaxAmount {
    static double calculateTaxAmount(double ctc){
        if(ctc>=0 && ctc<=180000)
            return 0;
        if(ctc>=181000 && ctc<=300000)
            return ctc*0.1;
        if(ctc>=300001 && ctc<=500000)
            return ctc*0.2;
        if(ctc>=500001 && ctc<=1000000)
            return ctc*0.3;
        return 0;
    }
}
