public class Main {
    public static void main(String[] args) {
        Book Book = new Book("Война и мир", "Лев Толстой", 1865);
        System.out.println("Book.name = " + Book.getName());
        System.out.println("Book.nameAutor = " + Book.getNameAutor());
        System.out.println("Book.age = " + Book.getAge());
        Book.setAge(1869);
        System.out.println("Book.age = " + Book.getAge());


        Book Book1 = new Book("Мир и война", "Толстой лев", 1866);
        System.out.println("Book.name = " + Book.getName());
        System.out.println("Book.nameAutor = " + Book.getNameAutor());
        System.out.println("Book.age = " + Book.getAge());
        Book.setAge(1868);
        System.out.println("Book.age = " + Book.getAge());
    }
}