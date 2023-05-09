public class RaceTeam extends Team{

    int score;
    Drive driver1;
    Drive driver2;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public People getDriver1() {
        return driver1;
    }

    public void setDriver1(Drive driver1) {
        this.driver1 = driver1;
    }

    public People getDriver2() {
        return driver2;
    }

    public void setDriver2(Drive driver2) {
        this.driver2 = driver2;
    }
}
