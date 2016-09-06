import com.sun.istack.internal.NotNull;

/**
 * Created by swanta on 05.09.16.
 */
public class Button {

    @NotNull
    Window window;
    @NotNull
    String title;

    public Button(String title) {
        this.title = title;
    }

    // check equality via regexp
    public boolean matches(Button b) {
        return b.getTitle().matches(this.title);

    }

    public String getTitle() {
        return title;
    }
}
