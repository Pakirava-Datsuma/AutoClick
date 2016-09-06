import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by swanta on 06.09.16.
 */
public class TemplatesList {
    private List<ControlTemplate> templates = new ArrayList<>();

    public List<ControlTemplate> findMatches(List<ControlInstance> controls) {
        return templates.stream()
                .filter(ControlTemplate::matches)
                .collect(Collectors.toList());
    }
}
