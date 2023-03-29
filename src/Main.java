public class Main {
    public static void main(String[] args) {
        Book Book = new Book("Война и мир", 1865);
        Autor Autor = new Autor("Лев Толстой");
        System.out.println("Book.name = " + Book.getName());
        System.out.println("Book.nameAutor = " + Autor.getNameAutor());
        System.out.println("Book.age = " + Book.getAge());
        Book.setAge(1869);
        System.out.println("Book.age = " + Book.getAge());


        Book Book1 = new Book("Мир и война", 1866);
        Autor Autor1 = new Autor("Толстой лев");
        System.out.println("Book.name = " + Book1.getName());
        System.out.println("Book.nameAutor = " + Autor1.getNameAutor());
        System.out.println("Book.age = " + Book1.getAge());
        Book.setAge(1868);
        System.out.println("Book.age = " + Book1.getAge());
    }
}