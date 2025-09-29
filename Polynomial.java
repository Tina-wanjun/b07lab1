import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class Polynomial{
    private double[] coefficients;//non-zero
    private int[] exponents;
    //ii
    public Polynomial(){
        coefficients = new double[1];
        coefficients[0] = new int[0];
    }
    //iii
    public Polynomial(double [] new_coefficients){
        if (new_coefficients == null || new_coefficients.length == 0) {
            this.coefficients = new double[0];
            this.exponents = new int[0];
            return;
        } 
        else {
            this.coefficients = new double[new_coefficients.length];
            this.exponents = new double[new_exponents.length];
            for (int i = 0; i < new_coefficients.length; i++) {
                this.coefficients[i] = new_coefficients[i];
                this.exponents[i] = new_exponents[i];
            }
        }
    }
    //iv
    public Polynomial add(Polynomial other){
        int lenA = this.coefficients.length;
        int lenB = other.coefficients.length;
        if(lenB > lenA){
            double [] result = new double[lenB];//new is a keyword, create a new object on heap and return reference to it
            for(int i = 0; i<lenB; i++){
                result[i] = other.coefficients[i];
            }
            for(int j = 0; j<lenA; j++){
                result[j] = other.coefficients[j] + this.coefficients[j];
            }
            return new Polynomial(result);
        }
        double [] result = new double[lenA];//new is a keyword, create a new object on heap and return reference to it
        for(int m = 0; m<lenA; m++){
            result[m] = other.coefficients[m];
        }
        for(int n = 0; n<lenB; n++){
            result[n] = other.coefficients[n] + this.coefficients[n];
        }
        return new Polynomial(result);
    }
    //v
    public double evaluate(double x){
        double s = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            s += coefficients[i] * Math.pow(x, exponents[i]);
        }
        return s;
    }
    //vi
    public boolean hasRoot(double x){
        return evaluate(x) == 0.0;
    }
    //new method for lab2 1)
    public Polynomial multiply(Polynomial other){
        if (this.coefficients.length == 0 || other.coefficients.length == 0) {
            return new Polynomial();
        }
        int lenC = this.coefficients.length;
        int lenE = other.exponents.length;
        int lenTemp = lenC * lenE;

        double[] tmpC = new double[lenTemp];
        int[] tmpE = new int[lenTemp]; 
        while(int i = 0; i<lenTemp; i++){
            double Cith = this.coefficients[i];
            int Eith = other.exponents[i];
            for (int j = 0; j < m; j++) {
                double Cjth = other.coefficients[j];
                int Ejth = other.exponents[j];
                tmpC[k] = Cith * Cjth;
                tmpE[k] = Eith + Ejth;
                k++;
            }
        }
        //rearrange
        double minC = 0.0;
        int minE = 0;
        for(int m = 0; m < lenTemp; m++){
            int minIdx = 0;
            if(tempE[m] < lenTemp) minIdx = m;
            if(minIdx != m){
                double tempC = tmpC[m]; tmpC[m] = tmpC[minIdx]; tmpC[minIdx] = tempC;
                int tempE = tmpE[m]; tmpE[m] = tmpE[minIdx]; tmpE[minIdx] = tempE;
            }
        }
        //combine coeffitients with same exponents
        //and find the new length
        int outCount = 0;
        int idx = 0;
        while (idx < lenTemp) {
            int e = tmpE[idx];
            double sum = 0.0;
            while (idx < lenTemp && tmpE[idx] == e) {
                sum += tmpC[idx];
                idx++;
            }
            if (sum != 0.0) outCount++;
        }
        double[] resultC = new double[outCount];
        int[] reslutE = new int[outCount];
        idx = 0;
        int r = 0;
        while (idx < lenTemp) {
            int e = tmpE[idx];
            double sum = 0.0;
            while (idx < lenTemp && tmpE[idx] == e) {
                sum += tmpC[idx];
                idx++;
            }
            if (sum != 0.0) {
                resultC[r] = sum;
                resultE[r] = e;
                r++;
            }
        }
        Polynomial result = new Polynomial();
        result.coefficients = resultC;
        result.exponents = resultE;
        return result;
    }
    //2)
    public intialPolynomial(File target){
        BufferedReader file = new BufferedReader(new FileReader(target));
        String line = file.readline();
        if (line == null || line.length() == 0) {
        this.coefficients = new double[0];
        this.exponents = new int[0];
        return;
        }
        if (line[0]) != '+' && line.[0] != '-') {
            line = "+" + line;
        }
        while(file != null){
            for(int i = 0; line[i] != null; i++){
                for(int j = 0; line[j] != null; j++){
                    this.Polynomial.coefficients[j]
                }
            }
        }
    }
    
}
