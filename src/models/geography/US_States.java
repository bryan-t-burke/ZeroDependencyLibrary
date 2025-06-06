package models.geography;

public enum US_States {
    ALABAMA("Alabama", "US-AL", "AL"),
    ALASKA("Alaska", "US-AK", "AK"),
    ARIZONA("Arizona", "US-AZ", "AZ"),
    ARKANSAS("Arkansas", "US-AR", "AR"),
    CALIFORNIA("California", "US-CA", "CA"),
    COLORADO("Colorado", "US-CO", "CO"),
    CONNECTICUT("Connecticut", "US-CT", "CT"),
    DELAWARE("Delaware", "US-DE", "DE"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "US-DC", "DC"),
    FLORIDA("Florida", "US-FL", "FL"),
    GEORGIA("Georgia", "US-GA", "GA"),
    HAWAII("Hawaii", "US-HI", "HI"),
    IDAHO("Idaho", "US-ID", "ID"),
    ILLINOIS("Illinois", "US-IL", "IL"),
    INDIANA("Indiana", "US-IN", "IN"),
    IOWA("Iowa", "US-IA", "IA"),
    KANSAS("Kansas", "US-KS", "KS"),
    KENTUCKY("Kentucky", "US-KY", "KY"),
    LOUISIANA("Louisiana", "US-LA", "LA"),
    MAINE("Maine", "US-ME", "ME"),
    MARYLAND("Maryland", "US-MD", "MD"),
    MASSACHUSETTS("Massachusetts", "US-MA", "MA"),
    MICHIGAN("Michigan", "US-MI", "MI"),
    MINNESOTA("Minnesota", "US-MN", "MN"),
    MISSISSIPPI("Mississippi", "US-MS", "MS"),
    MISSOURI("Missouri", "US-MO", "MO"),
    MONTANA("Montana", "US-MT", "MT"),
    NEBRASKA("Nebraska", "US-NE", "NE"),
    NEVADA("Nevada", "US-NV", "NV"),
    NEW_HAMPSHIRE("New Hampshire", "US-NH", "NH"),
    NEW_JERSEY("New Jersey", "US-NJ", "NJ"),
    NEW_MEXICO("New Mexico", "US-NM", "NM"),
    NEW_YORK("New York", "US-NY", "NY"),
    NORTH_CAROLINA("North Carolina", "US-NC", "NC"),
    NORTH_DAKOTA("North Dakota", "US-ND", "ND"),
    OHIO("Ohio", "US-OH", "OH"),
    OKLAHOMA("Oklahoma", "US-OK", "OK"),
    OREGON("Oregon", "US-OR", "OR"),
    PENNSYLVANIA("Pennsylvania", "US-PA", "PA"),
    RHODE_ISLAND("Rhode Island", "US-RI", "RI"),
    SOUTH_CAROLINA("South Carolina", "US-SC", "SC"),
    SOUTH_DAKOTA("South Dakota", "US-SD", "SD"),
    TENNESSEE("Tennessee", "US-TN", "TN"),
    TEXAS("Texas", "US-TX", "TX"),
    UTAH("Utah", "US-UT", "UT"),
    VERMONT("Vermont", "US-VT", "VT"),
    VIRGINIA("Virginia", "US-VA", "VA"),
    WASHINGTON("Washington", "US-WA", "WA"),
    WEST_VIRGINIA("West Virginia", "US-WV", "WV"),
    WISCONSIN("Wisconsin", "US-WI", "WI"),
    WYOMING("Wyoming", "US-WY", "WY");

    public final String full_name;
    public final String iso; // iso-3166
    public final String abbreviation;

    US_States(String full_name, String iso, String abbreviation) {
        this.full_name = full_name;
        this.iso = iso;
        this.abbreviation = abbreviation;
    }
}
