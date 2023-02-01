import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        List<String> cityNames = Arrays.asList("Rome", "Paris", "Berlin");
            //cityNames.add(3, "Oslo");  A not mutable list can't add other elements, but can change its elements.
            System.out.println("City names: " + cityNames);

            cityNames.set(1,"Tegucigalpa");
            System.out.println("New city names: " + cityNames);



        List<String> kingsOfRome = new ArrayList<>();
            kingsOfRome.add(0,"Romulus");
            kingsOfRome.add(1,"Numa Pompiliu");
            kingsOfRome.add(2,"Tullus Hostilius");
            kingsOfRome.add(3,"Ancus Marcius");
            kingsOfRome.add(4,"Lucius Tarquinius Prsicus");
            kingsOfRome.add(5,"Servius Tullius");
            kingsOfRome.add(6,"Lucius Tarquinius Superbus");

            System.out.println("Kings of Rome list: " + kingsOfRome);

            String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

            System.out.println("Array king of Rome: " + Arrays.toString(kingsOfRomeArray));

            kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
            System.out.println("New array king of Rome: " + Arrays.toString(kingsOfRomeArray));



        

    }
}
