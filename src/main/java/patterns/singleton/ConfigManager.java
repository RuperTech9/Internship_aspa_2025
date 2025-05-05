package patterns.singleton;

public class ConfigManager {
    private static ConfigManager instance;

    private String config1;
    private String config2;

    //Constructoir privado
    private ConfigManager() {
        config1 = "modo-produccion";
        config2 = "es_ES";
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfig1() {
        return config1;
    }

    public void setConfig1(String config1) {
        this.config1 = config1;
    }

    public String getConfig2() {
        return config2;
    }

    public void setConfig2(String config2) {
        this.config2 = config2;
    }
}
