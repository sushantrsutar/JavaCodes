class StarPattern
{
    public static void main(String[] args) {
//        for (int i=0;i<=5;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

        int rows=5;
        int space=rows-1;
        for(int i=1;i<=rows;i++)
        {
            for (int j=0;j<=space;j++)
            {
                System.out.print(" ");
            }
            space--;

        for (int j=0;j<2*i-1;j++)
        {
            System.out.print(i);
        }
            System.out.println("");
        }
    }
}