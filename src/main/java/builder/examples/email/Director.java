package builder.examples.email;

public class Director {

    private String name;
    private AbstractBuilder abstractBuilder;

    public Director(String name, AbstractBuilder abstractBuilder) {
        this.name = name;
        this.abstractBuilder = abstractBuilder;
    }

    public void buildConcreteEmail() {
        System.out.println("build product for " + name);
        Email email = abstractBuilder.builderObject();
        email.generateEmail();
    }

}