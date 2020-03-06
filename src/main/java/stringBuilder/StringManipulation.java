package stringBuilder;

public class StringManipulation
{
    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder("codechef");

        // String can't be manipulated.
        /**
        final String x="123";
        final String s = x+x;

        String result=x.replaceAll("1","0");
        System.out.println(result);
        System.out.println(x);**/


        stringBuilder.append(" ").append("problems");
        stringBuilder.insert(4,"easy");
        stringBuilder.delete(4,4+4);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
