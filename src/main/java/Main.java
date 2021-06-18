import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JFrame = GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Horoskopas"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of of application
        frame.setResizable(true); //prevents frame from resizing
        frame.setSize(440,500); //set the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon logo = new ImageIcon("src/main/zodiak-logo.png"); //create an ImageIcon
        frame.setIconImage(logo.getImage()); //change icon of frame

        frame.getContentPane().setBackground(Color.decode("#f4f4f4"));

       // MyFrame myFrame = new MyFrame();

        JLabel labelAries = new JLabel(); // creates a label
        JLabel labelTaurus = new JLabel();
        JLabel labelGemini = new JLabel();
        JLabel labelCancer = new JLabel();
        JLabel labelLeo = new JLabel();
        JLabel labelVirgo = new JLabel();
        JLabel labelLibra = new JLabel();
        JLabel labelScorpio = new JLabel();
        JLabel labelSagittarius = new JLabel();
        JLabel labelCapricorn = new JLabel();
        JLabel labelAquarius = new JLabel();
        JLabel labelPisces = new JLabel();

        labelAries.setText("Avinas\n" +
                "03.21 - 04.20\n" +
                "Nesistenkite visko tempti vieni, jeigu užsiimate išsamiu namų, sodybos ar darbo vietos tvarkymu. Dalinkitės pareigomis su šalia esančiais, tarkitės dėl išlaidų. Nenumokite ranka į sveikatos sutrikimus."); // set text of label1
        labelTaurus.setText("Jautis\n" +
                "04.21 - 05.21\n" +
                "Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais.");
        labelGemini.setText("Dvyniai\n" +
                "05.22 - 06.21\n" +
                "Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių.");
        labelCancer.setText("\n" +
                "Vėžys\n" +
                "06.22 - 07.22\n" +
                "Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui.");
        labelLeo.setText("Liūtas\n" +
                "07.23 - 08.23\n" +
                "Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi.");
        labelVirgo.setText("Mergelė\n" +
                "08.24 - 09.23\n" +
                "Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo.");
        labelLibra.setText("Svarstyklės\n" +
                "09.24 - 10.23\n" +
                "Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų.");
        labelScorpio.setText("Skorpionas\n" +
                "10.24 - 11.22\n" +
                "Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę.");
        labelSagittarius.setText("Šaulys\n" +
                "11.23 - 12.22\n" +
                "Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos.");
        labelCapricorn.setText("Ožiaragis\n" +
                "12.23 - 01.20\n" +
                "Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio.");
        labelAquarius.setText("Vandenis\n" +
                "01.21 - 02.19\n" +
                "Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan.");
        labelPisces.setText("Žuvys\n" +
                "02.20 - 03.20\n" +
                "Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius.");

   //     label1.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image

        JTextField textField1 = new JTextField("Year",20);
        JTextField textField2 = new JTextField("Month",20);
        JTextField textField3 = new JTextField("Day",20);
        JTextField textField4 = new JTextField("4 - asis laukelis");

        textField1.setSize(200,50);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField1.setVisible(true);
        textField2.setSize(200,50);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        textField2.setVisible(true);
        textField3.setSize(200,50);
        textField3.setHorizontalAlignment(JTextField.CENTER);
        textField3.setVisible(true);
        textField4.setSize(0,0);
        textField4.setVisible(true);
        textField4.setHorizontalAlignment(JTextField.CENTER);

        textField1.setBounds(10,10,100,20);
        textField2.setBounds(160,10,100,20);
        textField3.setBounds(310,10,100,20);
        textField4.setBounds(0,0,0,0);
       // textField4.setBounds(320,10,100,20);

//        myFrame.add(textField1);
        frame.add(textField1);
//        myFrame.add(textField2);
        frame.add(textField2);
//        myFrame.add(textField3);
        frame.add(textField3);
//        myFrame.add(textField4);
        frame.add(textField4);

//        myFrame.add(label1);
//        frame.add(label1);




    }
}
