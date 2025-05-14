package app.ecommerce.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum CategoryType {
    ELECTRONICS("Electronics")
    ,CLOTH("Fashion")
    ,HOME("Home")
    ,BEAUTY("Beauty")
    ,SPORTS("Sports")
    ,FOOD("Food");

    private final String displayName;
}
