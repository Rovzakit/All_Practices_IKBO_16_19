package Practice19_20;

import java.util.*;

public class Generate {
    private final ArrayList<String> plates= new ArrayList<>();
    private final HashSet<String> platesHash = new HashSet<String>();
    private final Set<String> platesTree = new TreeSet<>();
    public void nicePlates(){
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i=1;i<=199;i++){
            for(int j=1; j<=9; j++)
                for (String s : letters)
                {
                    String e = s + (j) + (j) + (j) + s + s + (i);
                    plates.add(e);
                    platesHash.add(e);
                    platesTree.add(e);
                }
        }
        for (int i=1;i<=199;i++){
            for(int l=1; l<=9; l++)
                for (int j = 0; j < letters.length; j++) {
                    for (int j2 = 0; j2 < letters.length; j2++) {
                        for (int k = 0; k < letters.length; k++) {
                            String e = letters[j] + (l) + (l) + (l) +letters[j2] +  letters[k] + (i);
                            plates.add(e);
                            platesHash.add(e);
                            platesHash.add(e);
                            platesTree.add(e);
                        }
                    }
                }
        }
    }

    public void search(String plate){
        boolean isFound;
        long startTime = System.nanoTime();
        isFound= plates.contains(plate);
        long estimatedTime = System.nanoTime() - startTime;
        if (isFound){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        Collections.sort(plates);
        int x;
        startTime = System.nanoTime();
        x=Collections.binarySearch(plates,plate);
        estimatedTime = System.nanoTime() - startTime;
        if (x>0 && x<=plates.size()){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        startTime = System.nanoTime();
        isFound= platesHash.contains(plate);
        estimatedTime = System.nanoTime() - startTime;
        if (isFound){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
        startTime = System.nanoTime();
        isFound=(platesTree.contains(plate));
        estimatedTime = System.nanoTime() - startTime;
        if (isFound){
            System.out.println("Найден  "+estimatedTime+"нс");
        }
        else
            System.out.println("не найден  "+estimatedTime+"нс");
    }
}
