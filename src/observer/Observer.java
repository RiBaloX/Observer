/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;
import java.util.Scanner;
/**
 *
 * @author kant2
 */

public class Observer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Online obj1 = new Online();
        LiveSteam obj2 = new LiveSteam();
        HeadQuater obj = new HeadQuater();
        obj.register(obj1);
        obj.register(obj2);

        System.out.print("Enter First Team ==> ");
        String t1 = sc.nextLine();
        obj.setTeam1Data(t1);

        System.out.print("Enter Second Team ==> ");
        String t2 = sc.nextLine();
        obj.setTeam2Data(t2);

        String type;
        do {
            System.out.printf("Enter Team get Score %s press 0 or Team %s press 1 ==>",t1,t2);
            type = sc.nextLine();
            obj.setTeamScoreData(type);
        }while(!type.equals(""));
    }
}