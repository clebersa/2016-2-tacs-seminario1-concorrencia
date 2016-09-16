package instrumentacao.manual;

/**
 *
 * @author cleber
 */
public class Manual {

    public synchronized String nextUrlOrNull() {
        if (hasNext()) {
            String url = urlGenerator.next();
            Thread.yield(); // inserido para teste.
            updateHasNext();
            return url;
        }
        return null;
    }
}
