package observer.subject;

public class ObserverPatterDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver();
        subject.addObserver(binaryObserver);
        subject.setState(25);
    }
}
