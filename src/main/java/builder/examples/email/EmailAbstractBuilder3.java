package builder.examples.email;

public class EmailAbstractBuilder3 extends AbstractBuilder {

    @Override
    public Email builderObject() {
        email.addComponent(new Sender());
        email.addComponent(new Receiver());
        email.addComponent(new Title());
        email.addComponent(new Content());
        email.addComponent(new Cartoon());
        return super.email;
    }

}