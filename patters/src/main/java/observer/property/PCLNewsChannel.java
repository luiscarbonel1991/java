package observer.property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import static java.lang.System.*;

public class PCLNewsChannel implements PropertyChangeListener {
    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
        out.println("this.news = " + this.news);
    }

    public void setNews(String news) {
        this.news = news;
    }
}
