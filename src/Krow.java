public class Krow extends Stro{
    @Override
    public String toString() {
        return "Krow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }

    @Override
    public String build() {
        return "он кроет ";
    }

    public Krow(String name, int age, int exp) {
        super(name, age, exp);

    }
}
