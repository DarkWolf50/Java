import java.awt.*;
import java.awt.event.*;
public class Font_Frame extends Frame implements ItemListener
{
	Label l1,l2,l3;
    TextField t1;
    Choice c1,c2;
    Checkbox cb1,cb2,cb3;
    Font_Frame()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(5,1));
        l1=new Label("Font");
        l2=new Label("Style");
        l3=new Label("Size");
        t1=new TextField(10);
        c1=new Choice();
        c1.add("Serif");
        c1.add("SansSerif");
        c1.add("Monospaced");
        c2=new Choice();
        for(int i=1;i<11;i++)
            c2.add(""+i);
        cb1=new Checkbox("Bold");
        cb2=new Checkbox("Italic");
        cb3=new Checkbox("Underline");
        add(l1); add(l2);
        add(c1); add(cb1);
        add(l3); add(cb2);
        add(c2); add(cb3);
        add(t1);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String fname=c1.getSelectedItem();
        int size=Integer.parseInt(c2.getSelectedItem());
        if(cb1.getState())
            t1.setFont(new Font(fname,Font.BOLD,size));
        if(cb2.getState())
            t1.setFont(new Font(fname,Font.ITALIC,size));
        if(cb3.getState())
            t1.setFont(new Font(fname,Font.ROMAN_BASELINE,size));

    }

    public static void main(String arg[])
    {
        new Font_Frame();
    }

}