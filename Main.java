// PARTNER NAME: Jane Doe
// PARTNER NAME: John Smith
// CS111 SECTION #: 101
// DATE: 2025-02-09

public class Main
{
    public static void main(String[] args)
    {
        //DECLARATION + INITIALIZATION SECTION
        // Define the total card width (including left/right borders)
        final int CARD_WIDTH = 72;
        // The inner width is the card width minus the two border characters
        final int INNER_WIDTH = CARD_WIDTH - 2;
        
        // Variables to store Employment Authorization Card (EAC) data
        String surname = "Doe";
        String givenName = "John";
        String uscisNumber = "123-456-789";
        String category = "DACA";
        String cardNumber = "000111222333";
        String countryOfBirth = "Mexico";
        String termsAndConditions = "Limited";
        String dateOfBirth = "01/01/1990";
        String sex = "M";
        String validFrom = "01/01/2025";
        String cardExpires = "01/01/2030";
        
        //INPUT SECTION
        // N/A
        
        //CALCULATION SECTION
        // N/A
        
        //OUTPUT SECTION
        // Top border: use the left corner, repeat the horizontal line, and then add the right corner.
        System.out.println("╔" + "═".repeat(INNER_WIDTH) + "╗");
        
        // For every interior line we use String.format() so that the content (including any substituted
        // variable) is left-padded and then the right border is appended. This “closes” the card.
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "         UNITED STATES OF AMERICA"));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "                                  EMPLOYMENT AUTHORIZATION CARD"));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "                       Surname"));
        // Substitute the placeholder with the surname variable:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "                       " + surname));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "  .----.    .----.     Given Name"));
        // Substitute the placeholder with the givenName variable:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", " (   ^  \\  /  ^   )    " + givenName));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "        |  |           USCIS#         Category   Card#"));
        // Substitute the placeholders for USCIS number, category, and card number:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "       _/  \\_          " + uscisNumber + "    " + category + "        " + cardNumber));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "      (_    _)         Country of Birth"));
        // Substitute the placeholder with the countryOfBirth variable:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "   ,    `--`    ,      " + countryOfBirth));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "   \\'-.______.-'/      Terms and Conditions"));
        // Substitute the placeholder with the termsAndConditions variable:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "    \\          /       " + termsAndConditions));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "     '.--..--.'        Date of Birth   Sex"));
        // Substitute the placeholder with the dateOfBirth and sex variables:
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "       `\"\"\"\"\"`         " + dateOfBirth + "     " + sex));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "                       Valid From:     " + validFrom));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", "                       Card Expires:   " + cardExpires));
        System.out.println(String.format("║%-" + INNER_WIDTH + "s║", " ascii art by: jgs     NOT VALID FOR REENTRY TO U.S."));
        
        // Bottom border: use the left bottom corner, the horizontal line, and the right bottom corner.
        System.out.println("╚" + "═".repeat(INNER_WIDTH) + "╝");
        //ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
    }
}
