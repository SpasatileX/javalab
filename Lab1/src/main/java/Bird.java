import java.util.Objects;

/**
 * The type Bird.
 */
public class Bird extends Animal {
    private final int wings;
    private final boolean canFly;

    /**
     * Instantiates a new Bird.
     *
     * @param builder the builder
     */
    public Bird(BirdBuilder builder)
    {
        super(builder);
        this.wings = builder.wings;
        this.canFly = builder.canFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return wings == bird.wings && canFly == bird.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wings, canFly);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                ", canFly=" + canFly +
                ", name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    /**
     * Gets wings.
     *
     * @return the wings
     */
    public int getWings() {
        return wings;
    }

    /**
     * Is can fly boolean.
     *
     * @return the boolean
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * The type Bird builder.
     */
    public final static class BirdBuilder extends AnimalBuilder
    {
        private int wings;
        private boolean canFly;

        /**
         * Sets wings.
         *
         * @param wings the wings
         */
        public void setWings(int wings) {
            this.wings = wings;
        }

        /**
         * Sets can fly.
         *
         * @param canFly the can fly
         */
        public void setCanFly(boolean canFly) {
            this.canFly = canFly;
        }

        @Override
        public Animal build() {
            return new Bird(this);
        }
    }
}
