public class Main {
    public static void main(String[] args) {
        Catalog catalog1 = new Catalog(1, "Игрушка машинка", 1000);
        Catalog catalog2 = new Catalog(2, "Игрушка куклы", 110000);



        System.out.println(catalog1.getId() + " " + catalog1.getTitle() + " " + catalog1.getPrice() );
        System.out.println(catalog2.getId() + " " + catalog2.getTitle() + " " + catalog2.getPrice() );
    }
}