package builder.examples.email;

public class Client {

    public static void main(String[] args) {

        Director director1 = new Director("common Email", new EmailAbstractBuilder1());
        director1.buildConcreteEmail();

        Director director2 = new Director("music Email", new EmailAbstractBuilder2());
        director2.buildConcreteEmail();

        Director director3 = new Director("cartnoon Email", new EmailAbstractBuilder3());
        director3.buildConcreteEmail();
    }

}