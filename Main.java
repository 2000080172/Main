public class Main
{
    public static void main(String[]args)
    {
       int [] myarr=new int[args.length];
       int i=0;
       for(String s: args)
       {
           myarr[i] = Integer.parseInt(s);
           i++;
       }
       int min=myarr[0];
       int max=myarr[0];
       for(i=0;i<myarr.length;i++)
       {
           if(min>myarr[i]){
               min=myarr[i];
           }
       }
       for(i=0;i<myarr.length;i++)
       {
           if(max<myarr[i]){
               max=myarr[i];
           }
       }
       System.out.println("minimum value is "+min);
       System.out.println("maximum value is "+max);

	}
}
