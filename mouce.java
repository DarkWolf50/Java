import java.awt.*;
import java.awt.event.*;
public class mouce extends Frame implements MouseListener
{
    TextField t1;
    mouce()
    {
        setVisible(true);
        setSize(400,200);
        setLayout(new FlowLayout());
        t1=new TextField(50);
        add(t1);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        int x=me.getX();
        int y=me.getY();
        t1.setText("x pos="+x+"y pos="+y);
    }
    public void mouseExited(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}
    public static void main(String arg[])
    {
        new mouce();
    }
}
