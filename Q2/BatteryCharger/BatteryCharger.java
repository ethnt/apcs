
public class BatteryCharger {
    /*
     * Instance variables.
     */
    private int[] rates;
    
    /*
     * Constructors.
     */
    public BatteryCharger() {
        int[] table = { 50, 60, 160, 60, 80, 10, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 180, 180, 140, 100, 80, 60 };
        rates = table;
    }
    
    public BatteryCharger(int[] table) {
        rates = table;
    }
    
    /*
     * Methods.
     */
    private int getChargingCost(int startHour, int chargeTime) {
        int result = 0;
        
        for (int i = startHour; i < startHour + chargeTime; i++) {
            result = result + rates[i % rates.length];
        }
        
        return result;
    }
    
    public int getChargeStartTime(int chargeTime) {
        int result = -1;
        int option = getChargingCost(0, chargeTime);
        
        for (int i = 0; i < rates.length; i++) {
            if (getChargingCost(i, chargeTime) < option) {
                result = i;
            }
        }
        
        return result;
    }
}
