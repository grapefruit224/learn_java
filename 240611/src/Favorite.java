import java.util.ArrayList;
import java.util.List;

public class Favorite {
    List<String> myFavoriteName = new ArrayList<>();
    public Favorite(){}
    public Favorite(String FavoriteName) {
        this.myFavoriteName.add(FavoriteName);
    }
    public void addItem(String FavoriteName){
        this.myFavoriteName.add(FavoriteName);
    }
}
