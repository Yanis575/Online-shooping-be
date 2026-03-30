    /// int id
    /// title
    /// price doouple
    /// создать два объекта в мейне
public class Catalog {
        int id;
        String title;
        double price;

        public Catalog() {};

        public Catalog(int id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }

        public int getId() {
            return this.id;
        }

        public String  getTitle() {
            return this.title;
        }

        public double getPrice() {
            return this.price;
        }

        public String setTitle(String title) {
            return this.title = title;
        }

        public double setPrice(double price) {
            return this.price = price;
        }
}
