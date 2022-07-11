import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework11 {
    public static void printMethod(String s) {
        Set<String> list = new HashSet<>(Arrays.asList(s.replace(".","").split(", ")));
        for (String st:list){
            String s1 = st.substring(0,1).toUpperCase();
            String s2 = st.substring(1);
            String str = s1+s2;
            System.out.println(str);

        }


    }

}
