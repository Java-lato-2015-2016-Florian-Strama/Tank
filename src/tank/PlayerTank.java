package tank;

import java.awt.Image;
import javax.swing.ImageIcon;


public class PlayerTank {
//public enum tankstate = { MOVING, DESTROING,STAING };
    
    Image iconup;
    Image icondown;
    Image iconright;
    Image iconleft;
    Image icon;
    int x,y,staryX,staryY;
    public  PlayerTank(){
        x=170;
        y=450;
        staryX=x;
        staryY=y;
        iconup=new ImageIcon("grafiki\\Gracz\\tankup.png").getImage();
        icondown=new ImageIcon("grafiki\\Gracz\\tankdown.png").getImage();
        iconright=new ImageIcon("grafiki\\Gracz\\tankright.png").getImage();
        iconleft=new ImageIcon("grafiki\\Gracz\\tankleft.png").getImage();
        icon=iconup;
    }
}
