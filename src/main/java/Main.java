
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static int yearInt;
    public static int monthInt;
    public static int dayInt;
    public static String sign = "";

    public static void main(String[] args) {

        int width = 420;
        int height = 420;

        MyFrame frame = new MyFrame(width, height, "Trispalve");
        frame.setSize(height, width);
        frame.setTitle("Horoskopas");

        ImageIcon logo = new ImageIcon("src/main/zodiak-logo.png"); //create an ImageIcon
        frame.setIconImage(logo.getImage()); //change icon of frame

        // sukurti JPanel header
        JPanel header = new JPanel();
        header.setBackground(Color.decode("#f4f4f4"));
        header.setSize(width, height / 10);
        frame.add(header, BorderLayout.PAGE_START);

        // sukurti JPanel body
        JPanel body = new JPanel();
        body.setBackground(Color.decode("#f4f4f4"));
        body.setSize(width, height / 3);
        body.setVisible(true);
        frame.add(body, BorderLayout.CENTER);

        // sukurti JPanel footer
        JPanel footer = new JPanel();
        footer.setBackground(Color.decode("#f4f4f4"));
        footer.setSize(width, height / 3);
        frame.add(footer, BorderLayout.PAGE_END);


        //sukuriu input boxus
        JTextField inpBox1 = new JTextField("", 10);
        JTextField inpBox2 = new JTextField("", 10);
        JTextField inpBox3 = new JTextField("", 10);


        // input boxus pridedu prie header paneles
        header.add(inpBox1);
        header.add(inpBox2);
        header.add(inpBox3);


        //#region zodiaku labels
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
        JLabel labelHoroscope = new JLabel();


        labelAries.setText("<html>Avinas<br> 03.21 - 04.20 <br>" +
                "Nesistenkite visko tempti vieni,<br>" +
                " jeigu užsiimate išsamiu namų, sodybos<br>" +
                " ar darbo vietos tvarkymu. Dalinkitės<br>" +
                " pareigomis su šalia esančiais, tarkitės<br>" +
                " dėl išlaidų. Nenumokite ranka į sveikatos<br>" +
                " sutrikimus.</html>"); // set text of label1
        labelTaurus.setText("<html>Jautis<br> 04.21 - 05.21 <br>" +
                "Tikriausiai šiandien patirsite<br>" +
                " ypatingų emocinių impulsų. Galite<br>" +
                " leistis į lengvabūdišką avantiūrą,<br>" +
                " ką nors vilioti, flirtuoti. Turėtų<br>" +
                " pagerėti santykiai su vaikais.</html>");
        labelGemini.setText("<html>Dvyniai<br> 05.22 - 06.21 <br>" +
                "Trokšite geresnių sąlygų, komforto,<br>" +
                " patogumų. Galbūt kažką pertvarkinėsite.<br>" +
                " Tai gali kainuoti daugiau, nei<br>" +
                " apskaičiavote iš anksto. Pasisaugokite sukčių.</html>");
        labelCancer.setText("<html>Vėžys<br> 06.22 - 07.22 <br>" +
                "Savo energiją nukreipkite į darbą,<br>" +
                " mokslą ar kūrybą, o ne į tuščius ginčus,<br>" +
                " ambicijų demonstravimą. Nuo to<br>" +
                " priklausys, kaip pakryps pokalbis,<br>" +
                " turėsiantis įtakos jūsų autoritetui.</html>");
        labelLeo.setText("<html>Liūtas<br> 07.23 - 08.23 <br>" +
                "Aiškės finansinės perspektyvos, galėsite<br>" +
                " numatyti, kaip racionaliau panaudoti<br>" +
                " turimas lėšas. Regis, jums kils<br>" +
                " ūpas šį bei tą nusipirkti, atsinaujinti.<br>" +
                " O galbūt rūpinsitės dovana kažkam,<br>" +
                " kas jums išties rūpi.</html>");
        labelVirgo.setText("<html>Mergelė<br> 08.24 - 09.23 <br>" +
                "Tai gali būti naujų galimybių diena,<br>" +
                " kai po ilgų pastangų ims ryškėti<br>" +
                " perspektyvos. Viskas taip trapu,<br>" +
                " kad lengva sugadinti. Saugokitės<br>" +
                " klastų, vagysčių, apsinuodijimo.</html>");
        labelLibra.setText("<html>Svarstyklės<br>  09.24 - 10.23 <br>" +
                "Gana neutrali diena – kaip pasiklosite,<br>" +
                " taip išsimiegosite. Nelabai tiktų imtis<br>" +
                " intensyvios veiklos. Pasisaugokite, kad<br>" +
                " dėl alkoholio ar netinkamų produktų,<br>" +
                " vaistų vartojimo nekiltų problemų.</html>");
        labelScorpio.setText("Skorpionas<br> 10.24 - 11.22 <br>" +
                "Šiandien teigiamai veiksite aplinkinius<br>" +
                " ir jie – jus. Žadinsite draugiškumo bei<br>" +
                " solidarumo jausmus. Verta pamėginti<br>" +
                " atnaujinti jums svarbius santykius,<br>" +
                " jeigu jie neseniai patyrė krizę.</html>");
        labelSagittarius.setText("<html>Šaulys<br> 11.23 - 12.22 <br>" +
                "Jeigu būtina, šiandien tvarkykite<br>" +
                " dokumentus, kreipkitės į valdžią dėl<br>" +
                " leidimų, oficialių raštų, patvirtinimų,<br>" +
                " atsiskaitymų. Bus nelengva, tačiau<br>" +
                " naudokitės tomis progomis, kurios įmanomos.</html>");
        labelCapricorn.setText("<html>Ožiaragis<br> 12.23 - 01.20 <br>" +
                "Šiandien ypač aktualūs gali būti<br>" +
                " su išsilavinimu, studijomis, įstatymais,<br>" +
                " kelionėmis susiję reikalai. Galbūt<br>" +
                " nustebins kolega ar pažįstamas iš užsienio.</html>");

        labelAquarius.setText("<html>Vandenis<br>" +
                " 01.21 - 02.19<br>" +
                " Šiandien ne viskas džiugins.<br>" +
                " Galbūt kažkas primins negrąžintą<br>" +
                " skolą, paprašys paslaugos, kurią<br>" +
                " gana keblu suteikti. Galite įsigyti<br>" +
                " brokuotą daiktą, dėl jo aiškintis ir pan.</html>");
        labelPisces.setText("<html>Žuvys<br>" +
                " 02.20 - 03.20<br>" +
                " Jūsų nuotaikos ir emocijos bus<br>" +
                " labai nepastovios. Neleiskite, kad<br>" +
                " sąmonę užvaldytų nepagrįsti įtarimai,<br>" +
                " pavydas. Tai prasti palydovai, norint<br>" +
                " išsaugoti santykius.</html>");

        //#endregion


        //Sukuriu mygtukus

        JButton btnFind = new JButton("Find");
        JButton btnClear = new JButton("Clear");
        btnFind.setSize(width / 3, height / 10);
        btnClear.setSize(width / 3, height / 10);
        // mygtukus pridedu prie footer paneles

        footer.add(btnFind);
        footer.add(btnClear);

        frame.setVisible(true);


        btnFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                yearInt = Integer.parseInt(inpBox1.getText());
                monthInt = Integer.parseInt(inpBox2.getText());
                dayInt = Integer.parseInt(inpBox3.getText());


        //#region horoskopo datu logika

        if (monthInt == 1) {
            if (dayInt < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        } else if (monthInt == 2) {
            if (dayInt < 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        } else if (monthInt == 3) {
            if (dayInt < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        } else if (monthInt == 4) {
            if (dayInt < 20)
                sign = "Aries";
            else
                sign = "Taurus";
        } else if (monthInt == 5) {
            if (dayInt < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        } else if (monthInt == 6) {
            if (dayInt < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        } else if (monthInt == 7) {
            if (dayInt < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        } else if (monthInt == 8) {
            if (dayInt < 23)
                sign = "Leo";
            else
                sign = "Virgo";
        } else if (monthInt == 9) {
            if (dayInt < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        } else if (monthInt == 10) {
            if (dayInt < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        } else if (monthInt == 11) {
            if (dayInt < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        } else if (monthInt == 12) {
            if (dayInt < 22)
                sign = "Sagittarius";
            else
                sign = "Capricorn";

        }
        //#endregion


        if (sign == "Aries") {
            labelHoroscope.setText(labelAries.getText());
        }
        if (sign == "Taurus") {
            labelHoroscope.setText(labelTaurus.getText());
        }
        if (sign == "Gemini") {
            labelHoroscope.setText(labelGemini.getText());
        }
        if (sign == "Cancer") {
            labelHoroscope.setText(labelCancer.getText());
        }
        if (sign == "Leo") {
            labelHoroscope.setText(labelLeo.getText());
        }
        if (sign == "Virgo") {
            labelHoroscope.setText(labelVirgo.getText());
        }
        if (sign == "Libra") {
            labelHoroscope.setText(labelLibra.getText());
        }
        if (sign == "Scorpio") {
            labelHoroscope.setText(labelScorpio.getText());
        }
        if (sign == "Sagittarius") {
            labelHoroscope.setText(labelSagittarius.getText());
        }
        if (sign == "Capricorn") {
            labelHoroscope.setText(labelCapricorn.getText());
        }
        if (sign == "Aquarius") {
            labelHoroscope.setText(labelAquarius.getText());
        }
        if (sign == "Pisces") {
            labelHoroscope.setText(labelPisces.getText());
        }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inpBox1.setText("");
                inpBox2.setText("");
                inpBox3.setText("");
            }
        });
        body.add(labelHoroscope);
        labelHoroscope.setSize(width / 2, height / 2);
        System.out.println(sign);


    }
}
