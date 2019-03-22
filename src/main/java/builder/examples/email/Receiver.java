package builder.examples.email;

import java.util.Optional;

public class Receiver extends CommonModule {

public Receiver() {
    super.moduleName = "收件人";
}

@Override
public String showInfo(String info) {
    return Optional.ofNullable(info).orElse("receiver : nana@qq.com \n");
}

} 