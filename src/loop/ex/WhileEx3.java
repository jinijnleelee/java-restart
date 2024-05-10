package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 0;
        int max = 100;
        int sum = 0;
        while(true){

        if(max<0){
            break;
        }
            sum = sum + max;
            System.out.println("sum" + sum);
            System.out.println("max:" + max);
        max--;
        i++;


        }


    }
}
