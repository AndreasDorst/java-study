package stp.basic.playtextprocessor;

public class RoleTextFormatter {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                    result.append(textLines[j].replaceFirst(role + ":", (j + 1) + ")")).append("\n");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }

}
