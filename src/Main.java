public class Main {

    public static void main(String[] args) {

        print (54, 15) ;
        System.out.println(mul(12, 5));
        Laptop laptop = new Laptop(1000, 555, "Asus");
        System.out.println("price = " + laptop.getPrice() + " model = " + laptop.getModel() + " brand = " + laptop.getBrand());
        laptop.setPrice(2500);
        System.out.println("price = " + laptop.getPrice() + " model = " + laptop.getModel() + " brand = " + laptop.getBrand());

        laptop.printOut();

        Laptop laptop1 = new Laptop(500, 565, "Apple");
        laptop1.printOut();

    }


static void print (int a, int b){
        System.out.println("a = " + a + " b = " + b );
}

static int mul(int a, int b) {
        return a*b ;
}


 }
