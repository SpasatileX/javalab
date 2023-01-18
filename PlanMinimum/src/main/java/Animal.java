import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
public class Animal {
    @JsonProperty("name")
    protected String name;
    @JsonProperty("years")
    protected int years;
    public Animal(String name, int years) {
        setName(name);
        setYears(years);
    }
    public String getName(){
        return name;
    }
    public int getYears(){
        return years;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYears(int years){
        this.years = years;
    }

    @Override
    public String toString(){
        return "Name: " + name + ". Years: " + years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return name == animal.name && years == animal.years;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years);
    }
}
