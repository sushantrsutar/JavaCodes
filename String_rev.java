public class String_rev {
    public static void main(String[] args) {
        String str="sushant";
        String revstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println(revstr);
    }
}
