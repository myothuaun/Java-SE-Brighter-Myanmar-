package CoderInterface;

import CoderInterface.db.Action;
import CoderInterface.inters.ClickEmitter;
import CoderInterface.inters.CountEmitter;

import javax.swing.*;

public class Main implements ClickEmitter,CountEmitter {
    public static void main(String[] args){
        Action action = new Action(new Main(),new Main());
        action.doSth();

    }

    @Override
    public void emit(String name) {
        System.out.println("your name is " + name);

    }

    @Override
    public void alert(String alert) {
        JOptionPane.showMessageDialog(null,alert);

    }

	@Override
	public void count(int i) {
		// TODO Auto-generated method stub
		System.out.println("count is = " + i);
		
	}

}
