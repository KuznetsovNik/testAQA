package Example4;

public class BalancedBracketSequences {
    static String placeError;

    public static void main(String[] args) {
        String sequences = "[((())()(())]]";
        System.out.println(sequences + " - Можно ли считать эту последовательность правильной?");
        System.out.println(check(sequences) ? "Да" : "Нет, ошибка в местах этих пар " + placeError);
    }
    public static boolean check(String sequences)
    {
        int lengthTotal;
        int lengthSequences;
        String total = sequences.replaceAll("[^()\\[\\]{}]","");
        do {
            lengthTotal = total.length();
            total = total.replaceAll("\\(\\)", "");
            total = total.replaceAll("\\[\\]", "");
            total = total.replaceAll("\\{\\}", "");
            lengthSequences = total.length();
            if (lengthSequences == lengthTotal){
                placeError = total;
            }
        } while (lengthTotal != lengthSequences);
        return (lengthSequences == 0);
    }
}
