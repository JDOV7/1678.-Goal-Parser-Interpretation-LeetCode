package leetcode;

public class GoalParserInterpretation1678 {

    public void GoalParserInterpretation1678() {
        String command = "(al)G(al)()()G";
        StringBuffer sText = new StringBuffer(command);
        for (int i = 0; i < sText.length(); i++) {
            if (sText.indexOf("()") != -1) {
                int iPos=sText.indexOf("()");
                sText.setCharAt(iPos, 'o');
                sText.deleteCharAt(iPos + 1);
                i = i - 1;
            } else if (sText.indexOf("(al)") != -1) {
                sText.replace(sText.indexOf("(al)"), sText.indexOf("(al)") + 4, "al");
                i = i - 1;
            }
        }
        System.out.println(sText);
    }
}
