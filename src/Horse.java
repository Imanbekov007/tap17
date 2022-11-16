public class Horse extends Animal{
    private String colour;
    public Horse(int weight, int age, char gender, String nickname,String colour) {
        super(weight, age, gender, nickname);
        this.colour=colour;
    }
}
