

class TwoStringPermutation {
    public static void main(String[] args) {
        String s1="abka";
        String s2="baaa";
        if(s1.length()!=s2.length()) {
            System.out.println(false);
            return;
        }
        int arr1[]=new int[128];
        int arr2[]=new int[128];
        for(int i=0;i<s1.length();i++){
            int ascii=s1.charAt(i);
            arr1[ascii]++;
        }
        for(int i=0;i<s2.length();i++){
            int ascci=s2.charAt(i);
            arr2[ascci]++;
        }
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]-arr2[i]==0){
                continue;

            }
            else{
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}