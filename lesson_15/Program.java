package lesson_15;

public class Program {

    public static void main(String[] args) {
        Repository audioContentStorage = new Repository("audioStorage");
        audioContentStorage.addContent(new AudioContent("track_001.mp3"));
        audioContentStorage.addContent(new AudioContent("03 Дорожка 03.wma"));

        for (int i = 0; i < audioContentStorage.count(); i++) {
            System.out.println(audioContentStorage.getContetn(i));
        }

        Repository videoContentStroge = new Repository("videoStorage");
        videoContentStroge.addContent(new VideoContent("Новый фильм 1.wmv"));
        videoContentStroge.addContent(new VideoContent("Новый фильм 5.3gp"));

        for (int i = 0; i < videoContentStroge.count(); i++) {
            System.out.println(videoContentStroge.getContetn(i));
        }

        for (Content myContent : audioContentStorage) {
            System.out.println(myContent);
        }

        for (Content iterable_element : videoContentStroge) {
            System.out.println(iterable_element);
        }

    }
}
