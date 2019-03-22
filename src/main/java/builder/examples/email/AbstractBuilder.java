package builder.examples.email;

/**
 * @author weifengzhu
 */
public abstract class AbstractBuilder {

protected Email email;

public AbstractBuilder() {
    email = new Email();
}

public abstract Email builderObject();

}