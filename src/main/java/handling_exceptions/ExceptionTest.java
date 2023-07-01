package handling_exceptions;

public class ExceptionTest {

    public static void main(String[] args) {
        checkScore(2.15);
        checkScore(50);
        checkScore(95.02);
        checkScore(100.01);

    }

    public static void checkScore(double score) throws ArithmeticException{

        if (score > 0.00 && score <= 50.00){
            System.out.println("Average score");
        } else if (score > 50.00 && score < 100.00) {
            System.out.println("Very good score");
        }else {
            throw new ArithmeticException("score is out of scale");
        }
    }
}
