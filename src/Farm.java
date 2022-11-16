import java.util.Arrays;

public class Farm extends Animal{
    private String address;

    private Animal[] cows;
    private Animal[] sheeps;
    private Animal[] horses;
    private String ownername;

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheeps=" + Arrays.toString(sheeps) +
                ", horses=" + Arrays.toString(horses) +
                ", ownername='" + ownername + '\'' +
                '}';
    }

    public Farm(String address, Animal[] cows, Animal[] sheeps, Animal[] horses, String ownername) {

        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownername = ownername;
    }

    public Farm(int weight, int age, char gender, String nickname, String address, Animal[] cows, Animal[] sheeps, Animal[] horses, String ownername) {
        super(weight, age, gender, nickname);
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.ownername = ownername;
    }
}

