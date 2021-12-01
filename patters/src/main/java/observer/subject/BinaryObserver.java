package observer.subject;

import static java.lang.System.*;

public class BinaryObserver implements Observer {

    @Override
    public void update(Subject subject) {
        out.println( "Octal String: " + Integer.toBinaryString((Integer) subject.getState()) );
    }
}
