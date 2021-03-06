package instrumentacao.automatica;

/**
 *
 * @author cleber
 */
public class Automatica {

    public synchronized String nextUrlOrNull() {
        if (hasNext()) {
            ThreadJiglePoint.jiggle();
            String url = urlGenerator.next();
            ThreadJiglePoint.jiggle();
            updateHasNext();
            ThreadJiglePoint.jiggle();
            return url;
        }
        return null;
    }
}
