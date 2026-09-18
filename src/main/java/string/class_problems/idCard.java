class idCard {
    String name;
    int booksIssued;
    idCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
    public static void main(String[] args) {
        idCard ravi = new idCard("Ravi", 0);
        idCard duplicate = ravi;
        duplicate.booksIssued = 3;
        idCard separate = new idCard("Ravi", 3);
        System.out.println(
            "Ravi's booksIssued (via first variable): "
            + ravi.booksIssued
        );
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}