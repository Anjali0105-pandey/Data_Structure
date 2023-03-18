//if abc ek string hai jiska all permutation hoga abc,acb,bac,bca,cab,cba


public class permutation {
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);//current character jo hoga usko fix kardenge
            String newStr=str.substring(0,i)+str.substring(i+1);
            //let b is currChar then humne substring function liya mtlb 0 to i i.e, 0 to 1 tak chalenge toh 1 include nahi hoga
            //0 to 0 hogya "a" substring i+1 hogya mtlb a ko c ke saath jor diya so ac mil gya ab phir agle level ko call karege
            printPerm(newStr,permutation+currChar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        printPerm(str,"");
    }
}
