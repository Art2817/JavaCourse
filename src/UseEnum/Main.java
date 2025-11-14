package UseEnum;

public class Main {
    public static void main(String[] args) {

        Advisor advisor = new RecommendationAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}
