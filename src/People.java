public class People {
    String name;
    String lastName;
    int age;
    String profession;

    public People(String name, String lastName, int age, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    public People() {
        name="";
        lastName="";
        age=0;
        profession="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
