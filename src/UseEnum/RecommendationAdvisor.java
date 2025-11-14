package UseEnum;

public class RecommendationAdvisor implements Advisor {

    @Override
    public void advise(Day day) {

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                    System.out.println("Будь продуктивним, сплануй день");
                break;

            case FRIDAY:
                    System.out.println("Happy Friday");
                break;

            case SATURDAY, SUNDAY:
                    System.out.println("Рекомендую відвідати парк або сходити в кіно");
                break;

            default:
                System.out.println("Невідомий день");
        }
    }
}
