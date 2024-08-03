package Creational.Builder.ChainingSimple;

public class Client {

    public static void main(String[] args) {

        Book book = Book.Builder()
                        .isbn("SDF23444")
                        .name("Foundational Mathematics")
                        .author("RD Sharma")
                        .description("Beginner friendly maths book")
                        .price(509)
                        .build();

        System.out.println(book.toString());
    }
}
