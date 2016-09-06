/**
 * Created by swanta on 05.09.16.
 */
public class ControlInstance {
    @Override
    //just for performance
    public boolean matches(ControlInstance set) {
        return button.matches(set.getButton());
    }

    public boolean matches(ControlTemplate controlTemplate) {
        return controlTemplate.matches(this);
    }

    public Button getButton() {
        return button;
    }
}
