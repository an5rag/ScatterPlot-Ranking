package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by an5ra on 9/10/2015.
 */
public class CategoryPointsCount {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();//will be used to map product-count pairs
    DataStore dataStore;
    ArrayList<Tuple> tuples;
    /**
     * This function uses a Hash Map to first count the number
     * of points in each category
     * and saves in hashmap hm
     * @param list
     */
    public CategoryPointsCount(DataStore dataStore)
    {
        this.dataStore = dataStore;
        tuples = dataStore.dataStore;
        // Put elements to the map
        for(int i=0; i<tuples.size(); i++)
        {
            String key = tuples.get(i).product;
            Integer value = hm.get(key);
            if (value != null)
            {
                hm.put(key, new Integer(value + 1));

            } else
            {
                hm.put(key, new Integer(1));
            }

        }

        for(int i=0; i<tuples.size(); i++)
        {
            String key = tuples.get(i).product;
            Integer value = hm.get(key);
            double score = 1.0/value;
            tuples.get(i).setScore(score);

        }
    }
    public void normalizeDataStore(DataStore d)
    {

    }
}
