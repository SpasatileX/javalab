import java.util.Objects;

/**
 * The type Animal.
 */
public abstract class Animal {
    /**
     * The Name.
     */
    protected final String name;
    /**
     * The Years.
     */
    protected final int years;
    public Animal(AnimalBuilder ab)
    {
        this.name = ab.name;
        this.years = ab.years;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets years.
     *
     * @return the years
     */
    public int getYears() {
        return years;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return years == animal.years && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    /**
     * The type Animal builder.
     */
    static abstract class AnimalBuilder
    {
        /**
         * The Name.
         */
        protected String name;
        /**
         * The Years.
         */
        protected int years;

        /**
         * Sets name.
         *
         * @param name the name
         * @return the name
         */
        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets years.
         *
         * @param years the years
         * @return the years
         */
        public AnimalBuilder setYears(int years) {
            this.years = years;
            return this;
        }

        /**
         * Build animal.
         *
         * @return the animal
         * @return the animal
         */
        abstract public Animal build();
    }
}
