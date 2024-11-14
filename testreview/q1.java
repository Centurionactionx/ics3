public class q1 {
    public int calculate(){
        int sum = 0;
        for (int i = 2; i<=200; i+=2){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        q1 c = new q1();
        System.out.println(c.calculate());
    }
}
