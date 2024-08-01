package lesson_15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Repository
 */
public class Repository implements Iterable<Content> {

    private String name;
    private List<Content> list;

    public Repository(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void addContent(Content content) {
        list.add(content);
    }

    public int count() {
        return list.size();
    }

    public Content getContetn(Integer index) {
        return list.get(index);
    }

    @Override
    public Iterator<Content> iterator() {
        return new ContentIterator(list);
    }

}
