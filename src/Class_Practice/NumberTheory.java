public class NumberTheory {

    /*isPrime - 2 이상의 정수를 대상으로 소수(prime number)인지 판별
    * @param - 정수 > 1
    * @return - 소수이면 1, 소수가 아니면 그 수의 가장 큰 약수
    * @throw RuntimeException - 인수가 2 미만인 경우*/
    public int isPrime(int n){
        if (n < 2)
            throw new RuntimeException("isPrime error: 부적절한 인수 " + n);
        else{
            boolean item_found = false;
            int current = n / 2;
            while (!item_found && current >1){
                /*loop invariant:
                * (1) item_found == false : n이 n/2, (n/2)-1, ..., current+1 로 나누어지지 않았음
                * (2) item_found == true: n이 current로 나누어짐*/
                if (n % current == 0)
                    item_found = true;
                else
                    current = current -1;
            }
            if (item_found)
                return current; //n이 약수가 아니므로, n의 가장 큰 약수인 current
            else
                return 1;   // n이 약수이므로, 1
        }
    }

    public static void main(String[] args) {
        NumberTheory math = new NumberTheory();
        System.out.println(math.isPrime(7));    //1
        System.out.println(math.isPrime(9));    //3
    }
}
