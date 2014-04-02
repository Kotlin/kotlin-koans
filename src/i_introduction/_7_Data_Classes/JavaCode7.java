package i_introduction._7_Data_Classes;

import util.JavaCode;

public class JavaCode7 extends JavaCode {

    public void useKotlinClass(Person1 person) {
        String name = person.getName();
        int age = person.getAge();
        System.out.println("name: " + name + "; age " + age);
    }

    public static class Person4 {
        private final String name;
        private final int age;

        public Person4(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person4 person4 = (Person4) o;
            if (age != person4.age) return false;
            if (name != null ? !name.equals(person4.name) : person4.name != null) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
        }

        @Override
        public String toString() {
            return "Person4{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
