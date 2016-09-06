/**
 * Created by swanta on 05.09.16.
 */
public class ControlTemplate {
    protected Button button;
    protected String description;

    public ControlTemplate() {
    }

    public boolean matches (ControlInstance set) {
        return button.matches(set.getButton());
    }

    public Button getButton() {
        return button;
    }
}
