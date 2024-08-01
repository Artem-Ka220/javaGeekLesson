package lesson_15;

/**
 * Content
 */
public abstract class Content {

    private String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
