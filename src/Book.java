public class Book {
        private String name;
        private String nameAutor;
        private int age;

        public Book(String name, String nameAutor, int age) {
                this.name = name;
                this.nameAutor = nameAutor;
                this.age = age;
        }
        public String getName() {
                return this.name;
        }
        public String getNameAutor() {
                return this.nameAutor;
        }
        public int getAge() {
                return this.age;
        }
        public void setAge(int age) {
                this.age = age;
        }

}
