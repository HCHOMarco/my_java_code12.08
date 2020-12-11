class Book{
    private int ISBN;
    private String name;
    private double price;
    private String publisher;

    public Book(int ISBN,String name,double price,String publisher){
        this.ISBN=ISBN;
        this.name=name;
        this.price=price;
        this.publisher=publisher;
    }


    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}