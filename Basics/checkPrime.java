class Prime {
    public static void main(String[] args) {
        System.out.println("Is prime number "+isPrime(19));
    }
    
    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
