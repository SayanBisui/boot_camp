/*
    Job of Chance : Deal with probabilities
 */
package chance;

public class Chance {
    private double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance create(double value) throws InvalidChanceValueException {
        if (value > 1 || value < 0)
            throw new InvalidChanceValueException("Value should be from 0 to 1");
        return new Chance(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        return Double.compare(chance.value, value) == 0;

    }

    public double not() {
        return 1 - value;
    }

    public double and(Chance anotherValue) {
        return value * anotherValue.value;
    }


}