package sequality;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }
    public double average(int x, int y){
        double z;
        z = (double)(x + y) / 2;
        return z;
    }
    public int maxsum(int x, int y){
        int max = 0;
        for(int i = x; i <= y; i++){
            max += i;
        }
        return max;
    }
    public double maxave(int x, int y){
        int max = 0;
        double ave;
        for(int i = x; i <= y; i++){
            max += i;
        }
        ave = (double)max / y;
        return ave;
    }
    public int oddmax(int x, int y){
        int max = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 != 0){
                max += i;
            }
        }
        return max;
    }
    public int evenmax(int x, int y){
        int max = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 == 0){
                max += i;
            }
        }
        return max;
   }
}