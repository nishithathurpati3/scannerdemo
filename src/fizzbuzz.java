public class fizzbuzz {
    public static void main(String args[]){
        int[] numbers= {1,2,34,5,6,7,8,9,10,11,12,13, 14, 15};
        fizzy(numbers);
    }

    public static void fizzy(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%15 ==0){
                System.out.print("FizzBuzz" + " ");
            }
            else if(numbers[i]%3==0){
                System.out.print("Fizz"+ " ");
            }
            else if(numbers[i]%5==0){
                System.out.print("Buzz" + " ");
            }
            else{
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
