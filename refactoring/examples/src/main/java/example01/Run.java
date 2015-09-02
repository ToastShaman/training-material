package example01;

public class Run {

    public static void main(String[] args) {
        NewCircumferenceService circumference = new NewCircumferenceService();
        CircumferenceVO result = new CircumferenceVO();

        circumference.calCircum(2, false, result, true);
        System.out.println(result.getRadius());

        circumference.calCircum(2, true, result, true);
        System.out.println(result.getRadius());
        System.out.println("========================================");

        CircumferenceService.PI = 3.1;
        circumference.calCircum(2, false, result, true);
        System.out.println(result.getRadius());

        circumference.calCircum(2, true, result, true);
        System.out.println(result.getRadius());
        System.out.println("========================================");

        circumference.calCircum(2, false, null, true);
        System.out.println(result.getRadius());
    }
}
