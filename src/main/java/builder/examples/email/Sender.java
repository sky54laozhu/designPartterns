package builder.examples.email;

import java.util.Optional;

public class Sender extends CommonModule{

public Sender() {
    super.moduleName = "发件人";
}

@Override
public String showInfo(String info) {
    return Optional.ofNullable(info).orElse("sender : nicky@qq.com \n");
}

}
