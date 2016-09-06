/**
 * Created by swanta on 05.09.16.
 */
public class Model {
    private TemplatesList rules = new TemplatesList();
    private SystemModel system = new SystemModel();

    public void checkWindows(){
        rules.findMatches(system.getVisibleControls());
    }
}
