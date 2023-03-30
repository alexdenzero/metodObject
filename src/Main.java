public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor ();
        Book book = new Book("Война и мир",autor,1865);
        System.out.println("Book.name = " + book.getName());
        System.out.println("Book.nameAutor = " + book.getAutor());
        System.out.println("Book.age = " + book.getAge());
        book.setAge(1869);
        System.out.println("Book.age = " + book.getAge());


        Autor autor2 = new Autor ();
        Book book1 = new Book("Мир и война",autor2, 1866);
        System.out.println("Book.name = " + book1.getName());
        System.out.println("Book.nameAutor = " + book1.getAutor());
        System.out.println("Book.age = " + book1.getAge());
        book1.setAge(1868);
        System.out.println("Book.age = " + book1.getAge());
    }
}