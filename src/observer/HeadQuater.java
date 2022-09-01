/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;
import java.util.ArrayList;
/**
 *
 * @author kant2
 */
public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String Team1Data,Team2Data;
    private int ScoreData, Score1Data = 0 , Score2Data = 0;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }

    public void setTeam1Data(String aData) {
        Team1Data = aData;
    }

    public String getTeam1Data() {
        return Team1Data;
    }

    public void setTeam2Data(String aData) {
        Team2Data = aData;
    }
    public String getTeam2Data() {
        return Team2Data;
    }

    public void setTeamScoreData(String x) {
        if(x.equals("0")) setScore1Data();
        if(x.equals("1")) setScore2Data();
    }

    public int getScoreData() {
        return Score1Data;
    }

    public void setScore1Data() {
        Score1Data += 1;
        notifyObservers();
    }

    public int getScore1Data() {
        return Score1Data;
    }
    
    public void setScore2Data() {
        Score2Data += 1;
        notifyObservers();
    }

    public int getScore2Data() {
        return Score2Data;
    }

    @Override
    public void register (MyObserver observer) {
    list.add(observer);
    }
    
    @Override
    public void notifyObservers() {
        for(int j = 0; j < list.size(); ++j){
            list.get(j).update(this);
        }
    }
}
