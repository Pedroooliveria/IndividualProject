public class Products {
    private static String nameProduct;
    private static int stock;
    private static int nrSerie;
    private static double price;

    public Products() {
    }



    public static String getNameProduct() {
        return nameProduct;
    }

    public static void setNameProduct(String nameProduct) {
        Products.nameProduct = nameProduct;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Products.stock = stock;
    }

    public static int getNrSerie() {
        return nrSerie;
    }

    public static void setNrSerie(int serie) {
        nrSerie = serie;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Products.price = price;
    }

    public String toString() {
        return getNrSerie() + " " + getNameProduct() + " " + getStock() + " " + getPrice();
    }
}
