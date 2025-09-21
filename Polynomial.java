public class Polynomial{
    private double[] coefficients;
    //ii
    public Polynomial(){
        coefficients = new double[1];
        coefficients[0] = 0.0;
    }
    //iii
    public Polynomial(double [] new_coefficients){
        if (new_coefficients == null || new_coefficients.length == 0) {
            this.coefficients = new double[]{0.0};
        } 
        else {
            this.coefficients = new double[new_coefficients.length];
            for (int i = 0; i < new_coefficients.length; i++) {
                this.coefficients[i] = new_coefficients[i];
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
        double acc = 0.0;
        for (int i = this.coefficients.length - 1; i >= 0; i--) {
            acc = acc * x + this.coefficients[i];
        }
        return acc;
    }
    //vi
    public boolean hasRoot(double x){
        return evaluate(x) == 0.0;
    }
}