public class Book {
        private String name;
        private Autor autor;
        private int age;

        public Book(String name, Autor autor, int age) {
                this.name = name;
                this.autor = autor;
                this.age = age;
        }

        public String getName() {

                return this.name;
        }

        public int getAge() {
                return this.age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public Autor getAutor() {
                return this.autor;

        }
}
