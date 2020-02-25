/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.Action;


public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GPS gps=new GPS();
      gps.px=100;
      gps.py=100;
      Camera cam =new Camera();
      cam.state="dirty";
//        Action act=reflexVacumAgent_text(gps,cam);
//    }
//    private static Action reflexVacumAgent_text(GPS gps,Camera cam){
//       Action ret=new Action();
//       if(cam.state.equals("dirty")){
//           ret.action=ActionType.vacum;
//       }
//       return  ret;
//        
    }
}
