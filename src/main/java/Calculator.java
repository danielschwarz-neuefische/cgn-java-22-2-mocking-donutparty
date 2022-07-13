public class Calculator {
    public static int getNumberOfDonutsPerPerson(DonutParty donutParty) {
        return donutParty.getNumberOfDonuts() / donutParty.getNumberOfPersons();
    }
}
