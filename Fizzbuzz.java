public class Fizzbuzz {
    Fizzbuzz(){

    }

    public boolean Fizz(int n){
        return n % 3 == 0;
    }

    public boolean Buzz(int n){
        return n % 5 == 0;
    }

    public void display(){
        for (int i = 1; i <= 100; i++){
            if (Fizz(i) && Buzz(i)){
                System.out.print("Fizzbuzz, ");
            } else if (Fizz(i)){
                System.out.print("Fizz, ");
            } else if (Buzz(i)){
                System.out.print("Buzz, ");
            } else {
                System.out.printf("%d, ", i);
            }
        }
    }

    public static void main(String[] args) {
        Fizzbuzz f = new Fizzbuzz();
        f.display();
    }

}
