

package fundamentals;


public class MutiplyNotes {
    public static void main(String[] args) {
        System.out.println(sum(10, 202, 2, 20));
    }
    
    public static int sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            sum += value;
        }
        
        return sum;
    }
}
