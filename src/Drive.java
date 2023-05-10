public class Drive extends People {
    int score;

    public Drive(String name, String lastName, int age, String profession, int score) {
        super(name, lastName, age, profession);
        this.score = score;
    }

    public Drive() {
        super();
        score=0;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Drive{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
