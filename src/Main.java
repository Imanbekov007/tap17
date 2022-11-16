public class Main {
    public static void main(String[] args) {
         Animal cow=new Cow(200,12, 'M',"Cow11");
         Animal cow1=new Cow(200,12, 'M',"Cow12");
         Animal cow2=new Cow(200,12, 'M',"Cow13");
         Animal cow3=new Cow(200,12, 'M',"Cow14");
         Animal cow4=new Cow(200,12, 'M',"Cow15");
         Animal[] cows = {cow,cow1,cow2,cow3,cow4};
         Animal[]cows1={cow1};

         Animal sheep=new Sheep(50,12,'F',"Sheep11");
             Animal sheep1=    new Sheep(45,11,'m',"Sheep12");
             Animal sheep2=    new Sheep(45,11,'m',"Sheep13");

             Animal[] sheeps={sheep1,sheep,sheep2};
             Animal[] sheeps2={sheep};
        Animal horse=new Horse(50,12,'F',"Horse11","Red");
         Animal horse1=   new Horse(45,11,'M',"Horse12","Brown");
         Animal[] horses={horse1,horse};
         Animal[] horses2={horse};

         Farm farm=new Farm("selo",cows,sheeps,horses,"Erbolot");
         Farm farm1=new Farm("City",cows1,sheeps2,horses2,"Nurzultan");
        System.out.println(farm);
        System.out.println(farm1);

    }
}