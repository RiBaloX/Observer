/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author kant2
 */
public class Senior implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println("live result: "+((HeadQuater)o).getTeam1Data()+" "+((HeadQuater)o).getScore1Data()+" - " + ((HeadQuater)o).getScore2Data()+" "+((HeadQuater)o).getTeam2Data());
    }

}
