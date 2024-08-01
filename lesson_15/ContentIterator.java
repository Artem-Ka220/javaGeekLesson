package lesson_15;

import java.util.Iterator;
import java.util.List;

/**
 * ContentIterator
 */
public class ContentIterator implements Iterator<Content> {

    private int curentId;
    List<Content> conList;

    public ContentIterator(List<Content> conList) {
        this.conList = conList;
    }

    @Override
    public boolean hasNext() {
        return curentId < conList.size();
    }

    @Override
    public Content next() {
        return conList.get(curentId++);
    }

}
