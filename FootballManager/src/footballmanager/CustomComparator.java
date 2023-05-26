
package footballmanager;

import java.util.Comparator;   //A comparator interface is used to order the objects of user-defined classes.
//A comparator object is capable of comparing two objects of the same class. Following function compare obj1 with obj2.

/**
 *
 * @author ahdabnasir
 */
public class CustomComparator implements Comparator<FootballClub> {    
    
    @Override
    public int compare(FootballClub t, FootballClub t1) {  //compare between 2 clubs
        
        if(t.getPoints() > t1.getPoints())     //if club t has more points 
            return -1;
        else 
            if (t.getPoints() < t1.getPoints())    
                return 1;
            else {
                int goalDif = t.getScoredGoalsCount()-t.getReceivedGoalsCount();    //if both teams got same points, compare with the goal difference 
                int goalDif1 = t1.getScoredGoalsCount()-t1.getReceivedGoalsCount();     
                if(goalDif > goalDif1)
                    return -1;
                else
                    if(goalDif < goalDif1)
                        return 1;
                    else return 0;
            }
        
    }
}