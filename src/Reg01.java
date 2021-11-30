import java.util.regex.*;

public class Reg01
{
    public static void main(String args[])
    {
        String target ="99*jjf997976jlhig878";
        Pattern p=Pattern.compile("\\D");
        int ctr=0;
        Matcher m=p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
