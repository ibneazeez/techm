public class BreakAndContinue {
public static void main(String[] args) {
      for(int i=0;i<3;i++)
      {
            if(i==1)
                  continue;
            System.out.println("i="+i);
            for(int j=0;j<3;j++)
            {
                  if(j==1)
                        break;
                  System.out.println("j="+j);
            }
            
            
      }
}
}
