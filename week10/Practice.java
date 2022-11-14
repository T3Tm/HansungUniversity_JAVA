package week10;
import java.awt.*;
import javax.swing.*;


public class Practice extends JFrame{
    public Practice(){
        super("사원 등록");
        this.setSize(350, 420);
        Container c = getContentPane();
        buildGUI(c);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void oneCreate(JPanel j){
        j.add(new JLabel("성                명"));
        j.add(new JTextField(8));
        j.add(new JLabel("성        별"));
        j.add(new JTextField(3));
    }
    public void twoCreate(JPanel j){
        j.add(new JLabel("주민등록번호"));
        j.add(new JTextField(6));
        j.add(new JLabel(" - "));
        j.add(new JTextField(7));
    }
    public void threeCreate(JPanel j){
        j.add(new JLabel("주                소"));
        j.add(new JTextField(22));
    }
    public void fourCreate(JPanel j){
        j.add(new JLabel("부      서      명"));
        j.add(new JTextField(8));
    }
    public void fiveCreate(JPanel j){
        j.add(new JLabel("취                미"));
        j.add(new JTextField(22));
    }
    public void north(JPanel p){
        JPanel one= new JPanel();
        JPanel two= new JPanel();
        JPanel three= new JPanel();
        JPanel four= new JPanel();
        JPanel five= new JPanel();
        JPanel six = new JPanel();
        one.setLayout(new FlowLayout(FlowLayout.LEFT));
        oneCreate(one);
        two.setLayout(new FlowLayout(FlowLayout.LEFT));
        twoCreate(two);
        three.setLayout(new FlowLayout(FlowLayout.LEFT));
        threeCreate(three);
        four.setLayout(new FlowLayout(FlowLayout.LEFT));
        fourCreate(four);
        five.setLayout(new FlowLayout(FlowLayout.LEFT));
        fiveCreate(five);
        six.setLayout(new FlowLayout(FlowLayout.LEFT));
        p.setLayout(new GridLayout(5,1));
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(four);
        p.add(five);
    }
    public void center(JPanel j){
        j.setLayout(new BorderLayout());
        j.add(new JLabel("  자   기   소   개"),BorderLayout.NORTH);
        j.add(new JTextArea(9,22),BorderLayout.CENTER);
    }
    public void south(JPanel j){
        j.setLayout(new FlowLayout(FlowLayout.CENTER));
        j.add(new JButton("저장"));
        j.add(new JButton("종료"));
    }
    public void buildGUI(Container p){
        JPanel north=new JPanel();
        JPanel center = new JPanel();
        JPanel south = new JPanel();
        north(north);
        center(center);
        south(south);
        p.add(north,BorderLayout.NORTH);
        p.add(center,BorderLayout.CENTER);
        p.add(south,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new Practice();
    }
}
