//  date 11Nov22

class HelloWorld {
    public static void main(String[] args) {
        
        //boolean[] bTF = new boolean[50];
        Puzz pz = new Puzz();
        System.out.println("Hello, World!"+pz.findTF(100, 100));
        //pirntBool(bTF);
    }
    // public static void pirntBool(boolean[] bArr){
    //     for(boolean br:bArr){
    //         System.out.println(br);
    //     }
    // }
}

class Puzz{
    public static int findTF(int mon, int dor){
        boolean[] bTF = new boolean[101];
        //int count = 1;
        for(int i=1;i<=100;i++){
            int j = 1;
            while(j<=100){
                if(bTF[j*i] && j*i<= 100){
                    bTF[j*i] = false;
                }
                else if(j*i<= 100){
                    bTF[j*i] = true;
                }
                j++;
            }
        }
        return pirntBool(bTF);
    }
    public static int pirntBool(boolean[] bArr){
        int count=0;
        for(boolean br:bArr){
            if(br){
                count++;
            }
        }
        return count;
    }
}
