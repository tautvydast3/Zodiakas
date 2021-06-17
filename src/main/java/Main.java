import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JFrame = GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Horoskopas"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit of of application
        frame.setResizable(true); //prevents frame from resizing
        frame.setSize(420,420); //set the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon logo = new ImageIcon("src/main/zodiak-logo.png"); //create an ImageIcon
        frame.setIconImage(logo.getImage()); //change icon of frame

        frame.getContentPane().setBackground(Color.decode("#f4f4f4"));

        MyFrame myFrame = new MyFrame();

        JLabel label1 = new JLabel(); // creates a label
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();
        JLabel label10 = new JLabel();
        JLabel label11 = new JLabel();
        JLabel label12 = new JLabel();

        label1.setText("Avinas\n" +
                "03.21 - 04.20\n" +
                "Nesistenkite visko tempti vieni, jeigu užsiimate išsamiu namų, sodybos ar darbo vietos tvarkymu. Dalinkitės pareigomis su šalia esančiais, tarkitės dėl išlaidų. Nenumokite ranka į sveikatos sutrikimus."); // set text of label1
        label2.setText("Jautis\n" +
                "04.21 - 05.21\n" +
                "Tikriausiai šiandien patirsite ypatingų emocinių impulsų. Galite leistis į lengvabūdišką avantiūrą, ką nors vilioti, flirtuoti. Turėtų pagerėti santykiai su vaikais.");
        label3.setText("Dvyniai\n" +
                "05.22 - 06.21\n" +
                "Trokšite geresnių sąlygų, komforto, patogumų. Galbūt kažką pertvarkinėsite. Tai gali kainuoti daugiau, nei apskaičiavote iš anksto. Pasisaugokite sukčių.");
        label4.setText("\n" +
                "Vėžys\n" +
                "06.22 - 07.22\n" +
                "Savo energiją nukreipkite į darbą, mokslą ar kūrybą, o ne į tuščius ginčus, ambicijų demonstravimą. Nuo to priklausys, kaip pakryps pokalbis, turėsiantis įtakos jūsų autoritetui.");
        label5.setText("Liūtas\n" +
                "07.23 - 08.23\n" +
                "Aiškės finansinės perspektyvos, galėsite numatyti, kaip racionaliau panaudoti turimas lėšas. Regis, jums kils ūpas šį bei tą nusipirkti, atsinaujinti. O galbūt rūpinsitės dovana kažkam, kas jums išties rūpi.");
        label6.setText("Mergelė\n" +
                "08.24 - 09.23\n" +
                "Tai gali būti naujų galimybių diena, kai po ilgų pastangų ims ryškėti perspektyvos. Viskas taip trapu, kad lengva sugadinti. Saugokitės klastų, vagysčių, apsinuodijimo.");
        label7.setText("Svarstyklės\n" +
                "09.24 - 10.23\n" +
                "Gana neutrali diena – kaip pasiklosite, taip išsimiegosite. Nelabai tiktų imtis intensyvios veiklos. Pasisaugokite, kad dėl alkoholio ar netinkamų produktų, vaistų vartojimo nekiltų problemų.");
        label8.setText("Skorpionas\n" +
                "10.24 - 11.22\n" +
                "Šiandien teigiamai veiksite aplinkinius ir jie – jus. Žadinsite draugiškumo bei solidarumo jausmus. Verta pamėginti atnaujinti jums svarbius santykius, jeigu jie neseniai patyrė krizę.");
        label9.setText("Šaulys\n" +
                "11.23 - 12.22\n" +
                "Jeigu būtina, šiandien tvarkykite dokumentus, kreipkitės į valdžią dėl leidimų, oficialių raštų, patvirtinimų, atsiskaitymų. Bus nelengva, tačiau naudokitės tomis progomis, kurios įmanomos.");
        label10.setText("Ožiaragis\n" +
                "12.23 - 01.20\n" +
                "Šiandien ypač aktualūs gali būti su išsilavinimu, studijomis, įstatymais, kelionėmis susiję reikalai. Galbūt nustebins kolega ar pažįstamas iš užsienio.");
        label11.setText("Vandenis\n" +
                "01.21 - 02.19\n" +
                "Šiandien ne viskas džiugins. Galbūt kažkas primins negrąžintą skolą, paprašys paslaugos, kurią gana keblu suteikti. Galite įsigyti brokuotą daiktą, dėl jo aiškintis ir pan.");
        label12.setText("Žuvys\n" +
                "02.20 - 03.20\n" +
                "Jūsų nuotaikos ir emocijos bus labai nepastovios. Neleiskite, kad sąmonę užvaldytų nepagrįsti įtarimai, pavydas. Tai prasti palydovai, norint išsaugoti santykius.");

        label1.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label2.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label3.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label4.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label5.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label6.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label7.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label8.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label9.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label10.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label11.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image
        label12.setHorizontalTextPosition(JLabel.RIGHT); // set text LEFT, RIGHT, or CENTER of image


        myFrame.add(label1);
        frame.add(label1);




    }
}
