package wahlomat;

import java.util.Arrays;

public class Staaten {

    String[] staaten = {
        "Kalifornien",
        "Texas",
        "Florida",
        "New York",
        "Illinois",
        "Pennsylvania",
        "Ohio",
        "Georgia",
        "North Carolina",
        "Michigan",
        "New Jersey",
        "Virginia",
        "Washington",
        "Arizona",
        "Massachusetts",
        "Indiana",
        "Tennessee",
        "Missouri",
        "Maryland",
        "Wisconsin",
        "Colorado",
        "Minnesota",
        "South Carolina",
        "Alabama",
        "Louisiana",
        "Kentucky",
        "Oregon",
        "Oklahoma",
        "Connecticut",
        "Puerto Rico",
        "Iowa",
        "Utah",
        "Mississippi",
        "Nevada",
        "Arkansas",
        "Kansas",
        "New Mexico",
        "Nebraska",
        "West Virginia",
        "Idaho",
        "Hawaii",
        "New Hampshire",
        "Maine",
        "Rhode Island",
        "Montana",
        "Delaware",
        "South Dakota",
        "Alaska",
        "North Dakota",
        "District of Columbia",
        "Vermont",
        "Wyoming"
    };

    int[] einwohner = {
        39250017,
        2786259,
        20612439,
        19745289,
        12801539,
        12784227,
        11614373,
        10310653,
        10146787,
        9928301,
        8944469,
        8411807,
        7288003,
        6931071,
        6811779,
        6633053,
        6651195,
        6093001,
        6016447,
        5778707,
        5540545,
        5519951,
        4961119,
        4863301,
        4681665,
        4436973,
        4093465,
        3923561,
        3576451,
        3411307,
        3134693,
        3051217,
        2988725,
        2940059,
        2937979,
        2907289,
        2081015,
        1907115,
        1831101,
        1683141,
        1428557,
        1334795,
        1331479,
        1052425,
        1042521,
        952065,
        865453,
        741893,
        757951,
        681171,
        624593,
        585501

    };

     public String[] ArrayStaaten() {
        String[] erg = new String[staaten.length];
        for (int i = 0; i < staaten.length; i++) {
            erg[i] = staaten[i];

        }
        return erg;
    }

    public int[] ArrayEinwohner() {
        int[] erg = new int[einwohner.length];
        for (int i = 0; i < einwohner.length; i++) {
            erg[i] = einwohner[i];

        }
        return erg;
    }
}
