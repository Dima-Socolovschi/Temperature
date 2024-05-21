package Temperature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("c");
        list.add("f");
        list.add("k");

        Random rnd = new Random();

        double random1 = rnd.nextDouble() * 100;
        String random2 = list.get(rnd.nextInt(list.size()));
        String random3 = list.get(rnd.nextInt(list.size()));

        System.out.println("Data input : " + random1 + " " + random2 + " " + random3);

        TemperatureConverter temp = new TemperatureConverter();

        double newTemp = temp.convertTemperature(random1, random2, random3 );

        System.out.println(newTemp);
    }
}
