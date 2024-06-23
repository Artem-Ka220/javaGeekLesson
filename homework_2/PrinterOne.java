package homework_2;

public class PrinterOne {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }
        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        stringBuilder.append(PARAMS.substring(2, 6));
        stringBuilder.append("='");
        stringBuilder.append(PARAMS.substring(9, 15));
        stringBuilder.append("\'" + " and ");
        stringBuilder.append(PARAMS.substring(19, 26));
        stringBuilder.append("='");
        stringBuilder.append(PARAMS.substring(29, 35));
        stringBuilder.append("\'" + " and ");
        stringBuilder.append(PARAMS.substring(39, 43));
        stringBuilder.append("='");
        stringBuilder.append(PARAMS.substring(46, 52));
        stringBuilder.append("\'");
        return stringBuilder;
    }
}