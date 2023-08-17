package enumaration;

enum MonthsOfYear {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

enum BookCategory {
    COMEDY, ACTION, HORROR, MYSTERY, FANTASY
}

enum CanteenProductCategory {
    SNACKS, SWEETS, BEVERAGES, SANDWICHES, FRUITS, SNACK_MEALS, SOUPS, MAIN_MEALS
}

enum SocialMediaCategory {
    FRIENDSHIP, PHOTOS, NEWS
}

public class Activity {
    public static void main(String[] args) {
        System.out.println("Months of the year:");
        for (MonthsOfYear month : MonthsOfYear.values()) {
            System.out.println(month);
        }

        System.out.println("\nBook categories:");
        for (BookCategory category : BookCategory.values()) {
            System.out.println(category);
        }

        System.out.println("\nCanteen product categories:");
        for (CanteenProductCategory category : CanteenProductCategory.values()) {
            System.out.println(category);
        }

        System.out.println("\nSocial media categories:");
        for (SocialMediaCategory category : SocialMediaCategory.values()) {
            System.out.println(category);
        }
    }
}

