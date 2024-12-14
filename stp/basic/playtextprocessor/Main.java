package stp.basic.playtextprocessor;

public class Main {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] rolelines = new StringBuilder[roles.length];

        for (int i = 0; i < roles.length; i++) {
            rolelines[i] = new StringBuilder(roles[i] + ":\n");
        }

        for (int i = 0; i < textLines.length; i++) {
            String line = textLines[i];
            int colonIndex = line.indexOf(":");

            String role = line.substring(0, colonIndex).trim();
            String text = line.substring(colonIndex + 1).trim();

            for (int j = 0; j < roles.length; j++) {
                if (roles[j].equals(role)) {
                    rolelines[j].append((i + 1) + ") " + text).append("\n");
                    break;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder roleText : rolelines) {
            result.append(roleText).append("\n");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

}
