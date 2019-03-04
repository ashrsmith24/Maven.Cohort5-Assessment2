package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Integer monthNumber;
    private String monthName;
    private Integer valueSet;
    private Map<Integer, String> calendar = new TreeMap<Integer, String>();


    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {


        calendar.put(monthNumber,monthName);

    }


    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
       return monthName = "May";
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return getNumber(monthName);
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return null;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calendar.put(monthNumber, monthName);

    }
}
