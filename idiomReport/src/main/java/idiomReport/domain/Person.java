package idiomReport.domain;

public class Person {
    private String idiom;
    private String name;

    

    public Person(String idiom, String name) {
        this.idiom = idiom;
        this.name = name;
    }

    public static Person newInstance(String idiom, String name) {
        return new Person(idiom, name);
    }

    public String getIdiom() {
        return idiom;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [idiom=" + idiom + ", name=" + name + "]";
    }

    
}
