package Day5;

class Author {
    String name, email;
    char gender;

    //constructor

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public static void Author(Author bookAuthor) {
        System.out.println(bookAuthor.name + " " + bookAuthor.email + " " + bookAuthor.gender);
    }

    public static void main(String[] args) {
        Author ourBookAuthor = new Author("Oskar Wild", "oskarwild@gmail.com", 'M');
        Author(ourBookAuthor);
    }
}
