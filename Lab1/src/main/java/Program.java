public class Program {
    public static void main(String[] args) {
        Bird.BirdBuilder myParotBuilder = new Bird.BirdBuilder();
        myParotBuilder.setName("Kesha");
        myParotBuilder.setYears(1);
        myParotBuilder.setWings(2);
        myParotBuilder.setCanFly(true);

        Cat.CatBuilder myCatBuilder = new Cat.CatBuilder();
        myCatBuilder.setName("Tom");
        myCatBuilder.setYears(2);
        myCatBuilder.setPaws(4);

        Bird myParot = (Bird) myParotBuilder.build();
        Cat myCat = (Cat) myCatBuilder.build();
        System.out.println(myParot.toString());
        System.out.println(myCat);
    }
}
