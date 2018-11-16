public class Stro {
    String name;
    int age;
    int exp;

    @Override
    public String toString() {
        return "Stro{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                '}';
    }

    public Stro(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public String build() {
        return "он строит ";
    }
    public String found() {
        return "он закладывает ";
    }
    public String destroy () {
        return "он разрушает ";
    };

}


