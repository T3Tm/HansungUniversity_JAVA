import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *
 * 저장 버튼을 누르면   자기소개가 뜨게끔 만들어야함.
 */
public class RegMember2 extends JFrame{
    private JTextArea text;
    private JCheckBox movie,listenMusic,picture,exercise;
    private JTextField name,depart,address,front,end;
    private JRadioButton man,woman;
    RegMember2(){
        super("사원 등록");
        this.setSize(350, 420);
        Container c = getContentPane();
        BuildGUI(c);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void BuildGUI(Container c){
        c.add(Northpanel(),BorderLayout.NORTH);
        c.add(Centerpanel(),BorderLayout.CENTER);
        c.add(Southpanel(),BorderLayout.SOUTH);
    }
    private JPanel Northpanel(){
        JPanel temp = new JPanel();
        temp.setLayout(new GridLayout(5,1));
        temp.add(namePanel());
        temp.add(residentPanel());
        temp.add(addressPanel());
        temp.add(departPanel());
        temp.add(hobbyPanel());
        return temp;
    }
    private JPanel hobbyPanel() {
        JPanel temp = new JPanel();
        movie = new JCheckBox("영화");
        listenMusic = new JCheckBox("음악감상");
        picture = new JCheckBox("사진");
        exercise = new JCheckBox("운동");
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("취                미"));
        temp.add(movie);
        temp.add(listenMusic);
        temp.add(picture);
        temp.add(exercise);
        return temp;
    }
    private JPanel departPanel() {
        JPanel temp = new JPanel();
        depart = new JTextField(9);
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("부     서      명"));
        temp.add(depart);
        return temp;
    }
    private JPanel addressPanel() {
        JPanel temp = new JPanel();
        address =new JTextField(22);
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("주                소"));
        temp.add(address);
        return temp;
    }
    private JPanel residentPanel() {
        JPanel temp = new JPanel();
        front = new JTextField(6);
        end = new JTextField(7);
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("주민등록번호"));
        temp.add(front);
        temp.add(new JLabel("  -  "));
        temp.add(end);
        return temp;
    }
    private JPanel namePanel() {
        JPanel temp = new JPanel();
        man = new JRadioButton("남");
        woman = new JRadioButton("여");
        ButtonGroup group= new ButtonGroup();
        group.add(man);
        group.add(woman);
        name = new JTextField(8);
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("성                 명"));
        temp.add(name);
        temp.add(new JLabel("성      별"));
        temp.add(man);
        temp.add(woman);
        return temp;
    }
    private JPanel Centerpanel(){
        JPanel temp = new JPanel();
        JLabel pr = new JLabel("  자   기  소   개");
        text = new JTextArea(9,22);
        temp.setLayout(new BorderLayout());
        temp.add(pr,BorderLayout.NORTH);
        temp.add(text,BorderLayout.CENTER);
        return temp;
    }
    private JPanel Southpanel(){
        JPanel temp = new JPanel();
        JButton save =new JButton("저장");
        JButton exit = new JButton("종료");
        temp.setLayout(new FlowLayout(FlowLayout.CENTER));
        temp.add(save);
        temp.add(exit);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                StringBuilder word = new StringBuilder();
                String username=name.getText(); // 이름 입력한 것
                String department = depart.getText();//부서 입력한 것
                String addressText = address.getText();//주소 입력한 것
                String residentFront = front.getText();//주민번호 앞
                String residentEnd = end.getText(); //주민번호 뒷자리
                Boolean manTrue = man.isSelected();
                Boolean moviecheck = movie.isSelected();
                Boolean listenmusicCheck= listenMusic.isSelected();
                Boolean pictureCheck = picture.isSelected();
                Boolean exerciseCheck = exercise.isSelected();

                word.append("이름 : "+username);
                word.append("     성별 : ");
                if (manTrue) word.append("남자\n");
                else word.append("여자\n");
                word.append("주민등록번호 : "+residentFront + " - " + residentEnd+"\n");
                word.append("주소 : " + addressText +"\n");
                word.append("부서명 : "+department+"\n");
                word.append("취미 : ");
                if (moviecheck) word.append("영화보기 ");
                if (listenmusicCheck) word.append("음악듣기 ");
                if (pictureCheck) word.append("사진찍기 ");
                if (exerciseCheck) word.append("운동하기 ");
                word.append("\n");
                text.setText(word.toString());//결과창에는 띄워줘야할 내용
            }
        });
        exit.addActionListener(new ActionListener(){ // 종료버튼 눌리면 꺼지게 하기
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(1);
            }
        });
        return temp;
    }
    public static void main(String[] args) {
        new RegMember2();
    }
}
