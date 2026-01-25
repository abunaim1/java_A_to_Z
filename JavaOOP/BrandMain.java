package JavaOOP;

public class BrandMain {
    public static void main(String[] args) {
        Brand brand = new Brand("Easy", "Shirt");
        Brand brand2 = new Brand("infinity", "Pant");
        Brand brand3 = new Brand("Apex", "Shoe");

        Brand[] brands = {brand, brand2, brand3};

        for(Brand bnd: brands){
            bnd.displayProduct();
        }
        for(Brand bnd: brands){
            bnd.name = "Ecstasy";
            bnd.displayProduct();
        }
    }
}
