import com.sun.istack.internal.NotNull;

import static java.awt.SystemColor.window;

/**
 * Created by swanta on 05.09.16.
 */
public class Window {
    @NotNull
    String title, text;

    // check equality via regexp
    public boolean matches(Window w) {

        if (!getTitle().matches(w.getTitle())) return false;
        return getText().matches(w.getText());

    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Window(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
