public class Masch extends Stro {
    @Override
    public String toString() {
        return "Masch{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    String color;
    String brand;
    String size;

    public Masch(String name, int age, int exp, String color, String brand, String size) {
        super(name, age, exp);
        this.color = color;
        this.brand = brand;
        this.size = size;
    }

    public String purchase() {
        return "он покупает ";
    }
    public String painting() {
        return "он красит ";
    }
    public String grinding() {
        return "он шлифует ";
    }
}
