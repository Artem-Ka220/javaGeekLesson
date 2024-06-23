package homework_2;

import java.util.Arrays;
import java.util.ArrayList;

public class Printer {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

        // Answer ans = new Answer();
        System.out.println(Answer.answer(QUERY, PARAMS));
    }
}

class Answer {
    private static StringBuilder sbOne = new StringBuilder();

    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder anyString = new StringBuilder(QUERY);
        String ParamsOne = PARAMS.replace(":", "=");

        StringBuilder strBuilder = new StringBuilder(ParamsOne.substring(2, PARAMS.length() - 2));
        for (int i = 0; i < strBuilder.length(); i++) {
            if (strBuilder.charAt(i) == '"') {
                strBuilder.deleteCharAt(i);
            }
            if (strBuilder.charAt(i) == ' ') {
                strBuilder.deleteCharAt(i);
            }
            if (strBuilder.charAt(i) == ',') {
                strBuilder.deleteCharAt(i);
            }
        }

        String[] strings = strBuilder.toString().split(" ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("null")) {
                list.remove(list.get(i));
            }
        }
        int indexEqualOne = 0;

        ArrayList<String> listOne = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            indexEqualOne = list.get(i).indexOf('=');
            sbOne = sbOne.append(list.get(i));
            sbOne.insert(indexEqualOne + 1, "\'");

            listOne.add(sbOne.toString());
            sbOne.delete(0, sbOne.length());
        }
        try {
            for (int i = 0; i < listOne.size(); i++) {
                if (i < listOne.size() - 1) {
                    anyString.append(" " + listOne.get(i) + "\'" + " and");
                } else {
                    anyString.append(" " + listOne.get(i) + "\'");
                }
            }
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }

        return anyString;
    }
}