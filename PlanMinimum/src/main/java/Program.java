import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
        AnimalCollectionService list = new AnimalCollectionService(new ArrayList<>());
        list.addElement(new Animal("Stepan", 1));
        list.addElement(new Animal("Vania", 3));
        list.addElement(new Animal("Vlad", 2));
        list.addElement(new Animal("Stepan", 4));
        list.addElement(new Animal("Lola", 2));

        System.out.println("Stepan`s:");
        printAllAnimalInList(list.getByName("Stepan"));

        System.out.println("\n2 years: ");
        printAllAnimalInList(list.getByYears(2));

        List<Animal> a = list.getCollection();
        SerializeToJSON serializerJSON = new SerializeToJSON();
        SerializeToXml serializerToXml = new SerializeToXml();
        SerializeToTxt serializerToTxt = new SerializeToTxt();

        serializerJSON.writeToFile(a,"testJSON.json");
        serializerToXml.writeToFile(a,"testXML.xml");
        serializerToTxt.writeToFile(a,"testTXT.txt");

    }
    public static void printAllAnimalInList(List<Animal> list){
        for(int i = 0; i < list.size(); i++){
            Animal el = list.get(i);
            System.out.println("Name: " + el.getName() + ", age: " + el.getYears());
        }
    }
}
