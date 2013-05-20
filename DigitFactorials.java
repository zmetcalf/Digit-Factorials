import java.util.ArrayList;

public class DigitFactorials 
{
    
    private ArrayList<Long> factorialList = new ArrayList<Long>();
    
    public DigitFactorials() {
    }
    
    public void findCuriousNumbers() {
        for(long i = 3; i < 10000000; i++) {
            if(i == findFactorialSums(i)) {
                factorialList.add(i);
            }
        }
    }
    
    public void printCuriousNumbers() {
    
        int tempSum = 0;
        
        for(int i = 0; i < factorialList.size(); i++) {
            tempSum += factorialList.get(i);
        }
        System.out.println("The sum is: " + tempSum);
    }
    
    private long findFactorial(long toFactor) {
        
        long factorial = 1;
        
        for(long i = toFactor; toFactor > 1; toFactor--) {
            factorial *= toFactor;
        }
        return factorial;
    }
    
    private long findFactorialSums(long toSumFactor) {
        char[] factorialCharArray;
        long factorialSum  = 0;
        
        factorialCharArray = Long.toString(toSumFactor).toCharArray();
        
        for(char i : factorialCharArray) {
            factorialSum += findFactorial((i - 48)); 
        }
        
        return factorialSum;
    }
}
