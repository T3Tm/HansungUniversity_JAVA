import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *
 *  텍스트 필드는 엔터키 입력되면 나와야함.
 *  라디오 버튼이랑 체크박스는 선택시 바로 나와야함.
 *
 */
public class RegMember3 extends JFrame{
    private JTextArea text;
    private JCheckBox movie,listenMusic,picture,exercise;
    private JTextField name,depart,address,front,end;
    private JRadioButton man,woman;
    private String word;
    private String[] gender={"남","여"};
    RegMember3(){
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
        movie.addItemListener(new ButtonClick());
        listenMusic.addItemListener(new ButtonClick());
        picture.addItemListener(new ButtonClick());
        exercise.addItemListener(new ButtonClick());
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
        depart.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent a){
                text.append("부서명 : "+a.getActionCommand()+"\n");
            }
        });
        return temp;
    }
    private JPanel addressPanel() {
        JPanel temp = new JPanel();
        address =new JTextField(22);
        address.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent t){
                text.append("주소 : "+t.getActionCommand()+"\n");
            }
        });
        temp.setLayout(new FlowLayout(FlowLayout.LEFT));
        temp.add(new JLabel("주                소"));
        temp.add(address);
        return temp;
    }
    private JPanel residentPanel() {
        JPanel temp = new JPanel();
        front = new JTextField(6);
        end = new JTextField(7);
        front.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent v){
                word=text.getText();
                int value =word.indexOf("호 :");//주민등록 번호 뒤에를 입력했는지 확인
                int end = word.indexOf("-");
                if (value ==-1){
                    text.append("주민등록번호 : " +v.getActionCommand()+" - \n");
                }else{
                    text.insert(v.getActionCommand()+" ",value+4);
                }
            }
        });
        end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent j){
                word=text.getText();
                int value =word.indexOf("-");//주민등록 번호 앞에를 입력했는지 확인
                if (value == -1){
                    //전에 입력했던 주민등록번호가 없었던 것
                    text.append("주민등록번호 : - "+j.getActionCommand()+"\n");
                }else{//전에 입력했던 적이 있었으므로 그 인덱스에 넣는다.
                    text.insert(j.getActionCommand(), value+2);
                }

            }
        });
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
        man.addItemListener(new Radiobutton());
        woman.addItemListener(new Radiobutton());
        ButtonGroup group= new ButtonGroup();
        group.add(man);
        group.add(woman);
        name = new JTextField(8);
        name.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.append("이름 : " +e.getActionCommand()+"\n");
            }
        });
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
        JLabel pr = new JLabel("  자   기   소   개");
        text = new JTextArea(9,22);
        temp.setLayout(new BorderLayout());
        temp.add(pr,BorderLayout.NORTH);
        temp.add(text,BorderLayout.CENTER);
        return temp;
    }
    class ButtonClick implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            JCheckBox[] hobby = {movie,listenMusic,picture,exercise};
            JCheckBox temp=(JCheckBox)e.getItem();//temp 변수에 저장
            String word=text.getText();//전에 쓰던 문장들 갖고 와서 성별 문장 없애줘야함.
            String Hobby=new String();
            int Idx=word.indexOf("취");//없으면 그냥 바로 추가하면 됨.
            if(Idx!=-1){//-1이 아니면 전에 입력 된 적이 있는 거임. 그거 없애주자.
                String front=word.substring(0,Idx); //word를 앞 뒤로 자를 거임
                int endIdx;
                for(endIdx=Idx;word.charAt(endIdx)!='\n';endIdx++);//끝 인덱스 자르기
                String end=word.substring(endIdx+1); // 두 개 붙이면
                text.setText(front+end);
            }
            text.append("취미 : ");
            for (JCheckBox value : hobby) {
                if (value.isSelected()) { // 선택 돼있으면서 value 값이랑 같을 때 value 값이 출력됨.
                    text.append(value.getActionCommand()+" ");
                }
            }
            text.append("\n");
        }
    }
    class Radiobutton implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            JRadioButton temp=(JRadioButton)e.getItem();
            String word=text.getText();//전에 쓰던 문장들 갖고 와서 성별 문장 없애줘야함.
            int Idx=word.indexOf("성");//없으면 그냥 바로 추가하면 됨.
            if(Idx!=-1){//-1이 아니면 전에 입력 된 적이 있는 거임. 그거 없애주자.
                System.out.println(Idx);
                String front=word.substring(0,Idx); //word를 앞 뒤로 자를 거임
                String end=word.substring(Idx+7); // 두 개 붙이면
                text.setText(front+end);
            }
            for(String value:gender){
                if(temp.getActionCommand().equals(value) && temp.isSelected()){
                    text.append("성별 : "+value+"\n");
                }
            }
        }
    }
    public static void main(String[] args) {
        new RegMember3();
    }
}
