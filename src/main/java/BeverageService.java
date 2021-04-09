import java.util.List;
import java.util.Map;

//Carlsberg Pilsner Heineken Skol Pilsner Corona
public interface BeverageService {
    
    String sortedBeverages(List<String> beverages);
    
    Map<String, Long> countByName(List<String> beverages);
}
