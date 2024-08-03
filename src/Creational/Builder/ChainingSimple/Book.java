package Creational.Builder.ChainingSimple;

public class Book {

    private final String isbn;
    private final String name;
    private final Integer price;
    private final String description;
    private final String author;

    private Book(Builder builder){
        this.isbn = builder.isbn;
        this.name = builder.name;
        this.price = builder.price;
        this.author = builder.author;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String result = "Book [ ";
        if(getIsbn() != null){
            result += "\n ISBN: " + getIsbn() + "\n";
        }
        if(getName() != null){
            result += "\n Name: " + getName() + "\n";
        }
        if(getAuthor() != null){
            result += "\n Author: " + getAuthor() + "\n";
        }
        if(getDescription() != null){
            result += "\n Description: " + getDescription() + "\n";
        }
        if(getPrice() != null){
            result += "\n Price: " + getPrice() + "\n";
        }
        result += " ]";
        return result;
    }

    public static Builder Builder(){
        return new Builder();
    }

    public static class Builder {

        private String isbn;
        private String name;
        private Integer price;
        private String description;
        private String author;

        public Builder(){

        }

        public Builder isbn(String isbn){
            this.isbn = isbn;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder price(Integer price){
            this.price = price;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }
}
