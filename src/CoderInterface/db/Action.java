package CoderInterface.db;

import CoderInterface.inters.ClickEmitter;
import CoderInterface.inters.CountEmitter;

import javax.swing.*;


public class Action {
    ClickEmitter cemitter;
    CountEmitter emitter ;
    public Action(CountEmitter emitter,ClickEmitter cemitter){
        this.emitter = emitter;
        this.cemitter = cemitter;
    }
    public void doSth(){
        String name = JOptionPane.showInputDialog("Please fill your name");
       
        cemitter.emit(name + " ,good bye!"  ); //=> main class htae ka (String name) ko youth mal
        cemitter.alert(name);
        emitter.count(10);
        
    }
}
