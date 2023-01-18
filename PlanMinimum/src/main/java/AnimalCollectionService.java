import java.util.List;
import java.util.stream.Collectors;

public class AnimalCollectionService {
    private List<Animal> collection;

    public AnimalCollectionService(List<Animal> _collection){
        setCollection(_collection);
    }

    public void addElement(Animal element){
        collection.add(element);
    }
    public List<Animal> getCollection(){
        return collection;
    }
    public void removeElement(Animal element){
        collection.remove(element);
    }
    public void setCollection(List<Animal> collection){
        this.collection = collection;
    }

    public List<Animal> getByName(String name){
        return getCollection().stream().filter(animal -> animal.name == name).collect(Collectors.toList());
    }

    public List<Animal> getByYears(int years){
        return getCollection().stream().filter(animal -> animal.years == years).collect(Collectors.toList());
    }
}
