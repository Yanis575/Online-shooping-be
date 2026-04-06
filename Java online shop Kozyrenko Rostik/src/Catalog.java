///  этап 2:
///  1. в классе продукт должно быть поле id title price description класс продукт должен быть абстрактный
///  2. в категори id title description
///  3. метод который увеличивает id на 1
///  4. новые наследники electronic, GardenItem
///  5. новый класс MobileDivase наследник электроник
///  6. создать несколько новых объектов из новых классов в мейн
///  7. В категори должен быть список арейлист должен сохранять список категорий
///  8. В категори два метода AddCategory, ShowCategory
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
