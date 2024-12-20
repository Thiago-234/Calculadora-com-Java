public class Metodos {

    private double n1;
    private double n2;

    public Metodos(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public double Soma(){
        return n1 + n2;
    }

    public double Sub(){
        return n1 - n2;
    }
    
    public double Mul(){
        return n1 * n2;
    }

    public double Div(){
        return n1 / n2;
    }
}