package util;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvider {
        static List<String>Listname = Arrays.asList("John", "TestUser", "Bill");
        static List<Integer> Listaget = Arrays.asList(1,4,7);

    public static String getRandomName(){
        return Listname.get(new Random().nextInt(Listname.size()));
    }
    public static int getRandomAget(){
        return Listaget.get (new Random().nextInt(Listaget.size()));
    }
    }

