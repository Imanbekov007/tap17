public class Animal {
    private int weight;
    private int age;
    private char gender;
    private String nickname;

    public Animal() {
    }

    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Animal(int weight, int age, char gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;
    }
}
