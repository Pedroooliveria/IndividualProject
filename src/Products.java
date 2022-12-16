import java.util.Scanner;

public class Products {
    private String nameProduct;
    private int stock;
    private int nrSerie;
    private double price;

    private boolean haveStock;

    public boolean stock() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quant: ");
        int quant;
        quant = scanner.nextInt();
        if (quant < getStock()) {
            setStock(getStock() - quant);
            this.haveStock = true;
            return true;
        }
        return false;
    }

    public Products() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(int serie) {
        this.nrSerie = serie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHaveStock() {
        return haveStock;
    }

    public void setHaveStock(boolean haveStock) {
        this.haveStock = haveStock;
    }

    public String toString() {
        return getNrSerie() + " " + getNameProduct() + " " + getStock() + " " + getPrice();
    }
}
