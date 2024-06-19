public class MySelf {
    String name;
    int age;
    String phoneNumber;
    String address;
    Favorite favorite = new Favorite();

    public MySelf(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void addAdress(String address){
        this.address = address;
    }
    public void print(){
        System.out.println(this.name + " " + this.age + " " + this.phoneNumber + " " + this.address);
    }
    public void printFavorite(){
        System.out.println(favorite.myFavoriteName);
    }
    public void favorite(String FavoriteName){
        favorite.addItem(FavoriteName);
    }
}
