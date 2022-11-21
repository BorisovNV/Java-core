package lesson8;

public final class AppGlobal {

    private static AppGlobal INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "3X1p7320ePjXvllDmokQ4nd63pt4GQpk";
    private final String DB_FILENAME = "application.db";

    private AppGlobal() {
    }

    public static AppGlobal getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new AppGlobal();
        }

        return INSTANCE;
    }

    public String getDbFileName() {
        return DB_FILENAME;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}
