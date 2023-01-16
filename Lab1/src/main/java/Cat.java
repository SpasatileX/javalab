import java.util.Objects;

/**
 * The type Cat.
 */
public class Cat extends Animal {
    private final int paws;

    /**
     * Instantiates a new Cat.
     *
     * @param builder the builder
     */
    public Cat(CatBuilder builder)
    {
        super(builder);
        this.paws = builder.paws;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return paws == cat.paws;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), paws);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "paws=" + paws +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    /**
     * Gets paws.
     *
     * @return the paws
     */
    public int getPaws() {
        return paws;
    }

    /**
     * The type Cat builder.
     */
    public final static class CatBuilder extends AnimalBuilder
    {
        private int paws;

        /**
         * Sets paws.
         *
         * @param paws the paws
         */
        public void setPaws(int paws) {
            this.paws = paws;
        }

        @Override
        public Animal build() {
            return new Cat(this);
        }
    }
}
