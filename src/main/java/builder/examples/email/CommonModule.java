package builder.examples.email;

import java.time.LocalDate;
import java.util.Optional;

public abstract class CommonModule implements Module {

    protected String moduleName;

//    protected String productionTime() {
//        return Optional.ofNullable(moduleName).orElse("") + "--> createTime : " + LocalDate.now().toString();
//    }
}